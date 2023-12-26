package com.ll.sb20231226.domain.article.article.repository;

import com.ll.sb20231226.domain.article.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    Optional<Article> findFirstByOrderByIdDesc();
}
