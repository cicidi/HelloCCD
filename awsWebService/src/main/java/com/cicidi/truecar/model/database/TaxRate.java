
package com.cicidi.truecar.model.database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "rates",
    "totalRate"
})
public class TaxRate {

    @JsonProperty("rates")
    private List<Rate> rates = new ArrayList<Rate>();
    @JsonProperty("totalRate")
    private Double totalRate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The rates
     */
    @JsonProperty("rates")
    public List<Rate> getRates() {
        return rates;
    }

    /**
     * 
     * @param rates
     *     The rates
     */
    @JsonProperty("rates")
    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }

    /**
     * 
     * @return
     *     The totalRate
     */
    @JsonProperty("totalRate")
    public Double getTotalRate() {
        return totalRate;
    }

    /**
     * 
     * @param totalRate
     *     The totalRate
     */
    @JsonProperty("totalRate")
    public void setTotalRate(Double totalRate) {
        this.totalRate = totalRate;
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
