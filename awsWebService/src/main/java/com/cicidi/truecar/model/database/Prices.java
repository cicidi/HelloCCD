
package com.cicidi.truecar.model.database;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "msrp",
    "average",
    "dealer",
    "invoice"
})
public class Prices {

    @JsonProperty("msrp")
    private Msrp msrp;
    @JsonProperty("average")
    private Average average;
    @JsonProperty("dealer")
    private Object dealer;
    @JsonProperty("invoice")
    private Invoice invoice;

    /**
     * 
     * @return
     *     The msrp
     */
    @JsonProperty("msrp")
    public Msrp getMsrp() {
        return msrp;
    }

    /**
     * 
     * @param msrp
     *     The msrp
     */
    @JsonProperty("msrp")
    public void setMsrp(Msrp msrp) {
        this.msrp = msrp;
    }

    /**
     * 
     * @return
     *     The average
     */
    @JsonProperty("average")
    public Average getAverage() {
        return average;
    }

    /**
     * 
     * @param average
     *     The average
     */
    @JsonProperty("average")
    public void setAverage(Average average) {
        this.average = average;
    }

    /**
     * 
     * @return
     *     The dealer
     */
    @JsonProperty("dealer")
    public Object getDealer() {
        return dealer;
    }

    /**
     * 
     * @param dealer
     *     The dealer
     */
    @JsonProperty("dealer")
    public void setDealer(Object dealer) {
        this.dealer = dealer;
    }

    /**
     * 
     * @return
     *     The invoice
     */
    @JsonProperty("invoice")
    public Invoice getInvoice() {
        return invoice;
    }

    /**
     * 
     * @param invoice
     *     The invoice
     */
    @JsonProperty("invoice")
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

}
