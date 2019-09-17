/**
 * 
 */
package com.graves.mode.builder.item.coldDrink;

/**  
 * 创建扩展了  ColdDrink 的实体类。
 * <p>Title: Pepsi</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年9月17日  
 */
public class Pepsi extends ColdDrink{

	@Override
	public float price() {
		return 35.0f;
	}

	@Override
	public String name() {
		return "Pepsi";
	}
}
