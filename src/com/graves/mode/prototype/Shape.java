/**
 * 
 */
package com.graves.mode.prototype;

/**  
 * 创建一个实现了 Cloneable 接口的抽象类。
 * 原型角色：定义用于复制现有实例来生成新实例的方法；
 * <p>Title: Shape</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年9月17日  
 */
//1.（抽象类或者接口）实现 java.lang.Cloneable 接口
public abstract  class Shape implements Cloneable {	
	   private String id;
	   protected String type;
	   
	   abstract void draw();
	   
	   public String getType(){
	      return type;
	   }
	   
	   public String getId() {
	      return id;
	   }
	   
	   public void setId(String id) {
	      this.id = id;
	   }
	   
	// 具体原型角色：实现用于复制现有实例来生成新实例的方法
	// 2.定义复制现有实例来生成新实例的方法
	@Override
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}
