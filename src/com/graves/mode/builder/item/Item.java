/**
 * 
 */
package com.graves.mode.builder.item;

import com.graves.mode.builder.packing.Packing;

/**  
 * 创建一个表示食物条目的接口。
 * <p>Title: Item</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年9月17日  
 */
public interface Item {
	public String name();
	public Packing packing();
	public float price();
}
