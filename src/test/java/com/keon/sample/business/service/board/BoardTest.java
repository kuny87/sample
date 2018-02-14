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
	public void �۾���() {
		
		Board board = new Board();
		
		board.setType(EBoardType.NORMAL);
		board.setTitle("����");
		board.setContent("����");
		board.setName("�̸�");
		board.setRegSeq(1);
		
		boolean result = boardService.insertBoard(board);
		
		assertTrue(result);
		
	}
	
	@Test
	public void �ۺҷ�����() {
		
		List<Board> boardList = boardService.selectBoardList();
		
		System.out.println("����: " + boardList.get(0).getTitle());
		System.out.println("����: " + boardList.get(0).getContent());
		System.out.println("�̸�: " + boardList.get(0).getName());
		
		assertTrue(boardList != null);
		
	}
	
	@Test
	public void �ۼ���() {
		
		Board board = new Board();
		
		List<Board> boardList = boardService.selectBoardList();
		
		board = boardList.get(boardList.size() - 1);
		
		board.setBoardSeq(board.getBoardSeq());
		board.setType(EBoardType.FAQ);
		board.setTitle("�������");
		board.setContent("�������");
		board.setName("�ְ���");
		
		boolean result = boardService.updateBoard(board);
		
		assertTrue(result);
		
	}
	
	@Test
	public void �ۻ���() {
		
		Board board = new Board();
		
		List<Board> boardList = boardService.selectBoardList();
		
		board = boardList.get(boardList.size() - 1);
		
		boolean result = boardService.deleteBoard(board.getBoardSeq());
		
		assertTrue(result);
		
	}

}
