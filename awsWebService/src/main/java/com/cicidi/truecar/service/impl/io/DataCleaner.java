package com.cicidi.truecar.service.impl.io;

import com.cicidi.truecar.model.database.DataModel;
import com.cicidi.truecar.model.database.Rebate;
import com.cicidi.truecar.model.database.Trim;
import com.cicidi.truecar.model.database.WidgetModel;
import com.cicidi.truecar.webServiceClient.RestClient;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by wchen00 on 11/14/15.
 */
public class DataCleaner {
    private static final Logger logger = Logger.getLogger(DataCleaner.class);
    ObjectMapper mapper = new ObjectMapper();

    public DataModel getCharData(String str) {
        DataModel dataModel = null;
        String key_start = "(function(s)";
        String key_end = "})(TrueCar.s);";

        String temp = str.substring(str.indexOf(key_start), str.indexOf(key_end));
        String chartData = temp.substring(temp.indexOf("abp") - 2, temp.lastIndexOf("$"));
        chartData = chartData.substring(0, chartData.lastIndexOf(");"));
        String temp_left = temp.substring(temp.lastIndexOf("$"));
        String widgetData = temp_left.substring(temp_left.indexOf("data") - 2, temp_left.lastIndexOf("});"));
        try {
            logger.debug("charData json : " + chartData);
            logger.debug("widgetData json : " + widgetData);
            dataModel = mapper.readValue(chartData, new TypeReference<DataModel>() {
            });
            WidgetModel widgetModel = mapper.readValue(widgetData, new TypeReference<WidgetModel>() {
            });
            dataModel.setWigetModel(widgetModel);
            logger.info("Successfuly parse Data");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataModel;
    }

    public Rebate getRebateData(String str) {
        final String start = "[{";
        final String end = "}];";
        final String key = "TC.s.incsData";
        String rebateJson = str.substring(str.indexOf(key));
        Rebate rebateModel = null;
        try {
            logger.debug("charData json : " + rebateJson);
            rebateModel = mapper.readValue(rebateJson, new TypeReference<Rebate>() {
            });
            logger.info("Successfuly parse rebate Data");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rebateModel;
    }


    public List<Trim> getAllTrims(String str) {
        String key_start = "allSlimTrimsForModel";
        String key_end = " TC.s.trimlinePrompts";
        String temp = str.substring(str.indexOf(key_start), str.indexOf(key_end));
        String json = temp.substring(temp.indexOf("["), temp.lastIndexOf("]") + 1);
        List<Trim> trimList = null;
        try {
            trimList = mapper.readValue(json, new TypeReference<List<Trim>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.info("Trim size: " + trimList.size());
        return trimList;
    }

    public String getAllBranchLink(String str) {

        // the pattern we want to search for
        Pattern p = Pattern.compile("<footer id=\"tc_footer\" role=\"contentinfo\"> (\\S+)</footer>");
        Matcher m = p.matcher(str);
        String codeGroup = null;
        // if we find a match, get the group
        if (m.find()) {
            // get the matching group
            codeGroup = m.group(1);

            // print the group
            System.out.format("'%s'\n", codeGroup);
        }
        return codeGroup;
    }

    public static void main(String[] args) {
        System.out.println(new DataCleaner().getAllBranchLink(new RestClient().call("https://www.truecar.com/prices-new/ford/")));
    }

}