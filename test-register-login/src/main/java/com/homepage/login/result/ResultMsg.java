package com.homepage.login.result;

public class ResultMsg {
	public static final String ERRORMsgKey = "errorMsg";
	public static final String SUCCESSMsgKey = "successMsg";
	
	private String errorMsg;
	private String successMsg;
	
	public boolean isSuccess() {
		return errorMsg == null;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getSuccessMsg() {
		return successMsg;
	}

	public void setSuccessMsg(String successMsg) {
		this.successMsg = successMsg;
	}
	
	public static ResultMsg errorMsg(String msg) {
		ResultMsg resultMsg = new ResultMsg();
		resultMsg.setErrorMsg(msg);
		return resultMsg;
	}
	
	public static ResultMsg successMsg(String msg) {
		ResultMsg resultMsg = new ResultMsg();
		resultMsg.setSuccessMsg(msg);
		return resultMsg;
		
	}
}
