package com.example.demo.model;
/*
 *参考：
 *https://qiita.com/t-shin0hara/items/687085ec34ae78ca2260
 *Spring Boot + Spring MVC ～サンプルアプリ実装～
 *
 *Spring Bootとは？
 *Spring Frameworkに含まれるフレームワークの一つで、 Spring Frameworkの機能を使いやすくするため のフレームワーク。
 */

import lombok.Data;		//ロンボック・・・定型コード記述の省力化に役立つJavaアノテーションライブラリ
/*
 * アノテーション
 * @Data（読み方「アットマーク データ」）
 * Spring Boot における @Data アノテーションは、 Lombok プロジェクトが提供するものです。
 *
 * これは、クラスに対して自動的に @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode などの
 * 複数のアノテーションを一度に適用する便利な機能です。
 * これにより、冗長なゲッター、セッター、コンストラクタなどのコードを記述する手間を省き、
 * コードの可読性と生産性を向上させます。﻿
 */
@Data
public class User {
    private String name;
    private String email;
    private Integer age;
}
