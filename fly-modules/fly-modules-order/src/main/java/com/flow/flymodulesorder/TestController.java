package com.flow.flymodulesorder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${flow.a}")
    private String flow;

    @RequestMapping(value = "/getFlow")
    public String getFlow() {
        System.out.printf(flow);
        return flow;
    }
}
