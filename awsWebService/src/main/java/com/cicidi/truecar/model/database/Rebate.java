
package com.cicidi.truecar.model.database;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "amount",
        "incentive_id",
        "end_date",
        "payment_driver_id",
        "name"
})
public class Rebate {

    @JsonProperty("amount")
    private Integer amount;
    @JsonProperty("incentive_id")
    private String incentiveId;
    @JsonProperty("end_date")
    private String endDate;
    @JsonProperty("payment_driver_id")
    private Integer paymentDriverId;
    @JsonProperty("name")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Rebate() {
    }

    /**
     * @param amount
     * @param name
     * @param incentiveId
     * @param endDate
     * @param paymentDriverId
     */
    public Rebate(Integer amount, String incentiveId, String endDate, Integer paymentDriverId, String name) {
        this.amount = amount;
        this.incentiveId = incentiveId;
        this.endDate = endDate;
        this.paymentDriverId = paymentDriverId;
        this.name = name;
    }

    /**
     * @return The amount
     */
    @JsonProperty("amount")
    public Integer getAmount() {
        return amount;
    }

    /**
     * @param amount The amount
     */
    @JsonProperty("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * @return The incentiveId
     */
    @JsonProperty("incentive_id")
    public String getIncentiveId() {
        return incentiveId;
    }

    /**
     * @param incentiveId The incentive_id
     */
    @JsonProperty("incentive_id")
    public void setIncentiveId(String incentiveId) {
        this.incentiveId = incentiveId;
    }

    /**
     * @return The endDate
     */
    @JsonProperty("end_date")
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate The end_date
     */
    @JsonProperty("end_date")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * @return The paymentDriverId
     */
    @JsonProperty("payment_driver_id")
    public Integer getPaymentDriverId() {
        return paymentDriverId;
    }

    /**
     * @param paymentDriverId The payment_driver_id
     */
    @JsonProperty("payment_driver_id")
    public void setPaymentDriverId(Integer paymentDriverId) {
        this.paymentDriverId = paymentDriverId;
    }

    /**
     * @return The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
