/**
 * 
 */
package com.graves.mode.templatepattern;

/**  
 * <p>Title: Game</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2020年6月19日  
 */
public abstract class Game {
	//选择英雄
	abstract void chooseHero();
	//选择召唤师技能
	abstract void chooseSkills();
	//开始游戏
	abstract void chooseTalent();

	// 模板
	public final void preparePlay() {

		chooseHero();

		chooseSkills();

		chooseTalent();
	}
}
