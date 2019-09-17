/**
 * 
 */
package com.graves.mode.builder.item.burger;

/**  
 * 创建扩展了 Burger的实体类。
 * <p>Title: ChickenBurger</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年9月17日  
 */
public class ChickenBurger extends Burger{
	@Override
	public float price() {
		return 50.5f;
	}

	@Override
	public String name() {
		return "Chicken Burger";
	}
}
