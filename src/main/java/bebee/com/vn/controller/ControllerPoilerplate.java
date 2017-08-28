package bebee.com.vn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nqlong on 28-Aug-17.
 */
@RestController
public class ControllerPoilerplate {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    @GetMapping(value = "/hello")
    public String helloMessage() {
        return "Hello word";
    }
}
