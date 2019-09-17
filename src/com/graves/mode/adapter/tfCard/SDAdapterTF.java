/**
 * 
 */
package com.graves.mode.adapter.tfCard;

import com.graves.mode.adapter.sdCard.SDCard;

/**  
 * 创建SD适配TF （也可以说是SD兼容TF，相当于读卡器）：
 * 实现SDCard接口，并将要适配的对象作为适配器的属性引入。
 * <p>Title: SDAdapterTF</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年9月17日  
 */
public class SDAdapterTF implements SDCard{

	private TFCard tfCard;    
    public SDAdapterTF(TFCard tfCard) {        
        this.tfCard = tfCard;    
    }  
	
	@Override
	public String readSD() {
		System.out.println("adapter read tf card ");        
        return tfCard.readTF();  
	}

	@Override
	public int writeSD(String msg) {
		System.out.println("adapter write tf card");        
        return tfCard.writeTF(msg);  
	}

}
