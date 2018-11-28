package com.sjBoard.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sjBoard.dao.SjBoardMapper;
import com.sjBoard.domain.BoardSearchVO;
import com.sjBoard.domain.BoardVO;

@Controller
@RequestMapping("/board")
public class SjBoardController {
	
	@Autowired
	private SjBoardMapper sjBoardMapper;
	
/*	@Autowired
	private BoardService boardService;*/
	
	@RequestMapping(value=("/{bodId}"), method = RequestMethod.GET)
	public String boardList(@PathVariable int bodId, BoardSearchVO boardSearchVO, ModelMap model) throws Exception
	{
		boardSearchVO.getPagination().setTotalRecordCnt(sjBoardMapper.selectBoardListTotalCnt(bodId));
		model.addAttribute("boardMaster", sjBoardMapper.selectBoardMasterList(bodId));
		model.addAttribute("boardList", sjBoardMapper.selectBoardList(boardSearchVO));
		return "board/list";
	}
	
	@RequestMapping(value=("/{bodId}/{bodIdx}"), method = RequestMethod.GET)
	public String boardDetail(@PathVariable long bodIdx, BoardVO boardVO, ModelMap model) throws Exception
	{
		model.addAttribute("board", sjBoardMapper.selectBoard(bodIdx));
		return "board/detail";
	}
	
	@RequestMapping(value=("/write"), method = RequestMethod.GET)
	public String boardWrite() throws Exception
	{
		return "board/write";
	}
	
}
