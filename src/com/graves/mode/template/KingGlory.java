/**
 * 
 */
package com.graves.mode.template;

/**  
 * 王者荣耀
 * <p>Title: KingGlory</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2020年6月19日  
 */
public class KingGlory extends Game{

	/**  
	 * 选择英雄
	 * <p>Title: chooseHero</p>  
	 * <p>Description: </p>  
	 * @author Graves
	 * @date 2020年6月19日     
	 */ 
	@Override
	void chooseHero() {
		System.out.println("选择了 鲁班七号");
	}

	/**  
	 * 选择召唤师技能
	 * <p>Title: chooseSkills</p>  
	 * <p>Description: </p>  
	 * @author Graves
	 * @date 2020年6月19日     
	 */ 
	@Override
	void chooseSkills() {
		System.out.println("选择了 闪现-治疗");
	}

	/**  
	 * 选择天赋
	 * <p>Title: chooseTalent</p>  
	 * <p>Description: </p>  
	 * @author Graves
	 * @date 2020年6月19日     
	 */ 
	@Override
	void chooseTalent() {
		System.out.println("选择了攻速-攻击力天赋");
	}

}
