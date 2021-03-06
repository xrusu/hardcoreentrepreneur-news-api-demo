package com.codingshadows.newsapidemo.repository;

import com.codingshadows.newsapidemo.model.News;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface NewsRepository extends JpaRepository<News, Long> {
    List<News> findAllByAuthorId(Long authorId);
}
