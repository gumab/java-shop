package com.ebayko.shimba.javashop.service.impl;

import com.ebayko.shimba.javashop.domain.Board;
import com.ebayko.shimba.javashop.repository.BoardRepository;
import com.ebayko.shimba.javashop.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BoardServiceImpl implements BoardService {
    @Autowired
    BoardRepository boardRepository;

    @Override
    @Transactional
    public Board addBoard(Board board) {
        return boardRepository.save(board);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Board> getBoards(String searchType, String searchStr, int page) {
        Page<Board> boardPage = null;
        // 한페이지에 보여질 건수는 5, 페이지는 0부터 시작
        PageRequest pageRequest = PageRequest.of(page, 5);
        if ("title".equals(searchType)) {
            boardPage = boardRepository.findAllByTitleContains(searchStr, pageRequest);
        } else if ("content".equals(searchType)) {
            boardPage = boardRepository.findAllByContentContains(searchStr, pageRequest);
        } else {
            boardPage = boardRepository.findAllBy(pageRequest);
        }
        return boardPage;
    }
}
