package com.hachani.pro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.hachani.pro.model.Article;
import com.hachani.pro.model.Provider;

public interface ProviderRepository extends CrudRepository<Provider, Long> {
	
	@Query("FROM Article a WHERE a.provider.id = ?1")
	List<Article> findArticlesByProvider(long id);


}
