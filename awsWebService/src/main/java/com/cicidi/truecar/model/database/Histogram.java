
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
    "historicalDays",
    "min",
    "buckets",
    "max",
    "totalTransactionCount"
})
public class Histogram {

    @JsonProperty("historicalDays")
    private Integer historicalDays;
    @JsonProperty("min")
    private Integer min;
    @JsonProperty("buckets")
    private List<Bucket> buckets = new ArrayList<Bucket>();
    @JsonProperty("max")
    private Integer max;
    @JsonProperty("totalTransactionCount")
    private Integer totalTransactionCount;

    /**
     * 
     * @return
     *     The historicalDays
     */
    @JsonProperty("historicalDays")
    public Integer getHistoricalDays() {
        return historicalDays;
    }

    /**
     * 
     * @param historicalDays
     *     The historicalDays
     */
    @JsonProperty("historicalDays")
    public void setHistoricalDays(Integer historicalDays) {
        this.historicalDays = historicalDays;
    }

    /**
     * 
     * @return
     *     The min
     */
    @JsonProperty("min")
    public Integer getMin() {
        return min;
    }

    /**
     * 
     * @param min
     *     The min
     */
    @JsonProperty("min")
    public void setMin(Integer min) {
        this.min = min;
    }

    /**
     * 
     * @return
     *     The buckets
     */
    @JsonProperty("buckets")
    public List<Bucket> getBuckets() {
        return buckets;
    }

    /**
     * 
     * @param buckets
     *     The buckets
     */
    @JsonProperty("buckets")
    public void setBuckets(List<Bucket> buckets) {
        this.buckets = buckets;
    }

    /**
     * 
     * @return
     *     The max
     */
    @JsonProperty("max")
    public Integer getMax() {
        return max;
    }

    /**
     * 
     * @param max
     *     The max
     */
    @JsonProperty("max")
    public void setMax(Integer max) {
        this.max = max;
    }

    /**
     * 
     * @return
     *     The totalTransactionCount
     */
    @JsonProperty("totalTransactionCount")
    public Integer getTotalTransactionCount() {
        return totalTransactionCount;
    }

    /**
     * 
     * @param totalTransactionCount
     *     The totalTransactionCount
     */
    @JsonProperty("totalTransactionCount")
    public void setTotalTransactionCount(Integer totalTransactionCount) {
        this.totalTransactionCount = totalTransactionCount;
    }

}
