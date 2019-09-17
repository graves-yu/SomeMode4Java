/**
 * 
 */
package com.graves.mode.prototype;

/**  
 * 创建扩展了上面抽象类的实体类。
 * <p>Title: Rectangle</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年9月17日  
 */
public class Rectangle extends Shape {

	public Rectangle() {
		type = "Rectangle";
	}

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}

}
