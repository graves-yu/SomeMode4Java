/**
 * 
 */
package com.graves.mode.ObserverPattern;

/**  
 * <p>Title: BookmarkService</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2020年6月19日  
 */
public class BookmarkService {
	void addBookmark(Bookmark bookmark) {
		System.out.println("添加了一个书签");
		bookmark.notifyAllObservers();
	}
}
