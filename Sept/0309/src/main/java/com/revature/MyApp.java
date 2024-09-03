package com.revature;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		TennisCoach tennisObj=context.getBean("tennisCoach",TennisCoach.class);
		System.out.println(tennisObj.getDailyWorkout());
        System.out.println(tennisObj.getDailyFortune());
	}

}
