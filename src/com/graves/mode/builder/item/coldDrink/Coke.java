/**
 * 
 */
package com.graves.mode.builder.item.coldDrink;

/**  
 * 创建扩展了  ColdDrink 的实体类。
 * <p>Title: Coke</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年9月17日  
 */
public class Coke extends ColdDrink{
	@Override
	public float price() {
		return 30.0f;
	}

	@Override
	public String name() {
		return "Coke";
	}
}
