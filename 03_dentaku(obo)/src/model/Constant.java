package model;

import java.math.BigDecimal;

public class Constant {

	// 数値0～9
	final static int NUM_INT_ZERO = 0;
	final static int NUM_INT_ONE = 1;
	final static int NUM_INT_TWO = 2;
	final static int NUM_INT_THREE = 3;
	final static int NUM_INT_FOUR = 4;
	final static int NUM_INT_FIVE = 5;
	final static int NUM_INT_SIX = 6;
	final static int NUM_INT_SEVEN = 7;
	final static int NUM_INT_EIGHT = 8;
	final static int NUM_INT_NINE = 9;

	// 演算子
	final static String OPERATOR_STR_ADD = "+";
	final static String OPERATOR_STR_SUBTRACTION = "-";
	final static String OPERATOR_STR_MULTIPLCATION = "*";
	final static String OPERATOR_STR_DIVISION = "/";
	final static String OPERATOR_STR_EQUAL = "=";

	// 答え
	// 20150607 小数点対応int→double start
	static double NUM_DOUBLE_ANSWER = 0;

	public static double getNUM_DOUBLE_ANSWER() {
		return NUM_DOUBLE_ANSWER;
	}
	public static void setNUM_DOUBLE_ANSWER(double nUM_INT_ANSWER) {
		NUM_DOUBLE_ANSWER = nUM_INT_ANSWER;
	}
	// 20150607 小数点対応int→double end

	// 20150705 小数点対応double→decimal start
	static BigDecimal NUM_DECIMAL_ANSWER = new BigDecimal("0.00");

	public static BigDecimal getNUM_DECIMAL_ANSWER() {
		return NUM_DECIMAL_ANSWER;
	}
	public static void setNUM_DECIMAL_ANSWER(BigDecimal nUM_DECIMAL_ANSWER) {
		NUM_DECIMAL_ANSWER = nUM_DECIMAL_ANSWER;
	}
	// 20150705 小数点対応double→decimal end
	public static String getOperatorStrSubtraction() {
		return OPERATOR_STR_SUBTRACTION;
	}
	public static int getNumIntZero() {
		return NUM_INT_ZERO;
	}
	public static int getNumIntOne() {
		return NUM_INT_ONE;
	}
	public static int getNumIntTwo() {
		return NUM_INT_TWO;
	}
	public static int getNumIntThree() {
		return NUM_INT_THREE;
	}
	public static int getNumIntFour() {
		return NUM_INT_FOUR;
	}
	public static int getNumIntFive() {
		return NUM_INT_FIVE;
	}
	public static int getNumIntSix() {
		return NUM_INT_SIX;
	}
	public static int getNumIntSeven() {
		return NUM_INT_SEVEN;
	}
	public static int getNumIntEight() {
		return NUM_INT_EIGHT;
	}
	public static int getNumIntNine() {
		return NUM_INT_NINE;
	}
	public static String getOperatorStrAdd() {
		return OPERATOR_STR_ADD;
	}
	public static String getOperatorStrMulsubtraction() {
		return OPERATOR_STR_SUBTRACTION;
	}
	public static String getOperatorStrMultiplcation() {
		return OPERATOR_STR_MULTIPLCATION;
	}
	public static String getOperatorStrDivision() {
		return OPERATOR_STR_DIVISION;
	}
	public static String getOperatorStrEqual() {
		return OPERATOR_STR_EQUAL;
	}

}