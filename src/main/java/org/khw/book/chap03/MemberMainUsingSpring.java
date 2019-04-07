package org.khw.book.chap03;

import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext; 
 
 
 public class MemberMainUsingSpring { 
 
 
 	public static void main(String[] args) { 
 		ApplicationContext ctx = new ClassPathXmlApplicationContext("chap03.xml"); 
 		MemberRegisterService regService = ctx.getBean("memberRegisterService", 
 				MemberRegisterService.class); 
 
 
 		// registerRequest ÃÊ±âÈ­ 
 		RegisterRequest req = new RegisterRequest(); 
 		req.setEmail("khw1234@naver.com"); 
 		req.setPassword("xxxx"); 
 		req.setName("khw"); 
 
 
 		// È¸¿ø µî·Ï 
 		regService.regist(req); 
 	} 
 } 
