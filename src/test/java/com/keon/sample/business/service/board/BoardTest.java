package com.keon.sample.business.service.board;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.keon.sample.business.service.BoardService;
import com.keon.sample.persistence.model.Board;
import com.keon.sample.persistence.type.EBoardType;
import com.keon.sample.test.SpringTest;

public class BoardTest extends SpringTest {

	@Autowired
	BoardService boardService;
	
	@Test
	public void 글쓰기() {
		
		Board board = new Board();
		
		board.setType(EBoardType.NORMAL);
		board.setTitle("제목");
		board.setContent("내용");
		board.setName("이름");
		board.setRegSeq(1);
		
		boolean result = boardService.insertBoard(board);
		
		assertTrue(result);
		
	}
	
	@Test
	public void 글불러오기() {
		
		List<Board> boardList = boardService.selectBoardList();
		
		System.out.println("제목: " + boardList.get(0).getTitle());
		System.out.println("내용: " + boardList.get(0).getContent());
		System.out.println("이름: " + boardList.get(0).getName());
		
		assertTrue(boardList != null);
		
	}
	
	@Test
	public void 글수정() {
		
		Board board = new Board();
		
		List<Board> boardList = boardService.selectBoardList();
		
		board = boardList.get(boardList.size() - 1);
		
		board.setBoardSeq(board.getBoardSeq());
		board.setType(EBoardType.FAQ);
		board.setTitle("제목수정");
		board.setContent("내용수정");
		board.setName("최건희");
		
		boolean result = boardService.updateBoard(board);
		
		assertTrue(result);
		
	}
	
	@Test
	public void 글삭제() {
		
		Board board = new Board();
		
		List<Board> boardList = boardService.selectBoardList();
		
		board = boardList.get(boardList.size() - 1);
		
		boolean result = boardService.deleteBoard(board.getBoardSeq());
		
		assertTrue(result);
		
	}

}
