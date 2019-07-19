package com.xwtec.serviceribbon.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ElasticService {
    @Autowired
    RestTemplate restTemplate;

    public String findbyprodcategory(String name) {
        return restTemplate.getForObject("http://SERVICE-ELASTIC/findbyprodcategory",String.class);
    }
}
