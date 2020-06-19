/**
 * 
 */
package com.graves.mode.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**  
 * <p>Title: Bookmark</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2020年6月19日  
 */
public class Bookmark {
	public void addBoolmark() {
		System.out.println("添加了一个书签");
		notifyAllObservers();
	}
	
	//观察者列表
	private List<Observer> observers = new ArrayList<Observer>();
	//添加观察者
	public void attach(Observer observer) {
		observers.add(observer);
	}
	//观察者执行动作
	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.add();
		}
	}
}
