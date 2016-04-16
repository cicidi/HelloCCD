package com.cicidi.common.domain.model;

public class TrueCarResponse<T> extends Response {
    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    private T result;
}