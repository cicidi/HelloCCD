package com.cicidi.truecar.webServiceClient;

import com.cicidi.truecar.Constants;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.MediaType;
import java.util.HashMap;

/**
 * Created by wchen00 on 11/14/15.
 */
@Component
public class RestClient {
    private static final XLogger logger = XLoggerFactory.getXLogger(RestClient.class);

    public String call(String url) {
        Client client = Client.create();

        WebResource webResource = client
                .resource(url);

        ClientResponse response = webResource.accept(MediaType.TEXT_PLAIN)
                .get(ClientResponse.class);

        if (response.getStatus() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + response.getStatus());
        }

        String output = response.getEntity(String.class);

        logger.debug("Output from Server .... \n", output);
        return output;
    }

//    public String generateURL_TAXAPI_ByState(String state, String city) {
//        String url = "https://taxrates.api.avalara.com/address?country=usa&state=" + state + "&city=" + city + "&postal=00000&street=123+3rd+ave&apikey=" + Constants.API_KEY;
//        return url;
//    }

    public String generateURL_TAXAPI_ByPost(String postal) {
        String url = "https://taxrates.api.avalara.com:443/postal?country=usa&postal=" + postal + "&apikey=" + Constants.API_KEY;

        return url;
    }


    public HashMap findTrimMapping() {
        return null;

    }


}
