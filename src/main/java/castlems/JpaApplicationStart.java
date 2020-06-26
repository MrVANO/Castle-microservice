package castlems;

import castlems.entity.Frame;
import castlems.service.FrameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@EnableResourceServer
@SpringBootApplication
@Controller
public class JpaApplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(JpaApplicationStart.class, args);
    }
}