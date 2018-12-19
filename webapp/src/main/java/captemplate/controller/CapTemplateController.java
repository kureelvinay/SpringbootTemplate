package captemplate.controller;

import captemplate.service.CapTemplateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CapTemplateController {

   @Autowired
   CapTemplateServiceImpl serviceImpl;

    @GetMapping("/api/capTemplate/v1")
    public String retrieveResponse(){

        return serviceImpl.getResponse("test");
    }

    @GetMapping("/api/capTemplate/v2")
    public String retrieveResponse1(){

        return "Success";
    }

    @GetMapping("/hi")
    public String retrieveResponse2(){

        return "Success1111";
    }
}
