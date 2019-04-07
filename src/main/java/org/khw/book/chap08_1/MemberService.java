package org.khw.book.chap08_1;

import java.util.List; 

 
import org.apache.logging.log4j.LogManager; 
import org.apache.logging.log4j.Logger; 
import org.khw.book.chap03.Member; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
 
 
 @Service 
 public class MemberService { 
 	Logger logger = LogManager.getLogger(); 
 
 
 	@Autowired 
 	MemberDao memberDao; 
 
 
 	/** 
 	 * memberDao setter for injection 
 	 */ 
 	public void setMemberDao(MemberDao memberDao) { 
 		this.memberDao = memberDao; 
 	} 
 
 
 	public void selectAll() { 
 		List<Member> members = memberDao.selectAll(0, 100); 
 		logger.debug(members); 
 	} 
 
 
 	public void updateMember() { 
 		Member member = memberDao.selectByEmail("jacob@irafe.com"); 
 		member.setPassword("b"); 
 		memberDao.update(member); 
 		logger.debug("Update complete."); 
 	} 
 
 
 	public void insertMember() { 
 		Member member = new Member(); 
 		member.setEmail("rlaguddnr2340@naver.com"); 
 		member.setPassword("a"); 
 		member.setName("±èÇü¿í"); 
 		memberDao.insert(member); 
 		logger.debug("Insert complete."); 
 	} 
 } 
