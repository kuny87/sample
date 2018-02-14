package com.keon.sample.persistence.mapper;

import org.springframework.stereotype.Repository;

import com.keon.sample.persistence.model.BoardReply;

@Repository
public interface BoardReplyMapper {

	int insertBoardReply(BoardReply boardReply);
	
	int updateBoardReply(BoardReply boardReply);
	
	int deleteBoardReply(BoardReply boardReply);
	
	BoardReply selectBoardReply(BoardReply boardReply);
	
}
