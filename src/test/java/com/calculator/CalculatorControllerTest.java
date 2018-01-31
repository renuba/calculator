package com.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.calculator.entity.ResponseVO;
import com.calculator.entity.UserInputVO;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CalculatorControllerTest {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testAdd() throws Exception {

		ObjectMapper mapper = new ObjectMapper();
		UserInputVO userInputVO = mapper.readValue(new ClassPathResource("jsons/UserInputDataCorrect").getFile(),UserInputVO.class);

		// Testing POST :: addition
		ResponseEntity<ResponseVO> response = restTemplate.postForEntity("/calculator/add", userInputVO, ResponseVO.class);
		ResponseVO responseVO = response.getBody();
		assertEquals(91, responseVO.getResult());
		assertNotNull(responseVO.getMessage());
		
}
	
	@Test
	public void testSub() throws Exception {

		ObjectMapper mapper = new ObjectMapper();
		UserInputVO userInputVO = mapper.readValue(new ClassPathResource("jsons/UserInputDataCorrect").getFile(),UserInputVO.class);

		// Testing POST :: substraction
		ResponseEntity<ResponseVO> response = restTemplate.postForEntity("/calculator/subs", userInputVO, ResponseVO.class);
		ResponseVO responseVO = response.getBody();
		assertEquals(89, responseVO.getResult());
		assertNotNull(responseVO.getMessage());
		
}
	
	@Test
	public void testmultiply() throws Exception {

		ObjectMapper mapper = new ObjectMapper();
		UserInputVO userInputVO = mapper.readValue(new ClassPathResource("jsons/UserInputDataCorrect").getFile(),UserInputVO.class);

		// Testing POST :: multiply
		ResponseEntity<ResponseVO> response = restTemplate.postForEntity("/calculator/multiply", userInputVO, ResponseVO.class);
		ResponseVO responseVO = response.getBody();
		assertEquals(90, responseVO.getResult());
		assertNotNull(responseVO.getMessage());
		
}
}
