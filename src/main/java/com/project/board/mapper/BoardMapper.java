package com.project.board.mapper;

import com.project.board.domain.Board;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@MapperScan
public interface BoardMapper {

    int boardCount();

    List<Board> getList();
}
