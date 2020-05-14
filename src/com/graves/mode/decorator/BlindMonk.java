/**
 * 
 */
package com.graves.mode.decorator;

/**  ConcreteComponent 具体英雄盲僧实现英雄接口
 * <p>Title: BlindMonk</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2020年5月14日  
 */
public class BlindMonk implements Hero{

	private String name;
	
	
	/**带名称参数的构造器
	 * @param name
	 */
	public BlindMonk(String name) {
		this.name = name;
	}


	/**  
	 * <p>Title: learnSkills</p>  
	 * <p>Description: </p>  
	 * @author Graves
	 * @date 2020年5月14日     
	 */ 
	@Override
	public void learnSkills() {
		System.out.println(name + "学习了以上技能！");
	}

}
