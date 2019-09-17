/**
 * 
 */
package com.graves.mode.prototype;

/**  
 * 创建扩展了上面抽象类的实体类。
 * <p>Title: Circle</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年9月17日  
 */
public class Circle extends Shape {
	public Circle() {
		type = "Circle";
	}

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}
