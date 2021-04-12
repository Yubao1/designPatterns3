package com.zhulu.test2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {
	Star realStar;

	public StarHandler(Star realStar) {
		this.realStar = realStar;
	}

	public void confer() {
		System.out.println("ProxyStar confer");
	}

	public void signContract() {
		System.out.println("ProxyStar signContract");
	}

	public void bookTicket() {
		System.out.println("ProxyStar bookTicket");
	}

	public void collectMoney() {
		System.out.println("ProxyStar collectMoney");
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = null;
		confer();
		signContract();
		bookTicket();
		if (method.getName().equals("sign")) {
		result = method.invoke(realStar, args);
		}
		collectMoney();
		return result;
	}

}
