/**
 * 
 */
package com.graves.mode.abstractFactory;

import com.graves.mode.abstractFactory.color.Color;
import com.graves.mode.abstractFactory.shape.Shape;

/**  
 * 为 Color 和 Shape 对象创建抽象类来获取工厂。
 * <p>Title: AbstractFactory</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年9月17日  
 */
public abstract class AbstractFactory {
	public abstract Color getColor(String color);
	public abstract Shape getShape(String shape) ;
}
