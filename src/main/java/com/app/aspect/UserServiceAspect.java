package com.app.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserServiceAspect
{

	@Before(value = "execution(* com.app.service.UserService.*(..)) and args(name,userId)")
	public void beforeAdvice(JoinPoint joinPoint, String name, String userId)
	{
		System.out.println("Before method:" + joinPoint.getSignature());

		System.out.println("Creating user with username - " + name + " and userId - " + userId);
	}

	@After(value = "execution(* com.app.service.UserService.*(..)) and args(name,userId)")
	public void afterAdvice(JoinPoint joinPoint, String name, String userId)
	{
		System.out.println("After method:" + joinPoint.getSignature());

		System.out.println("Successfully created user with username - " + name + " and userId - " + userId);
	}
}
