/**
 * 
 */
package com.graves.mode.builder.packing;

/**  
 * 创建实现 Packing 接口的实体类。
 * <p>Title: Bottle</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年9月17日  
 */
public class Bottle implements Packing {

	/**  
	 * <p>Title: pack</p>  
	 * <p>Description: </p>  
	 * @author Graves
	 * @date 2019年9月17日   
	 * @return  
	 */ 
	@Override
	public String pack() {
		return "Bottle";
	}

}
