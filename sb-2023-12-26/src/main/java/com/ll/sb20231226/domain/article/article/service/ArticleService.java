package com.ll.sb20231226.domain.article.article.service;

import com.ll.sb20231226.domain.article.article.entity.Article;
import com.ll.sb20231226.domain.article.article.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public void write(String title, String content) {
        articleRepository.save(
                Article.builder()
                        .title(title)
                        .content(content)
                        .build()
        );
    }
}