package com.dhalder.rtrp;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.dhalder.rtrp.controllers.RTRPConversionController;
import com.dhalder.rtrp.services.ConversionServices;

public class RTRPControllerTest {


	@InjectMocks
	private RTRPConversionController controller;
	
	@Mock
	private ConversionServices conversionServices;
	
	
	@BeforeEach
	void setUp() throws Exception{
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	final void getConversionRules() {
//		fail("Not yet implemented");
		
		try {
			when(conversionServices.getConversionrules()).thenReturn(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
