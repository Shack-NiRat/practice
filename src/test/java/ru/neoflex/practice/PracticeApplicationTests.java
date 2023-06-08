package ru.neoflex.practice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
class PracticeApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void minusTest() throws Exception {
		this.mockMvc
				.perform(get("/minus/5/2"))
				.andDo(print())
				.andExpect(content().string(containsString("3.0")));
	}

	@Test
	public void sumTest() throws  Exception{
		this.mockMvc
				.perform(get("/plus/5/2"))
				.andDo(print())
				.andExpect(content().string(containsString("7.0")));
	}

}
