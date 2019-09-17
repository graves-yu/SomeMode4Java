/**
 * 
 */
package com.graves.mode.abstractFactory.color;

/**  
 * <p>Title: Red</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年9月17日  
 */
public class Red implements Color{
	@Override
	public void fill() {
		System.out.println("Inside Red::fill() method.");
	}
}
