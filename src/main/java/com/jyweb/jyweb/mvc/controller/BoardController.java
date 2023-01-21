package com.jyweb.jyweb.mvc.controller;

import com.jyweb.jyweb.mvc.domain.Board;
import com.jyweb.jyweb.mvc.repository.BoardRepository;
import com.jyweb.jyweb.mvc.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/board")
public class BoardController{
  @Autowired
  private BoardService boardService;
  //목록 리턴
  @GetMapping
  public List<Board> getList(){
    return boardService.getList();
  };
  //등록 처리
  @GetMapping("/{boardSeq}")
  public Board get(@PathVariable int boardSeq){
    return boardService.get(boardSeq);
  };
  //등록/수정 처리
  @GetMapping("/save")
  public void save(Board board){
    boardService.save(board);
  };
  //수정 처리
  @GetMapping("/update")
  public void update(Board board){
    boardService.update(board);
  };
  //삭제 처리
  @GetMapping("/delete/{boardSeq}")
  public void delete(@PathVariable int boardSeq){
    boardService.delete(boardSeq);
  };
}
