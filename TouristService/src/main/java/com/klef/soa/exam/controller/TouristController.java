
package com.klef.soa.exam.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TouristController {

    @Autowired
    private Environment environment;

    @GetMapping("/tourist")
    public Map<String, Object> gettourist() {

        Map<String, Object> result = new HashMap<>();

        result.put("message", "Tourist Service is running");
        result.put("service", "TouristService");
        result.put("port", environment.getProperty("local.server.port"));

        return result;
    }
}
