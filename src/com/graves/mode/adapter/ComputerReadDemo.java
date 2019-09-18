/**
 * 
 */
package com.graves.mode.adapter;

import com.graves.mode.adapter.computer.Computer;
import com.graves.mode.adapter.computer.HuaweiComputer;
import com.graves.mode.adapter.sdCard.SDCard;
import com.graves.mode.adapter.sdCard.SDCardImpl;
import com.graves.mode.adapter.tfCard.SDAdapterTF;
import com.graves.mode.adapter.tfCard.TFCard;
import com.graves.mode.adapter.tfCard.TFCardImpl;

/**  
 * 适配器模式（Adapter Pattern）
 * <p>Title: ComputerReadDemo</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年9月17日  
 */
public class ComputerReadDemo {
	public static void main(String[] args) {  
		
		//模拟计算机读取SD卡功能：
        Computer computer = new HuaweiComputer();        
        SDCard sdCard = new SDCardImpl();    
        System.out.println(computer.readSD(sdCard));   
        
        System.out.println("====================================");        

        //测试计算机通过SD读卡器读取TF卡：
        TFCard tfCard = new TFCardImpl();        
        SDCard tfCardAdapterSD = new SDAdapterTF(tfCard);        
        System.out.println(computer.readSD(tfCardAdapterSD));  
        
    }
}
