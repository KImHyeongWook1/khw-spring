package org.khw.book.chap08;

import java.util.List; 
 
 
import org.apache.logging.log4j.LogManager; 
import org.apache.logging.log4j.Logger; 
import org.khw.book.chap03.Member; 
 
 
 public class MemberService { 
 	Logger logger = LogManager.getLogger(); 
 
 
 	MemberDao memberDao = null; 
 
 
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
 		member.setEmail("aa3@naver.com"); 
 		member.setPassword("a1"); 
 		member.setName("È«±æµ¿"); 
 		memberDao.insert(member); 
 		logger.debug("Insert complete."); 
 	} 
 } 
