package org.khw.article2;

import java.util.List; 
 
 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
 
 
 /** 
  * articleDao를 사용해서 글 목록, 조회, 추가, 수정, 삭제를 한다. 
  *  
  * @author Jacob 
  */ 
 @Service 
 public class ArticleService { 
 	@Autowired 
 	ArticleDao articleDao; 
 
 
 	public void setArticleDao(ArticleDao articleDao) { 
 		this.articleDao = articleDao; 
 	} 
 
 
 	/** 
 	 * 글 목록 
 	 */ 
 	public void listArticles() { 
 		List<Article> articles = articleDao.listArticles(); 
 		System.out.println(articles); 
 	} 
 
 
 	/** 
 	 * 글 조회 
 	 */ 
 	public void getArticle() { 
 		Article article = articleDao.getArticle("3"); 
 		System.out.println(article); 
 	} 
 
 
 	/** 
 	 * 글 등록 
 	 */ 
 	public void addArticle() { 
 		Article article = new Article(); 
 		article.setTitle("전세계 백인우월주의 테러 급증, 범인들간 결속ㆍ모방추세 강화 "); 
 		article.setContent(".........기사내용........................"); 
 		article.setUserId("13"); // 원래는 ID생성시 사용했던 번호를 입력하도록 코딩해야됨 
 		article.setName("김형욱"); 
 		if (articleDao.addArticle(article) > 0) 
 			System.out.println("글을 추가했습니다."); 
 		else 
 			System.out.println("글을 추가하지 못했습니다."); 
 	} 
 
 	/** 
 	 * 글 수정 
 	 */ 
 	public void updateArticle() { 
 		Article article = new Article(); 
 		article.setArticleId("7"); 
 		article.setTitle("This is modified title."); 
 		article.setContent("This is modified content"); 
 		if (articleDao.updateArticle(article) > 0) 
 			System.out.println("글을 수정했습니다."); 
 		else 
 			System.out.println("글을 수정하지 못했습니다."); 
 	} 
 
 
 	/** 
 	 * 글 삭제 
 	 */ 
 	public void deleteArticle() { 
 		if (articleDao.deleteArticle("8") > 0) 
 			System.out.println("글을 삭제했습니다."); 
 		else 
 			System.out.println("글을 삭제하지 못했습니다."); 
 	} 
 } 
