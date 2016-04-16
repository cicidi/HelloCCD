package com.cicidi.common.domain.model;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.Serializable;

public abstract class ServiceObject implements Serializable {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public int hashCode() {
        try {
            return objectMapper.writeValueAsString(this).hashCode();
        } catch
                (JsonProcessingException e) {
            throw new RuntimeException("Can not map object");
        }
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {

        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, true);
        try {
            return objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Can not map object");
        }
    }
}