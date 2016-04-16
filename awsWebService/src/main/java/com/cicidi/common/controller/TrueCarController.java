package com.cicidi.common.controller;

import com.cicidi.common.domain.model.Response;
import com.cicidi.common.domain.model.TrueCarRequest;
import com.cicidi.common.vo.TruecarAnalysisViewObject;
import com.cicidi.truecar.model.database.Car;
import com.cicidi.truecar.service.CarInformationService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class TrueCarController {

    @Autowired
    @Qualifier("carInformationService")
    CarInformationService carInformationService;
    ObjectMapper mapper = new ObjectMapper();

    @RequestMapping(value = "/truecar", method = RequestMethod.GET)
    public
    @ResponseBody
    String getCarInfo(@RequestParam(value = "make") String make,
                      @RequestParam(value = "model") String model,
                      @RequestParam(value = "year") String year,
                      @RequestParam(value = "zipCode") String zipCode,
                      ModelMap modelMap) throws Exception {
        Car car = new Car(make, model, year);
        TruecarAnalysisViewObject truecarAnalysisViewObject = new TruecarAnalysisViewObject(car);
        TrueCarRequest trueCarRequest = new TrueCarRequest(car, zipCode);
        Response response = carInformationService.get(trueCarRequest);
//        String reult
        return response.toString();
    }
}