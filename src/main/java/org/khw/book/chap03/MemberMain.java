package org.khw.book.chap03;

public class MemberMain { 
 
 
 	public static void main(String[] args) { 
 		MemberDao memberDao = new MemberDao(); 
 		//MemberRegisterService regService = new MemberRegisterService(memberDao); 
 		MemberRegisterService regService = new MemberRegisterService(); 
		regService.setMemberDao(memberDao); 
 
 
 		// registerRequest ÃÊ±âÈ­ 
 		RegisterRequest req = new RegisterRequest(); 
 		req.setEmail("khw1234@naver.com"); 
 		req.setPassword("xxxx"); 
 		req.setName("khw"); 
 
 
 		 
 		// È¸¿ø µî·Ï 
 		regService.regist(req); 
 	} 
 } 
