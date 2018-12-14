package com.newzorktimes.newzorktimes.Controller;


import com.newzorktimes.newzorktimes.model.Charge;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class NZLController {


    @Value("${charge.endpoint.create}")
    private String chargeServiceEndPoint;

    @PostMapping("/create")
    public void createCharge(){


            Charge charge=new Charge(100,"USD","tok_visa","email");
            RestTemplate restTemplate1 = new RestTemplate();
            restTemplate1.postForObject(chargeServiceEndPoint,charge,Charge.class);



    }
}
