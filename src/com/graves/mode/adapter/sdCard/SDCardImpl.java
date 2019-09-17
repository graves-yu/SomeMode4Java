/**
 * 
 */
package com.graves.mode.adapter.sdCard;

/**  
 * SD卡接口的实现类，模拟SD卡的功能
 * <p>Title: SDCardImplement</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年9月17日  
 */
public class SDCardImpl implements SDCard{

	@Override
	public String readSD() {
		String msg = "sdcard read a msg :hello word SD";
        return msg;
	}

	@Override
	public int writeSD(String msg) {
		System.out.println("sd card write msg : " + msg);    
        return 1; 
	}

}
