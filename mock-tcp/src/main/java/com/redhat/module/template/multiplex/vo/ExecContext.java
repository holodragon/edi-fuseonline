package com.redhat.module.template.multiplex.vo;

public class ExecContext {
	
	public static final String HEADER_EXEC_CONTENT = "exec" ;
	
	private byte[] sessionId ;
	private String handleType ;
	
	
	public byte[] getSessionId() {
		return this.sessionId ;
	}
	
	public void setSessionId( byte[] sessionId ) {
		this.sessionId = sessionId ;
	}

	public String getHandleType() {
		return handleType;
	}

	public void setHandleType( String handleType ) {
		this.handleType = handleType;
	}
	

}
