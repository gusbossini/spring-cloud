package br.com.api.readapi;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private DadosApi dadosApi;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "dataFail")
    public String dados() {
        return dadosApi.data();
    }

    private String dataFail() {
        return "Nao encontrei nenhum servidor mas nao retornei erro.";
    }
}
