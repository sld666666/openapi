package com.sld.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by diwu.sld on 2017/6/20.
 */
@RestController
public class GatewayControl {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return "hello wolrd";
    }
}
