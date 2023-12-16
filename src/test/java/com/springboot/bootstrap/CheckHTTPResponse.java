package com.springboot.bootstrap;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT )
public class CheckHTTPResponse {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;


    @Test
    public void shouldPassIfStringMatche() {
        assertEquals("Hwllo!!",
                testRestTemplate.getForObject("http://localhost:" + port + "/", String.class));

    }

    @Test
    public void shouldPassForRegisterEndpoint() {
        assertEquals("Response for /register",
                testRestTemplate.getForObject("http://localhost:" + port + "/register", String.class));

    }

    @Test
    public void shouldPassForLoginEndpoint() {
        assertEquals("Response for /login",
                testRestTemplate.getForObject("http://localhost:" + port + "/login", String.class));

    }

    @Test
    public void shouldPassForCartEndpoint() {
        assertEquals("Response for /cart",
                testRestTemplate.getForObject("http://localhost:" + port + "/cart", String.class));

    }
}
