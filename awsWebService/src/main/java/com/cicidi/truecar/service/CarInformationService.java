package com.cicidi.truecar.service;

import com.cicidi.common.domain.model.Request;
import com.cicidi.common.domain.model.Response;

/**
 * Created by jianming on 4/11/16.
 */
//@Component
public interface CarInformationService {
    public Response get(Request request) throws Exception;
}
