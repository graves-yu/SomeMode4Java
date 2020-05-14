/**
 * 
 */
package com.graves.mode.decorator;

/**  
 * Decorator 技能栏
 * <p>Title: Skills</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2020年5月14日  
 */
public class Skills implements Hero{

	//持有一个英雄对象接口
    private Hero hero;
    
	/**
	 * @param hero
	 */
	public Skills(Hero hero) {
		this.hero = hero;
	}

	/**  
	 * 	重写Hero的学习技能方法
	 * <p>Title: learnSkills</p>  
	 * <p>Description: </p>  
	 * @author Graves
	 * @date 2020年5月14日     
	 */ 
	@Override
	public void learnSkills() {
		 if(hero != null) {
			 hero.learnSkills();
		 }
	}
}


