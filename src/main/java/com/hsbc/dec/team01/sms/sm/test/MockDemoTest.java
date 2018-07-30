package com.hsbc.dec.team01.sms.sm.test;

import com.hsbc.dec.team01.sms.sm.controlelrImpl.MicroServiceControllerImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 * @Author:Kiltalaw
 * @Description:
 * @Date:2018/7/30 11:17
 * @Modify:
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(MicroServiceControllerImpl.class)
@WebAppConfiguration
public class MockDemoTest {
    @Autowired
    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void hello() throws Exception{
        mvc.perform(get("/hello"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
