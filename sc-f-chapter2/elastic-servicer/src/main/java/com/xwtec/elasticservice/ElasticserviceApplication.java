package com.xwtec.elasticservice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xwtec.elasticservice.entity.Product;
import com.xwtec.elasticservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class ElasticserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElasticserviceApplication.class, args);
    }


    @Autowired
    private ProductService productService;

    private ObjectMapper mapper = new ObjectMapper();

    @RequestMapping("/findbyprodcategory")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        List<Product> products = productService.findByProductCategory("数码电子");
        try {
            System.out.println("商品分类查询数据: " + mapper.writeValueAsString(products));
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "success";
    }
}
