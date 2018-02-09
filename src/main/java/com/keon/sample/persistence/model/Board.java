package com.keon.sample.persistence.model;

import com.keon.sample.persistence.type.EBoardType;

public class Board {

	private int boardSeq;
	private EBoardType type;
	private String title;
	private String content;
	private String name;
	private int cnt;
	private String regDate;
	private String modDate;
	private Integer regSeq;
	private String delYn;
	
	public int getBoardSeq() {
		return boardSeq;
	}
	public void setBoardSeq(int boardSeq) {
		this.boardSeq = boardSeq;
	}
	public EBoardType getType() {
		return type;
	}
	public void setType(EBoardType type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getModDate() {
		return modDate;
	}
	public void setModDate(String modDate) {
		this.modDate = modDate;
	}
	public Integer getRegSeq() {
		return regSeq;
	}
	public void setRegSeq(Integer regSeq) {
		this.regSeq = regSeq;
	}
	public String getDelYn() {
		return delYn;
	}
	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}
	
}
