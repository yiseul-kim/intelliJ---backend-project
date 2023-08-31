package com.project.board.mapper;

import com.project.board.domain.Board;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

@Repository
@MapperScan
public interface BoardMapper {

    int boardCount();

    List<Board> getList();

    Board getBoard(Long boardId);

    void uploadBoard(Board board);

    void updateBoard(Board board);

    void deleteBoard(Long boardId);


}
