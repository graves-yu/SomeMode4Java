/**
 * 
 */
package com.graves.mode.adapter.tfCard;

/**  
 * 创建TF卡实例
 * <p>Title: TFCardImpl</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年9月17日  
 */
public class TFCardImpl implements TFCard {
	@Override    
    public String readTF() {        
        String msg ="tf card reade msg : hello word tf card";        
        return msg;    
    }    
    @Override    
    public int writeTF(String msg) {        
        System.out.println("tf card write a msg : " + msg);        
        return 1;    
    }
}
