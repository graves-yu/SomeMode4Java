/**
 * 
 */
package com.graves.mode.ObserverPattern;

/**  
 * <p>Title: SendMsg</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2020年6月19日  
 */
public class SendMsg extends Observer{

	public SendMsg(Bookmark bookmark) {
		this.bookmark = bookmark;
		this.bookmark.attach(this);
	}
	
	/**  
	 * <p>Title: add</p>  
	 * <p>Description: </p>  
	 * @author Graves
	 * @date 2020年6月19日     
	 */ 
	@Override
	public void add() {
		System.out.println("发送一条添加消息到消息队列");
	}

}
