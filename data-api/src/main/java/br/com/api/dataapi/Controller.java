package br.com.api.dataapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Value("${ondeEstouRodando}")
    private String appId;

    @RequestMapping(value = "/data", method = RequestMethod.GET)
    public String data() {
        return "Estou rodando no servidor " + appId;
    }

}
