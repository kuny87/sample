package com.keon.sample.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keon.sample.business.service.BoardService;
import com.keon.sample.persistence.mapper.BoardMapper;
import com.keon.sample.persistence.model.Board;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardMapper boardMapper;
	
	@Override
	public boolean insertBoard(Board board) {
		return boardMapper.insertBoard(board) == 1;
	}

	@Override
	public boolean updateBoard(Board board) {
		return boardMapper.updateBoard(board) == 1;
	}

	@Override
	public boolean deleteBoard(int boardSeq) {
		return boardMapper.deleteBoard(boardSeq) == 1;
	}

	@Override
	public Board selectBoard(int boardSeq) {
		return boardMapper.selectBoard(boardSeq);
	}

	@Override
	public List<Board> selectBoardList() {
		return boardMapper.selectBoardList();
	}
	
}