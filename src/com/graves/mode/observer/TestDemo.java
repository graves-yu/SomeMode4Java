/**
 * 
 */
package com.graves.mode.observer;

/**  
 * <p>Title: TestDemo</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2020年6月19日  
 */
public class TestDemo {
	public static void main(String[] args) {
		Bookmark bookmark = new Bookmark();
		new UserOperateRecord(bookmark);
		new SendMsg(bookmark);
		BookmarkService bookmarkService = new BookmarkService();
		bookmarkService.addBookmark(bookmark);
	}
}
