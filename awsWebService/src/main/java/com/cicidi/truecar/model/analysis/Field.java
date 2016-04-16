package com.cicidi.truecar.model.analysis;

/**
 * Created by wchen00 on 11/15/15.
 */
public enum Field {
    Year(1), Make(2), Model(3), Trim(4), PriceType(5), Fees(6), Price(7), OTD(8), MyPrice(9), SalesPeson(10), From(11);


    private int seq;

    Field(int i) {
        this.seq = i;
    }

    public static Field getFieldBySeq(int i) {
        for (Field field : values()) {
            if (field.getSeq() == i) {
                return field;
            }
        }
        return null;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }
}
