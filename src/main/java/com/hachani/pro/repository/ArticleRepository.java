package com.hachani.pro.repository;

import org.springframework.data.repository.CrudRepository;

import com.hachani.pro.model.Article;


public interface ArticleRepository extends CrudRepository<Article, Long>{

}
