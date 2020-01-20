package com.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class IndexController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("indexClient.do")
    public String index(){
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://microservice-order/index.do",String.class);
        return responseEntity.getBody();
    }
}
