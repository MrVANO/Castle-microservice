package castlems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HealthCheckController {

    @ResponseBody
    @RequestMapping(value = "/healthcheck", method = RequestMethod.GET)
    public String healthCheck() {
        return "Healthcheck v 0.1";
    }
}