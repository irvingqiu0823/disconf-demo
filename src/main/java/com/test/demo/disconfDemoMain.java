package com.test.demo;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.config.userConfig;

public class disconfDemoMain {
	
	protected static final Logger LOGGER = LoggerFactory.getLogger(disconfDemoMain.class);

    private static ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    private static userConfig u = (userConfig)ctx.getBean("userBean");

	public static void main(String[] args) {
        
        Timer t=new Timer();
        t.schedule(new TimerTask(){
			@Override
			public void run() {
				LOGGER.info(u.getName());
			}
        },new Date() ,1000);//每隔1秒输出
	}

}