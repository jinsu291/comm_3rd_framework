package com.ll.exam.service;

import com.ll.exam.annotation.Autowired;
import com.ll.exam.annotation.Service;
import com.ll.exam.repository.ArticleRepository;

// ArticleController는 ArticleService에게 의존한다.
@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;
}
