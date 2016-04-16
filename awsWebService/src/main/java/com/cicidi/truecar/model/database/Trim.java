
package com.cicidi.truecar.model.database;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties({"trimId"})
@JsonPropertyOrder({
    "most_popular",
    "total_unconfigured_msrp",
    "price_report_url",
    "city_mpg",
    "zag_trim_id",
    "hwy_mpg",
    "trim_id",
    "popularity",
    "trimline",
    "chrome_trim_id",
    "default_exterior_color_id",
    "engine_type",
    "encoded_trim_id",
    "name",
    "prompts"
})
public class Trim {

    @JsonProperty("most_popular")
    private Boolean mostPopular;
    @JsonProperty("total_unconfigured_msrp")
    private Integer totalUnconfiguredMsrp;
    @JsonProperty("price_report_url")
    private String priceReportUrl;
    @JsonProperty("city_mpg")
    private String cityMpg;
    @JsonProperty("zag_trim_id")
    private Integer zagTrimId;
    @JsonProperty("hwy_mpg")
    private String hwyMpg;
    @JsonProperty("trim_id")
    private Integer trimId;
    @JsonProperty("popularity")
    private Integer popularity;
    @JsonProperty("trimline")
    private String trimline;
    @JsonProperty("chrome_trim_id")
    private Integer chromeTrimId;
    @JsonProperty("default_exterior_color_id")
    private Integer defaultExteriorColorId;
    @JsonProperty("engine_type")
    private String engineType;
    @JsonProperty("encoded_trim_id")
    private String encodedTrimId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("prompts")
    private Prompts prompts;

    public Boolean getMostPopular() {
        return mostPopular;
    }

    public void setMostPopular(Boolean mostPopular) {
        this.mostPopular = mostPopular;
    }

    public Integer getTotalUnconfiguredMsrp() {
        return totalUnconfiguredMsrp;
    }

    public void setTotalUnconfiguredMsrp(Integer totalUnconfiguredMsrp) {
        this.totalUnconfiguredMsrp = totalUnconfiguredMsrp;
    }

    public String getPriceReportUrl() {
        return priceReportUrl;
    }

    public void setPriceReportUrl(String priceReportUrl) {
        this.priceReportUrl = priceReportUrl;
    }

    public String getCityMpg() {
        return cityMpg;
    }

    public void setCityMpg(String cityMpg) {
        this.cityMpg = cityMpg;
    }

    public Integer getZagTrimId() {
        return zagTrimId;
    }

    public void setZagTrimId(Integer zagTrimId) {
        this.zagTrimId = zagTrimId;
    }

    public String getHwyMpg() {
        return hwyMpg;
    }

    public void setHwyMpg(String hwyMpg) {
        this.hwyMpg = hwyMpg;
    }

    public Integer getTrimId() {
        return trimId;
    }

    public void setTrimId(Integer trimId) {
        this.trimId = trimId;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public String getTrimline() {
        return trimline;
    }

    public void setTrimline(String trimline) {
        this.trimline = trimline;
    }

    public Integer getChromeTrimId() {
        return chromeTrimId;
    }

    public void setChromeTrimId(Integer chromeTrimId) {
        this.chromeTrimId = chromeTrimId;
    }

    public Integer getDefaultExteriorColorId() {
        return defaultExteriorColorId;
    }

    public void setDefaultExteriorColorId(Integer defaultExteriorColorId) {
        this.defaultExteriorColorId = defaultExteriorColorId;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getEncodedTrimId() {
        return encodedTrimId;
    }

    public void setEncodedTrimId(String encodedTrimId) {
        this.encodedTrimId = encodedTrimId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Prompts getPrompts() {
        return prompts;
    }

    public void setPrompts(Prompts prompts) {
        this.prompts = prompts;
    }
}
