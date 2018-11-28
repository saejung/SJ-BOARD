package com.sjBoard.dao;

import java.util.List;

import com.sjBoard.domain.BoardMasterVO;
import com.sjBoard.domain.BoardSearchVO;
import com.sjBoard.domain.BoardVO;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper
public interface SjBoardMapper {
	BoardMasterVO selectBoardMasterList(long bodId);
	List<BoardVO> selectBoardList(BoardSearchVO boardSearchVO);
	int selectBoardListTotalCnt(long bodId);
	BoardVO selectBoard(long bodIdx);
	int update(BoardVO boardVO);
	int delete(BoardVO boardVO);
}
