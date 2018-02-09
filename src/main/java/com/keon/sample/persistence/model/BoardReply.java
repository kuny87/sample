package com.keon.sample.persistence.model;

import com.keon.sample.persistence.type.EBoardType;

public class BoardReply {

	private Integer boardReplySeq;
	private EBoardType type;
	private Integer boardSeq;
	private String replyContent;
	private Integer regSeq;
	private String regDate;
	
	private Integer groupSeq;
	private Integer reparent;
	private Integer reorder;
	private Integer redepth;
	private String delYn;
	
	public Integer getBoardReplySeq() {
		return boardReplySeq;
	}
	public void setBoardReplySeq(Integer boardReplySeq) {
		this.boardReplySeq = boardReplySeq;
	}
	public EBoardType getType() {
		return type;
	}
	public void setType(EBoardType type) {
		this.type = type;
	}
	public Integer getBoardSeq() {
		return boardSeq;
	}
	public void setBoardSeq(Integer boardSeq) {
		this.boardSeq = boardSeq;
	}
	public String getReplyContent() {
		return replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
	public Integer getRegSeq() {
		return regSeq;
	}
	public void setRegSeq(Integer regSeq) {
		this.regSeq = regSeq;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public Integer getGroupSeq() {
		return groupSeq;
	}
	public void setGroupSeq(Integer groupSeq) {
		this.groupSeq = groupSeq;
	}
	public Integer getReparent() {
		return reparent;
	}
	public void setReparent(Integer reparent) {
		this.reparent = reparent;
	}
	public Integer getReorder() {
		return reorder;
	}
	public void setReorder(Integer reorder) {
		this.reorder = reorder;
	}
	public Integer getRedepth() {
		return redepth;
	}
	public void setRedepth(Integer redepth) {
		this.redepth = redepth;
	}
	public String getDelYn() {
		return delYn;
	}
	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}
	
}
