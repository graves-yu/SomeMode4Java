/**
 * 
 */
package com.graves.mode.strategy;

/**  
 * <p>Title: Operationdivision</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2020年6月19日  
 */
public class OperationDivision implements Operation{

	/**  
	 * <p>Title: doOperation</p>  
	 * <p>Description: </p>  
	 * @author Graves
	 * @date 2020年6月19日   
	 * @param num1
	 * @param num2
	 * @return  
	 */ 
	@Override
	public int doOperation(int num1, int num2) {
		if (num2 == 0) {
			return 0;
		}
		return num1 / num2;
	}

}
