package com.cicidi.truecar.util;

import com.cicidi.truecar.Constants;
import com.cicidi.truecar.model.database.Car;
import org.apache.log4j.Logger;

/**
 * Created by jianming on 4/12/16.
 */
public class Util {
    private static final Logger logger = Logger.getLogger(Util.class);

    public static String getUrl(Car car) {
        String url = Constants.website + "/prices-new/" + car.getMake() + "/" + car.getModel() + "-pricing" + "/" + car.getYear();
        logger.info("generate url: " + url.toLowerCase());
        return url.toLowerCase();

    }
}
