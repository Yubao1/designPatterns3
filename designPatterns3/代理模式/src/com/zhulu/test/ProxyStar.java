package com.zhulu.test;

public class ProxyStar implements Star{
    private Star realStar;
    public ProxyStar(Star realStar) {
    	this.realStar = realStar;
    }
	@Override
	public void confer() {
		System.out.println("ProxyStar confer");
	}

	@Override
	public void signContract() {
		System.out.println("ProxyStar signContract");
	}

	@Override
	public void bookTicket() {
		System.out.println("ProxyStar bookTicket");
	}

	@Override
	public void sign() {
		realStar.sign();
	}

	@Override
	public void collectMoney() {
		System.out.println("ProxyStar collectMoney");
	}

}
