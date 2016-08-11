package com.wd.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Page;

import com.wd.data.ResponseData;
import com.wd.data.UserLoginInfo;
import com.wd.domain.QuestionEntity;
import com.wd.domain.UserInfoEntity;
import com.wd.service.QuestionService;
import com.wd.service.UserInfoService;

/**
 * TestDao
 * 
 * @author xwj
 * @version 创建时间：2016年8月11日
*/
public class TestDao {
	QuestionService questionService=null;
	UserInfoService userInfoService=null;
	ApplicationContext ioc=null;
	{
		ioc=new ClassPathXmlApplicationContext("spring-context.xml");
		//userInfoService = ioc.getBean(UserInfoService.class);
		questionService= ioc.getBean(QuestionService.class);
	}
	
	@Test
	public void test() {
		//ResponseData modifyEmail = userInfoService.modifyEmail(new UserLoginInfo());
		Page<QuestionEntity> questionPage = questionService.getQuestionPage();
		//List<QuestionEntity> content = questionPage.getContent();
		long totalElements = questionPage.getTotalElements();
		System.out.println(totalElements);
		//System.out.println(content.size());
		//System.out.println(ioc);
		//System.out.println(modifyEmail);
	}

}
