/**
 * 
 */
package com.graves.mode.decorator;

/**  
 * <p>Title: Player</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2020年5月14日  
 */
public class Player {
	public static void main(String[] args) {
        //选择英雄
        Hero hero = new BlindMonk("李青");
        
        Skills skills = new Skills(hero);
        Skills q = new Skill_Q(skills,"天音波/回音击");
        Skills w = new Skill_W(q,"金钟罩/铁布衫");
        Skills e = new Skill_E(w,"天雷破/摧筋断骨");
        Skills r = new Skill_R(e,"猛龙摆尾");
        //学习技能
        r.learnSkills();
    }
}
