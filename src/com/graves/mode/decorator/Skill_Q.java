/**
 * 
 */
package com.graves.mode.decorator;

/**  
 * ConreteDecorator 技能：Q 继承skills
 * <p>Title: Skill_Q</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2020年5月14日  
 */
public class Skill_Q extends Skills{
	private String skillName;

	/**
	 * @param hero
	 * @param skillName
	 */
	public Skill_Q(Hero hero, String skillName) {
		super(hero);
		this.skillName = skillName;
	}
	
	@Override
    public void learnSkills() {
        System.out.println("学习了技能Q:" +skillName);
        super.learnSkills();
    }
}
