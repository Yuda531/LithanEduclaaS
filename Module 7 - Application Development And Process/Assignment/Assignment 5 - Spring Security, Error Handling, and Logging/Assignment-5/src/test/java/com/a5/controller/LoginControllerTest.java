package com.a5.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.servlet.ModelAndView;

import com.a5.entity.User;
import com.a5.service.UserServiceImpl;


@RunWith(MockitoJUnitRunner.class)
public class LoginControllerTest {
	
	@InjectMocks
	LoginController loginController;
	
	@Mock
	UserServiceImpl userService;
	
	@Before
	public void setUp() throws Exception{
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testLoadLoginPage() {
		ModelAndView mav = new ModelAndView();
		String loginViewName = loginController.onLogin();
		mav.setViewName(loginViewName);
		Assert.assertEquals("login", mav.getViewName());
	}
	
	@Test
	public void testLoadRegisterPage() {
		ModelAndView mav = new ModelAndView();
		User user = new User();
		
		String RegisterViewName = loginController.showRegistrationForm(user);
		mav.setViewName(RegisterViewName);
		Assert.assertEquals("Register", mav.getViewName());
	}

}
