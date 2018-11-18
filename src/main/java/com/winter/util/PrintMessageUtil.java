package com.winter.util;

public class PrintMessageUtil {
	public static boolean debugFlag;
	public static boolean infoFlag;
	public static boolean warningFlag;
	public static boolean errorFlag;
	static {
		debugFlag = true;
		infoFlag = true;
		warningFlag = true;
		errorFlag = true;
	}

	public static void printDebug(String inMessage) {
		if (debugFlag) {
			System.out.println("*************************************");
			System.out.println("   " + inMessage);
			System.out.println("*************************************");
		}

	}

	public static void printInfo(String inMessage) {
		if (infoFlag) {
			System.out.println("*************************************");
			System.out.println("   " + inMessage);
			System.out.println("*************************************");
		}
	}

	public static void printWarning(String inMessage) {
		if (warningFlag) {
			System.out.println("*************************************");
			System.out.println("   " + inMessage);
			System.out.println("*************************************");
		}
	}

	public static void printError(String inMessage) {
		if (errorFlag) {
			System.out.println("*************************************");
			System.out.println("   " + inMessage);
			System.out.println("*************************************");
		}
	}

	public static boolean isDebugFlag() {
		return debugFlag;
	}

	public static void setDebugFlag(boolean debugFlag) {
		PrintMessageUtil.debugFlag = debugFlag;
	}

	public static boolean isInfoFlag() {
		return infoFlag;
	}

	public static void setInfoFlag(boolean infoFlag) {
		PrintMessageUtil.infoFlag = infoFlag;
	}

	public static boolean isWarningFlag() {
		return warningFlag;
	}

	public static void setWarningFlag(boolean warningFlag) {
		PrintMessageUtil.warningFlag = warningFlag;
	}

	public static boolean isErrorFlag() {
		return errorFlag;
	}

	public static void setErrorFlag(boolean errorFlag) {
		PrintMessageUtil.errorFlag = errorFlag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
