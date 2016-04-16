package com.cicidi.truecar.runner;


import org.apache.log4j.Logger;


/**
 * Created by wchen00 on 11/14/15.
 */
public class JobController {
    private static final Logger logger = Logger.getLogger(JobController.class);

//    public static void main(String[] args) throws Exception {
//
//        List<Query> queryList = new ArrayList<Query>();
//        JobController jobController = new JobController();
////        queryList.add(new Query(Constants.crv_2015));
////        queryList.add(new Query(Constants.crv_2016));
////        queryList.add(new Query(Constants.rav4_2015));
////        queryList.add(new Query(Constants.rav4_2016));
////        queryList.add(new Query(Constants.accord_2015));
////        queryList.add(new Query(Constants.accord_2016));
////        queryList.add(new Query(Constants.camy_2015));
////        queryList.add(new Query(Constants.carmy_2016));
////        queryList.add(new Query(Constants.civic_2015));
////        queryList.add(new Query(Constants.civic_2016));
////        queryList.add(new Query(Constants.forester_2016));
////        queryList.add(new Query(Constants.edge_2015));
////        queryList.add(new Query(Constants.edge_2016));
////        queryList.add(new Query(Constants.escape_2015));
////        queryList.add(new Query(Constants.grand_cherokee_2015));
////        queryList.add(new Query(Constants.grand_cherokee_2016));
////        queryList.add(new Query(Constants.x4_2016));
//        queryList.add(Constants.fusion_2016);
//
//        for (Query query : queryList) {
//            jobController.research(query);
//        }
//        Calculation calculation = new Calculation();
//        calculation.updateQuote();
//
//
//    }

//    public void research(Query query) throws Exception {
//        RestClient client = new RestClient();
//        DataCleaner dataClean = new DataCleaner();
//        Calculation calculation = new Calculation();/**/
//        String url = query.getUrl();
//        String response = client.call(url);
//        List<DataModel> allModelInfo = new ArrayList<DataModel>();
//        List<Trim> trimList = dataClean.getAllTrims(response);
//        for (Trim trim : trimList) {
//            logger.info("Rest call to " + Constants.website + "/" + trim.getPriceReportUrl());
//            String responseToParticalarModel = client.call(Constants.website + "/" + trim.getPriceReportUrl());
//            logger.info("Loaded" + trim.getName() + " data");
//            DataModel dataModelToParticalarModel = dataClean.getCharData(responseToParticalarModel);
//            logger.info("processing" + dataModelToParticalarModel.getYearMakeModel() + " " + trim.getName() + " data");
//            dataModelToParticalarModel.setCurrent(trim.getName());
//            allModelInfo.add(dataModelToParticalarModel);
//        }
//
//        logger.info("All trim been load");
//
//        logger.info(calculation.getAverage(allModelInfo));
//        String result = calculation.compare(allModelInfo);
//        logger.info(result);
//        DataWriter dataLoader = new DataWriter();
//        dataLoader.writeCarDetail(result, query);
//
//    }

}
