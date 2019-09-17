/**
 * 
 */
package com.graves.mode.adapter.computer;

import com.graves.mode.adapter.sdCard.SDCard;

/**  
 * 创建一个计算机实例，实现计算机接口，并实现其读取SD卡方法
 * <p>Title: HuaweiComputer</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年9月17日  
 */
public class HuaweiComputer implements Computer {
	@Override
	public String readSD(SDCard sdCard) {
		if (sdCard == null)
			throw new NullPointerException("sd card null");
		return sdCard.readSD();
	}
}
