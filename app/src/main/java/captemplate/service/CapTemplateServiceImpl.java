package captemplate.service;

import captemplate.domain.services.CapTemplateService;
import org.springframework.stereotype.Service;

@Service
public class CapTemplateServiceImpl implements CapTemplateService {

    public String getResponse(String request) {
        return "Success12345";
    }

}
