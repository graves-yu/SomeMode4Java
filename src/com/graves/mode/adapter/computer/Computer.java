/**
 * 
 */
package com.graves.mode.adapter.computer;

import com.graves.mode.adapter.sdCard.SDCard;

/**  
 * 计算机接口，计算机提供读取SD卡方法
 * <p>Title: Computer</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年9月17日  
 */
public interface Computer {
	String readSD(SDCard sdCard);
}
