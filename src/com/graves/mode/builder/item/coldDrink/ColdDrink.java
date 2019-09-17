/**
 * 
 */
package com.graves.mode.builder.item.coldDrink;

import com.graves.mode.builder.item.Item;
import com.graves.mode.builder.packing.Bottle;
import com.graves.mode.builder.packing.Packing;

/**  
 * <p>Title: ColdDrink</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年9月17日  
 */
public abstract class ColdDrink implements Item{

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();

}
