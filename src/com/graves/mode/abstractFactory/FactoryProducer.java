/**
 * 
 */
package com.graves.mode.abstractFactory;

/**  
 * 创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂。
 * <p>Title: FactoryProducer</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年9月17日  
 */
public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		return null;
	}
}
