/**
 * 
 */
package com.graves.mode.observer;

/**  
 * 用户操作记录
 * <p>Title: UserOperateRecord</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2020年6月19日  
 */
public class UserOperateRecord extends Observer{
	public UserOperateRecord(Bookmark bookmark){
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
	public void execute() {
		System.out.println("添加了用户操作记录");
	}
	
}
