/**
 * 
 */
package com.graves.mode.adapter.tfCard;

/**  
 * 创建TF卡接口
 * <p>Title: TFCard</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年9月17日  
 */
public interface TFCard {
	String readTF();    
    int writeTF(String msg);
}
