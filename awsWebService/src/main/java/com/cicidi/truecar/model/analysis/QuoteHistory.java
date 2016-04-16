package com.cicidi.truecar.model.analysis;

/**
 * Created by wchen00 on 11/15/15.
 */
public class QuoteHistory {
    //0     1       2       3       4           5       6       7   8       9       10          11
    //Year	Make	Model	Trim	PriceType	Fees	Price	OTD	locale	MyPrice	SalesPeson	From
    String[] fieldList = new String[12];

    public String[] getFieldList() {
        return fieldList;
    }

    public void setFieldList(String[] fieldList) {
        this.fieldList = fieldList;
    }
}
