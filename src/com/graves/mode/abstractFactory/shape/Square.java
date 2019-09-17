/**
 * 
 */
package com.graves.mode.abstractFactory.shape;

/**  
 * <p>Title: Square</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年9月17日  
 */
public class Square implements Shape{
	@Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}
