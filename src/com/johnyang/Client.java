package com.johnyang;

public class Client {
	public static void main(String[] args) {
		//1.创建目标
		ConcreteWeatherSubject weatherSubject = new ConcreteWeatherSubject();
		//2.创建观察者
		ConcreteObserver observerGirl = new ConcreteObserver();
		observerGirl.setObserverName("黄明的女朋友");
		observerGirl.setRemindThing("下雨了，安静的呆在家里吧");
		
		
		ConcreteObserver observerMum = new ConcreteObserver();
		observerMum.setObserverName("黄明的老妈");
		observerMum.setRemindThing("不管下雨还是下雪，我都不出门了");
		
		//3.注册观察者
		weatherSubject.attach(observerGirl);
		weatherSubject.attach(observerMum);
		
		//4.目标发布天气了
		weatherSubject.setWeatherContent("下雪");
		
		
	}
}
