package org.khw.article;

import org.springframework.context.ConfigurableApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext; 
 
 
 /** 
  * ArticleService¸¦ Å×½ºÆ®ÇÏ´Â main 
  *  
  * @author Jacob 
  */ 
 public class ArticleMainUsingSpring { 
 
 
 	public static void main(String[] args) { 
 		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("article.xml"); 
 		ArticleService articleService = context.getBean("articleService", ArticleService.class); 
 		context.close(); 
 
 
 		articleService.addArticle(); 
 		articleService.listArticles(); 
 	} 
 } 
