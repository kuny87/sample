package com.keon.sample.persistence.type;

public enum EBoardType implements EType<String> {

	NORMAL("normal"),
	NOTICE("notice"),
	FAQ("faq"),
	ETC("etc")
	;

	private String eValue;
	
	EBoardType(String eValue) {
		this.eValue = eValue;
	}
	
	@Override
	public String getEValue() {
		return eValue;
	}
	
}
