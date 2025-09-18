package com.example.demo;
/*
 *参考：
 *https://qiita.com/t-shin0hara/items/687085ec34ae78ca2260
 *Spring Boot + Spring MVC ～サンプルアプリ実装～
 *
 *Spring Bootとは？
 *Spring Frameworkに含まれるフレームワークの一つで、 Spring Frameworkの機能を使いやすくするため のフレームワーク。
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
 * アノテーション
 * @SpringBootApplication（読み方「スプリングブートアプリケーション」）
 * JavaのmainメソッドからSpringアプリケーションを起動しブートストラップするために使用されます。
 *
 */

@SpringBootApplication
public class SpringMvc3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvc3Application.class, args);
	}

}
