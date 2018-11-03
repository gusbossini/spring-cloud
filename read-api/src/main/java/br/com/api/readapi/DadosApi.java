package br.com.api.readapi;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("data-service")
public interface DadosApi {

    @RequestMapping(value = "/data", method = RequestMethod.GET)
    String data();

}
