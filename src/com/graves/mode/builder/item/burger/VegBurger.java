/**
 * 
 */
package com.graves.mode.builder.item.burger;

/**  
 * 创建扩展了 Burger的实体类。
 * <p>Title: VegBurger</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年9月17日  
 */
public class VegBurger extends Burger{

	@Override
	public String name() {
		return "Veg Burger";
	}

	@Override
	public float price() {
		return 25.0f;
	}

}
