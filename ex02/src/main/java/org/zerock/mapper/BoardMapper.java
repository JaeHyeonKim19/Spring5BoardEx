package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.zerock.domain.BoardVO;

public interface BoardMapper {

	//@Select("select * from tbl_board where bno > 0")
	public List<BoardVO> getList();
	
	//단순 insert의 경우는 한 번에 insert만 함. 몇 개의 값이 insert되었는지 알려주기 때문에 insert된 sql문의 pk값을 알 수 없다.
	public void insert(BoardVO board);
	//insertSelectKey는 MyBatis의 어노테이션을 이용한다. PK값을 미리 SQL을 통해 처리해두고 특정한 이름으로 보관해둔다. 그리고 그 값을 이용해 insert.
	public void insertSelectKey(BoardVO board);

	public BoardVO read(Long bno);
	
	public int delete(Long bno);
	
	public int update(BoardVO board);
}
