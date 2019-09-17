/**
 * 
 */
package com.graves.mode.prototype;

/**  
 * 创建扩展了上面抽象类的实体类。
 * <p>Title: Square</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年9月17日  
 */
public class Square extends Shape {

	public Square() {
		type = "Square";
	}

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}
