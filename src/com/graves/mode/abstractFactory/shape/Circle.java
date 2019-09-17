/**
 * 
 */
package com.graves.mode.abstractFactory.shape;

/**  
 * <p>Title: Circle</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年9月17日  
 */
public class Circle implements Shape{
	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}
