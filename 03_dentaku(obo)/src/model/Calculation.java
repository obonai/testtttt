package model;

import java.math.BigDecimal;

public class Calculation {

	Constant con = new Constant();

	// 20150607 小数点対応int→double start
/*	public void cal(double n1,String o,double n2){
		double num1 = n1;
		double num2 = n2;
	// 20150607 小数点対応int→double end
		String ope = o;

		// 計算
		if(ope.equals(con.OPERATOR_STR_ADD)){
			con.setNUM_DOUBLE_ANSWER(num1 + num2);
		}else if(ope.equals(con.OPERATOR_STR_SUBTRACTION)){
			con.setNUM_DOUBLE_ANSWER(num1 - num2);
		}else if(ope.equals(con.OPERATOR_STR_MULTIPLCATION)){
			con.setNUM_DOUBLE_ANSWER(num1 * num2);
		}else if(ope.equals(con.OPERATOR_STR_DIVISION)){
			con.setNUM_DOUBLE_ANSWER(num1 / num2);
		}else{
			con.setNUM_DOUBLE_ANSWER(0);
		}
	}*/

	// 20150705 小数点対応double→decimal start
	public void cal(BigDecimal n1,String o,BigDecimal n2){
		BigDecimal num1 = n1;
		BigDecimal num2 = n2;
		String ope = o;

		// 計算
		if(ope.equals(con.OPERATOR_STR_ADD)){
			con.setNUM_DECIMAL_ANSWER(num1.add(num2));
		}else if(ope.equals(con.OPERATOR_STR_SUBTRACTION)){
			con.setNUM_DECIMAL_ANSWER(num1.subtract(num2));
		}else if(ope.equals(con.OPERATOR_STR_MULTIPLCATION)){
			con.setNUM_DECIMAL_ANSWER(num1.multiply(num2));
		}else if(ope.equals(con.OPERATOR_STR_DIVISION)){
			con.setNUM_DECIMAL_ANSWER(num1.divide(num2, 5, BigDecimal.ROUND_HALF_UP));
		}else{
			System.out.println("エラーです。");
		}

	}
	// 20150705 小数点対応double→decimal start
}
