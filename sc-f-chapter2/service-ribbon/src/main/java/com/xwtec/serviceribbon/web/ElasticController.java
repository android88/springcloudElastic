package com.xwtec.serviceribbon.web;

import com.xwtec.serviceribbon.service.ElasticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ElasticController {
    @Autowired
    ElasticService elasticService;

    @RequestMapping(value = "/elastic/findbyprodcategory")
    public String findbyprodcategory(@RequestParam String name){
        return elasticService.findbyprodcategory(name);
    }
}
