package be.sgerard.incubator.boot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Sebastien Gerard
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String welcome() {
        return "welcome";
    }
}
