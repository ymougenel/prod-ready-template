package com.ymougenel.api_template;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(HelloController.class)
public class HelloControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnHelloMessageWithName() throws Exception {
        mockMvc.perform(get("/hello")
                        .param("name", "Alice"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello Alice"));
    }
}