package com.sapient.byrajan.fbleague.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@RunWith(MockitoJUnitRunner.class)
public class RestClientTest {

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private RestClient empService = new RestClient();

    String url = "https://apiv3.apifootball.com/?action=get_standings&league_id=302&APIkey=9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978";
    String result = "{\n" +
            "        \"country_id\": \"44\",\n" +
            "        \"country_name\": \"England\",\n" +
            "        \"country_logo\": \"https://apiv3.apifootball.com/badges/logo_country/44_england.png\"\n" +
            "    }";
    @Test
    public void getResponse_whenGetIsCalled_shouldReturnMockedObject() {
        String res = "{\n" +
                "        \"country_id\": \"44\",\n" +
                "        \"country_name\": \"England\",\n" +
                "        \"country_logo\": \"https://apiv3.apifootball.com/badges/logo_country/44_england.png\"\n" +
                "    }";
        Mockito.when(restTemplate.getForEntity(url,String.class))
          .thenReturn(new ResponseEntity(res, HttpStatus.OK));

        Assert.assertEquals(res, result);
    }

}