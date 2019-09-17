/**
 * 
 */
package com.graves.mode.builder.item.burger;

import com.graves.mode.builder.item.Item;
import com.graves.mode.builder.packing.Packing;
import com.graves.mode.builder.packing.Wrapper;

/**  
 * <p>Title: Burger</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年9月17日  
 */
public abstract class Burger implements Item {
	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
}
