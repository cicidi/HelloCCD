
package com.cicidi.truecar.model.database;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "adjusted_fields",
    "dealer_price",
    "listing_locality",
    "listing_count",
    "price",
    "date"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Trends {

    @JsonProperty("adjusted_fields")
    public List<String> adjustedFields = new ArrayList<String>();
    @JsonProperty("dealer_price")
    public List<Integer> dealerPrice = new ArrayList<Integer>();
    @JsonProperty("listing_locality")
    public List<String> listingLocality = new ArrayList<String>();
    @JsonProperty("listing_count")
    public List<Integer> listingCount = new ArrayList<Integer>();
    @JsonProperty("price")
    public List<Integer> price = new ArrayList<Integer>();
    @JsonProperty("date")
    public List<String> date = new ArrayList<String>();

}
