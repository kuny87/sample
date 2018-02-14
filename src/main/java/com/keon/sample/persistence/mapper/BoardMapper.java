package com.keon.sample.persistence.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.keon.sample.persistence.model.Board;

@Repository
public interface BoardMapper {

	int insertBoard(Board board);
	
	int updateBoard(Board board);
	
	int deleteBoard(int boardSeq);
	
	Board selectBoard(int boardSeq);
	
	List<Board> selectBoardList();
	
}
