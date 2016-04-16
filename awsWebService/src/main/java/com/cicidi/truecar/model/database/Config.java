
package com.cicidi.truecar.model.database;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
//@JsonPropertyOrder({
//    "trends"
//})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Config {

    public String getTrends() {
        return trends;
    }

    public void setTrends(String trends) {
        this.trends = trends;
    }

    //    @JsonProperty("trends")
//    @JsonIgnoreProperties(ignoreUnknown = true)
    private String trends;



}
