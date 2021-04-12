package com.xe.appearancemodel;

public class Facade {
	private ChildSystem1 mChildSystem1 = new ChildSystem1();
    private ChildSystem2 mChildSystem2 = new ChildSystem2();
    private ChildSystem3 mChildSystem3 = new ChildSystem3();
    public void handle() {
    	mChildSystem1.handle();
    	mChildSystem2.handle();
    	mChildSystem3.handle();
    }
}
