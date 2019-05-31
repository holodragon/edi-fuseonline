package com.redhat.module.template.multiplex.bindy.vo.temp;

import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.camel.dataformat.bindy.annotation.FixedLengthRecord;

@FixedLengthRecord( ignoreTrailingChars = true)
public class TempRequest {

	@DataField(pos = 1, length = 2)
	private String filler;
	@DataField(pos = 3, length = 2)
	private String messageType;
	@DataField(pos = 5, length = 4)
	private String messageLength;
	@DataField(pos = 9, length = 6)
	private String cycleNumber;
	@DataField(pos = 15, length = 6)
	private String messageNumber;
	@DataField(pos = 21, length = 4)
	private String segmentNumber;/*redefine daytime*/
	@DataField(pos = 25, length = 4)
	private String frontEndNumber;
	@DataField(pos = 29, length = 1)
	private String flagX;
	@DataField(pos = 30, length = 1)
	private String flagY;
	@DataField(pos = 31, length = 4)
	private String terminalNumber;
	@DataField(pos = 35, length = 3)
	private String institutionNumber;
	@DataField(pos = 38, length = 4)
	private String branchNumber;
	@DataField(pos = 42, length = 3)
	private String workstationNumber;
	@DataField(pos = 45, length = 5)
	private String tellerNumber;
	@DataField(pos = 50, length = 6)
	private String transactionCode;
	@DataField(pos = 56, length = 6)
	private String journalNumber;
	@DataField(pos = 62, length = 8)
	private String date;
	@DataField(pos = 70, length = 1)
	private String flag1;
	@DataField(pos = 71, length = 1)
	private String flag2;
	@DataField(pos = 72, length = 1)
	private String flag3;
	@DataField(pos = 73, length = 1)
	private String flag4;
	@DataField(pos = 74, length = 1)
	private String flag5; // (v8.2.1)
	@DataField(pos = 75, length = 6)
	private String supervisorId; // (v8.2.1)
	@DataField(pos = 81, length = 1)
	private String debugFlag; // (v8.2.1)
	@DataField(pos = 82, length = 1)
	private String debugQueue; // (v8.2.1)
	@DataField(pos = 83, length = 4)
	private String baseRatelD1;
	@DataField(pos = 87, length = 4)
	private String baseRatelD2;
	@DataField(pos = 91, length = 4)
	private String baseRatelD3;
	@DataField(pos = 95, length = 4)
	private String baseRatelD4;
	@DataField(pos = 99, length = 4)
	private String baseRatelD5;
	@DataField(pos = 103, length = 4)
	private String baseRatelD6;
	@DataField(pos = 107, length = 4)
	private String baseRatelD7;
	@DataField(pos = 111, length = 4)
	private String baseRatelD8;
	@DataField(pos = 115, length = 4)
	private String baseRatelD9;
	@DataField(pos = 119, length = 4)
	private String baseRatelD10;
	@DataField(pos = 123, length = 942)
	private String filler2;
	
	public String getFiller() {
		return filler;
	}
	public void setFiller(String filler) {
		this.filler = filler;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public String getMessageLength() {
		return messageLength;
	}
	public void setMessageLength(String messageLength) {
		this.messageLength = messageLength;
	}
	public String getCycleNumber() {
		return cycleNumber;
	}
	public void setCycleNumber(String cycleNumber) {
		this.cycleNumber = cycleNumber;
	}
	public String getMessageNumber() {
		return messageNumber;
	}
	public void setMessageNumber(String messageNumber) {
		this.messageNumber = messageNumber;
	}
	public String getSegmentNumber() {
		return segmentNumber;
	}
	public void setSegmentNumber(String segmentNumber) {
		this.segmentNumber = segmentNumber;
	}
	public String getFrontEndNumber() {
		return frontEndNumber;
	}
	public void setFrontEndNumber(String frontEndNumber) {
		this.frontEndNumber = frontEndNumber;
	}
	public String getFlagX() {
		return flagX;
	}
	public void setFlagX(String flagX) {
		this.flagX = flagX;
	}
	public String getFlagY() {
		return flagY;
	}
	public void setFlagY(String flagY) {
		this.flagY = flagY;
	}
	public String getTerminalNumber() {
		return terminalNumber;
	}
	public void setTerminalNumber(String terminalNumber) {
		this.terminalNumber = terminalNumber;
	}
	public String getInstitutionNumber() {
		return institutionNumber;
	}
	public void setInstitutionNumber(String institutionNumber) {
		this.institutionNumber = institutionNumber;
	}
	public String getBranchNumber() {
		return branchNumber;
	}
	public void setBranchNumber(String branchNumber) {
		this.branchNumber = branchNumber;
	}
	public String getWorkstationNumber() {
		return workstationNumber;
	}
	public void setWorkstationNumber(String workstationNumber) {
		this.workstationNumber = workstationNumber;
	}
	public String getTellerNumber() {
		return tellerNumber;
	}
	public void setTellerNumber(String tellerNumber) {
		this.tellerNumber = tellerNumber;
	}
	public String getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}
	public String getJournalNumber() {
		return journalNumber;
	}
	public void setJournalNumber(String journalNumber) {
		this.journalNumber = journalNumber;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getFlag1() {
		return flag1;
	}
	public void setFlag1(String flag1) {
		this.flag1 = flag1;
	}
	public String getFlag2() {
		return flag2;
	}
	public void setFlag2(String flag2) {
		this.flag2 = flag2;
	}
	public String getFlag3() {
		return flag3;
	}
	public void setFlag3(String flag3) {
		this.flag3 = flag3;
	}
	public String getFlag4() {
		return flag4;
	}
	public void setFlag4(String flag4) {
		this.flag4 = flag4;
	}
	public String getFlag5() {
		return flag5;
	}
	public void setFlag5(String flag5) {
		this.flag5 = flag5;
	}
	public String getSupervisorId() {
		return supervisorId;
	}
	public void setSupervisorId(String supervisorId) {
		this.supervisorId = supervisorId;
	}
	public String getDebugFlag() {
		return debugFlag;
	}
	public void setDebugFlag(String debugFlag) {
		this.debugFlag = debugFlag;
	}
	public String getDebugQueue() {
		return debugQueue;
	}
	public void setDebugQueue(String debugQueue) {
		this.debugQueue = debugQueue;
	}
	public String getBaseRatelD1() {
		return baseRatelD1;
	}
	public void setBaseRatelD1(String baseRatelD1) {
		this.baseRatelD1 = baseRatelD1;
	}
	public String getBaseRatelD2() {
		return baseRatelD2;
	}
	public void setBaseRatelD2(String baseRatelD2) {
		this.baseRatelD2 = baseRatelD2;
	}
	public String getBaseRatelD3() {
		return baseRatelD3;
	}
	public void setBaseRatelD3(String baseRatelD3) {
		this.baseRatelD3 = baseRatelD3;
	}
	public String getBaseRatelD4() {
		return baseRatelD4;
	}
	public void setBaseRatelD4(String baseRatelD4) {
		this.baseRatelD4 = baseRatelD4;
	}
	public String getBaseRatelD5() {
		return baseRatelD5;
	}
	public void setBaseRatelD5(String baseRatelD5) {
		this.baseRatelD5 = baseRatelD5;
	}
	public String getBaseRatelD6() {
		return baseRatelD6;
	}
	public void setBaseRatelD6(String baseRatelD6) {
		this.baseRatelD6 = baseRatelD6;
	}
	public String getBaseRatelD7() {
		return baseRatelD7;
	}
	public void setBaseRatelD7(String baseRatelD7) {
		this.baseRatelD7 = baseRatelD7;
	}
	public String getBaseRatelD8() {
		return baseRatelD8;
	}
	public void setBaseRatelD8(String baseRatelD8) {
		this.baseRatelD8 = baseRatelD8;
	}
	public String getBaseRatelD9() {
		return baseRatelD9;
	}
	public void setBaseRatelD9(String baseRatelD9) {
		this.baseRatelD9 = baseRatelD9;
	}
	public String getBaseRatelD10() {
		return baseRatelD10;
	}
	public void setBaseRatelD10(String baseRatelD10) {
		this.baseRatelD10 = baseRatelD10;
	}
	public String getFiller2() {
		return filler2;
	}
	public void setFiller2(String filler2) {
		this.filler2 = filler2;
	}	
}