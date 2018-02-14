package com.keon.sample.business.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.keon.sample.persistence.model.Board;

@Repository
public interface BoardService {

	boolean insertBoard(Board board);
	
	boolean updateBoard(Board board);
	
	boolean deleteBoard(int boardSeq);
	
	Board selectBoard(int boardSeq);
	
	List<Board> selectBoardList();
	
}
