package com.jyweb.jyweb.mvc.service;

import com.jyweb.jyweb.mvc.domain.Board;
import com.jyweb.jyweb.mvc.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 게시판 서비스
 * @author joony
 */
@Service
public class BoardService{
  @Autowired
  private BoardRepository repository;
  //목록 리턴
  public List<Board> getList(){
    return repository.getList();
  };
  //등록 처리
  public Board get(int boardSeq){
    return repository.get(boardSeq);
  };
  //저장 처리
  public void save(Board board){
    repository.save(board);
  };
  //삭제 처리
  public void delete(int boardSeq){
    repository.delete(boardSeq);
  };
  //수정 처리
  public void update(Board board){
    repository.update(board);
  };
}
