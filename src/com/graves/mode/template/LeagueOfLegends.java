/**
 * 
 */
package com.graves.mode.template;

/** 
 * 英雄联盟 
 * <p>Title: LeagueOfLegends</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2020年6月19日  
 */
public class LeagueOfLegends extends Game{

	/**  
	 * 选择英雄
	 * <p>Title: chooseHero</p>  
	 * <p>Description: </p>  
	 * @author Graves
	 * @date 2020年6月19日     
	 */ 
	@Override
	void chooseHero() {
		System.out.println("选择了 盲僧");
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
		System.out.println("选择了 惩戒-闪现");
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
		System.out.println("选择了 战争-主宰系天赋");
	}


}
