
package com.cicidi.truecar.model.database;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "data",
    "config"
})
public class WidgetModel {

    @JsonProperty("data")
    public Data data;
    @JsonProperty("config")
    public Config config;
}
