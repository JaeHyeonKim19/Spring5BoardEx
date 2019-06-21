package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

public interface BoardService {
	public void register(BoardVO board);
	public BoardVO get(Long bno);
	public boolean modify(BoardVO board);
	public boolean remove(Long bno);
	//public List<BoardVO> getList(); pageNum 과 amount를 파라미터로 받는(Criteria)메소드로 변경 for 페이징
	public List<BoardVO> getList(Criteria cri);
	public int getTotal(Criteria cri);
}
