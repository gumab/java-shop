package com.ebayko.shimba.javashop.repository;

import com.ebayko.shimba.javashop.domain.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository
        extends JpaRepository<Board, Long> {
    public Page<Board> findAllBy(Pageable pageable);
    public Page<Board> findAllByTitleContains(String title, Pageable pageable);
    public Page<Board> findAllByContentContains(String content, Pageable pageable);
}
