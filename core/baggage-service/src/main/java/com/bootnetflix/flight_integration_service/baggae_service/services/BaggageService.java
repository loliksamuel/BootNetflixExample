package com.bootnetflix.flight_integration_service.baggae_service.services;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Ext_IdanF on 22/07/2015.
 */
@FeignClient("baggage-service")
public interface BaggageService {

    @RequestMapping(method = RequestMethod.GET, value = "/ee")
    List<String> getBaggageListByFlightId();


}
