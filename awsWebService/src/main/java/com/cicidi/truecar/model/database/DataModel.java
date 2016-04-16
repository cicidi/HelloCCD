
package com.cicidi.truecar.model.database;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "abp",
        "chartData",
        "dealerCount",
        "yearMakeModel",
        "cityState"
})
public class DataModel {

    @JsonProperty("abp")
    private Abp abp;
    @JsonProperty("chartData")
    private List<ChartData> chartData = new ArrayList<ChartData>();
    @JsonProperty("dealerCount")
    private Integer dealerCount;
    @JsonProperty("yearMakeModel")
    private String yearMakeModel;
    @JsonProperty("cityState")
    private String cityState;
    @JsonProperty("wigetModel")
    private WidgetModel wigetModel;
    @JsonProperty("current")
    private String current;

    /**
     * @return The abp
     */
    @JsonProperty("abp")
    public Abp getAbp() {
        return abp;
    }

    /**
     * @param abp The abp
     */
    @JsonProperty("abp")
    public void setAbp(Abp abp) {
        this.abp = abp;
    }

    /**
     * @return The chartData
     */
    @JsonProperty("chartData")
    public List<ChartData> getChartData() {
        return chartData;
    }

    /**
     * @param chartData The chartData
     */
    @JsonProperty("chartData")
    public void setChartData(List<ChartData> chartData) {
        this.chartData = chartData;
    }

    /**
     * @return The dealerCount
     */
    @JsonProperty("dealerCount")
    public Integer getDealerCount() {
        return dealerCount;
    }

    /**
     * @param dealerCount The dealerCount
     */
    @JsonProperty("dealerCount")
    public void setDealerCount(Integer dealerCount) {
        this.dealerCount = dealerCount;
    }

    /**
     * @return The yearMakeModel
     */
    @JsonProperty("yearMakeModel")
    public String getYearMakeModel() {
        return yearMakeModel;
    }

    /**
     * @param yearMakeModel The yearMakeModel
     */
    @JsonProperty("yearMakeModel")
    public void setYearMakeModel(String yearMakeModel) {
        this.yearMakeModel = yearMakeModel;
    }

    /**
     * @return The cityState
     */
    @JsonProperty("cityState")
    public String getCityState() {
        return cityState;
    }

    /**
     * @param cityState The cityState
     */
    @JsonProperty("cityState")
    public void setCityState(String cityState) {
        this.cityState = cityState;
    }

    @JsonProperty("wigetModel")
    public WidgetModel getWigetModel() {
        return wigetModel;
    }

    @JsonProperty("wigetModel")
    public void setWigetModel(WidgetModel wigetModel) {
        this.wigetModel = wigetModel;
    }
    @JsonProperty("current")
    public String getCurrent() {
        return current;
    }
    @JsonProperty("current")
    public void setCurrent(String current) {
        this.current = current;
    }
}
