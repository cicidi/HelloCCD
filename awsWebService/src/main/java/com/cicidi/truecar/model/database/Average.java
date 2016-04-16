
package com.cicidi.truecar.model.database;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "price",
    "percentage"
})
public class Average {

    @JsonProperty("price")
    private Integer price;
    @JsonProperty("percentage")
    private Integer percentage;

    /**
     * 
     * @return
     *     The price
     */
    @JsonProperty("price")
    public Integer getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    @JsonProperty("price")
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * 
     * @return
     *     The percentage
     */
    @JsonProperty("percentage")
    public Integer getPercentage() {
        return percentage;
    }

    /**
     * 
     * @param percentage
     *     The percentage
     */
    @JsonProperty("percentage")
    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

}
