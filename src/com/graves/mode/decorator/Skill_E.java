/**
 * 
 */
package com.graves.mode.decorator;

/**  
 * <p>Title: Skill_E</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2020年5月14日  
 */
public class Skill_E extends Skills{
	private String skillName;

	/**
	 * @param hero
	 * @param skillName
	 */
	public Skill_E(Hero hero, String skillName) {
		super(hero);
		this.skillName = skillName;
	}
	
	@Override
    public void learnSkills() {
        System.out.println("学习了技能Q:" +skillName);
        super.learnSkills();
    }
}
