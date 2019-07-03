package com.c4c.oyfy;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.c4c.oyfy.app.TestController;
import com.c4c.oyfy.domain.service.TestService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OyfyApplicationTests {
    private MockMvc mockMvc;

    @Autowired
    TestController target;

    @MockBean
    TestService mockTestService;

    @Before
    public void setup() {
      mockMvc = MockMvcBuilders.standaloneSetup(target).build();
    }

	@Test
	public void contextLoads() throws Exception {
	    // test()メソッドが3を返すようにモック化
	    when(mockTestService.test()).thenReturn(3);
	    mockMvc.perform(get("/"))
        .andExpect(status().isOk())
        .andExpect(view().name("test"));
	}

}
