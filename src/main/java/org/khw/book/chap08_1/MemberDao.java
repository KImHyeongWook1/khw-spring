package org.khw.book.chap08_1;

import java.util.List; 
 
 
import org.khw.book.chap03.Member; 
 
 
 /** 
  * p.184 [����Ʈ 8.2] MemberDao �� interface�� ����<br> 
  * ȸ�� ���̺��� �����ϴ� Data Access Object 
  *  
  * @author Jacob 
  */ 
 public interface MemberDao { 
 	/** 
 	 * �̸��Ϸ� ȸ�� ���� ������ 
 	 */ 
 	Member selectByEmail(String email); 
 
 
 	/** 
 	 * ȸ������ ���� 
 	 */ 
 	void insert(Member member); 
 
 
 	/** 
 	 * ȸ������ ���� 
 	 */ 
 	void update(Member member); 
 
 
 	/** 
 	 * ȸ�� ��� 
 	 */ 
 	List<Member> selectAll(int offset, int count); 
 } 
