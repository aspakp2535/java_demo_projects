package com.rest.ex1.SpringRest_1;

import org.springframework.http.*;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SpringRestController {
   @Autowired
   RestTemplate restTemplate;

   @RequestMapping(value = "/template/products")
   public String getProductList() {
      HttpHeaders headers = new HttpHeaders();
      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
      HttpEntity <String> entity = new HttpEntity<String>(headers);
      
      return restTemplate.exchange("http://localhost:8080/product", HttpMethod.GET, entity, String.class).getBody();
   }
}
