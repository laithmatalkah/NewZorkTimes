package com.newzorktimes.newzorktimes;


import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class NZLEndPointTest {


    private  RestTemplate restTemplate=new RestTemplate();


    @Rule
    public WireMockRule wireMockRule = new WireMockRule();



    @Test
    public void apiCreateTest(){

        wireMockRule.givenThat(get(urlEqualTo("/create"))
                .willReturn(aResponse()
                        .withStatus(200)));

        String serverUrl = buildApiMethodUrl();
        ResponseEntity<String> response = restTemplate.getForEntity(serverUrl,
                String.class
        );
        Assert.assertEquals(response.getStatusCode(),HttpStatus.OK);

    }
    private String buildApiMethodUrl() {
        return String.format("http://localhost:%d/create",
                this.wireMockRule.port()
        );
    }



}
