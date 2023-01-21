package com.jyweb.jyweb.mvc.repository;

import com.jyweb.jyweb.mvc.domain.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository {
  List<Board> getList();
  Board get(int boardSeq);
  void save(Board board);
  void delete(int boardSeq);
  void update(Board board);
}
