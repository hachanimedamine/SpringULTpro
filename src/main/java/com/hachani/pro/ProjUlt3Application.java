package com.hachani.pro;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hachani.pro.controller.ArticleController;

@SpringBootApplication
public class ProjUlt3Application {

	public static void main(String[] args) {
		new File(ArticleController.uploadDirectory).mkdir();
		SpringApplication.run(ProjUlt3Application.class, args);
	}

}
