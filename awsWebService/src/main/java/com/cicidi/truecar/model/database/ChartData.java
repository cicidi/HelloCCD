
package com.cicidi.truecar.model.database;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "locale",
    "prices",
    "confidence",
    "goodPrice",
    "goodPriceMin",
    "histogram",
    "greatPriceMin",
    "confidenceWithin",
    "description",
    "callout"
})
public class ChartData {

    @JsonProperty("locale")
    private String locale;
    @JsonProperty("prices")
    private Prices prices;
    @JsonProperty("confidence")
    private Double confidence;
    @JsonProperty("goodPrice")
    private Integer goodPrice;
    @JsonProperty("goodPriceMin")
    private Integer goodPriceMin;
    @JsonProperty("histogram")
    private Histogram histogram;
    @JsonProperty("greatPriceMin")
    private Integer greatPriceMin;
    @JsonProperty("confidenceWithin")
    private Double confidenceWithin;
    @JsonProperty("description")
    private Object description;
    @JsonProperty("callout")
    private Callout callout;

    /**
     * 
     * @return
     *     The locale
     */
    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    /**
     * 
     * @param locale
     *     The locale
     */
    @JsonProperty("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * 
     * @return
     *     The prices
     */
    @JsonProperty("prices")
    public Prices getPrices() {
        return prices;
    }

    /**
     * 
     * @param prices
     *     The prices
     */
    @JsonProperty("prices")
    public void setPrices(Prices prices) {
        this.prices = prices;
    }

    /**
     * 
     * @return
     *     The confidence
     */
    @JsonProperty("confidence")
    public Double getConfidence() {
        return confidence;
    }

    /**
     * 
     * @param confidence
     *     The confidence
     */
    @JsonProperty("confidence")
    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    /**
     * 
     * @return
     *     The goodPrice
     */
    @JsonProperty("goodPrice")
    public Integer getGoodPrice() {
        return goodPrice;
    }

    /**
     * 
     * @param goodPrice
     *     The goodPrice
     */
    @JsonProperty("goodPrice")
    public void setGoodPrice(Integer goodPrice) {
        this.goodPrice = goodPrice;
    }

    /**
     * 
     * @return
     *     The goodPriceMin
     */
    @JsonProperty("goodPriceMin")
    public Integer getGoodPriceMin() {
        return goodPriceMin;
    }

    /**
     * 
     * @param goodPriceMin
     *     The goodPriceMin
     */
    @JsonProperty("goodPriceMin")
    public void setGoodPriceMin(Integer goodPriceMin) {
        this.goodPriceMin = goodPriceMin;
    }

    /**
     * 
     * @return
     *     The histogram
     */
    @JsonProperty("histogram")
    public Histogram getHistogram() {
        return histogram;
    }

    /**
     * 
     * @param histogram
     *     The histogram
     */
    @JsonProperty("histogram")
    public void setHistogram(Histogram histogram) {
        this.histogram = histogram;
    }

    /**
     * 
     * @return
     *     The greatPriceMin
     */
    @JsonProperty("greatPriceMin")
    public Integer getGreatPriceMin() {
        return greatPriceMin;
    }

    /**
     * 
     * @param greatPriceMin
     *     The greatPriceMin
     */
    @JsonProperty("greatPriceMin")
    public void setGreatPriceMin(Integer greatPriceMin) {
        this.greatPriceMin = greatPriceMin;
    }

    /**
     * 
     * @return
     *     The confidenceWithin
     */
    @JsonProperty("confidenceWithin")
    public Double getConfidenceWithin() {
        return confidenceWithin;
    }

    /**
     * 
     * @param confidenceWithin
     *     The confidenceWithin
     */
    @JsonProperty("confidenceWithin")
    public void setConfidenceWithin(Double confidenceWithin) {
        this.confidenceWithin = confidenceWithin;
    }

    /**
     * 
     * @return
     *     The description
     */
    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The callout
     */
    @JsonProperty("callout")
    public Callout getCallout() {
        return callout;
    }

    /**
     * 
     * @param callout
     *     The callout
     */
    @JsonProperty("callout")
    public void setCallout(Callout callout) {
        this.callout = callout;
    }

}
