/**
 * 
 */
package com.graves.mode.adapter.sdCard;

/**  
 * 创建一个SD卡的接口
 * <p>Title: SDCard</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年9月17日  
 */
public interface SDCard {
	//读取SD卡方法
    String readSD();
    //写入SD卡功能
    int writeSD(String msg);
}
