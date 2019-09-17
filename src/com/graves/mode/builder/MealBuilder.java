/**
 * 
 */
package com.graves.mode.builder;

import com.graves.mode.builder.item.burger.ChickenBurger;
import com.graves.mode.builder.item.burger.VegBurger;
import com.graves.mode.builder.item.coldDrink.Coke;
import com.graves.mode.builder.item.coldDrink.Pepsi;

/**  
 * 创建一个 MealBuilder 类，实际的 builder 类负责创建 Meal 对象。
 * <p>Title: MealBuilder</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年9月17日  
 */
public class MealBuilder {
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
