
package com.cicidi.truecar.model.database;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "available"
})
public class Abp {

    @JsonProperty("available")
    private Boolean available;

    /**
     * 
     * @return
     *     The available
     */
    @JsonProperty("available")
    public Boolean getAvailable() {
        return available;
    }

    /**
     * 
     * @param available
     *     The available
     */
    @JsonProperty("available")
    public void setAvailable(Boolean available) {
        this.available = available;
    }

}
