/**
 * 
 */
package com.graves.mode.abstractFactory;

import com.graves.mode.abstractFactory.color.Blue;
import com.graves.mode.abstractFactory.color.Color;
import com.graves.mode.abstractFactory.color.Green;
import com.graves.mode.abstractFactory.color.Red;
import com.graves.mode.abstractFactory.shape.Shape;

/**  
 * 创建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象。
 * <p>Title: ColorFactory</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年9月17日  
 */
public class ColorFactory extends AbstractFactory{
	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

	@Override
	public Color getColor(String color) {
		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		return null;
	}
}
