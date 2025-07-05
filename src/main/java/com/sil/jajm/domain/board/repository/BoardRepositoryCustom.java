package com.sil.jajm.domain.board.repository;

import com.sil.jajm.domain.board.dto.BoardDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BoardRepositoryCustom {

    Page<BoardDto.Response> findBoardAll(BoardDto.Search search, Pageable pageable);
}
