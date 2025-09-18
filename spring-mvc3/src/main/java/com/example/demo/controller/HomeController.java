package com.example.demo.controller;
/*
 *参考：
 *https://qiita.com/t-shin0hara/items/687085ec34ae78ca2260
 *Spring Boot + Spring MVC ～サンプルアプリ実装～
 *
 *Spring Bootとは？
 *Spring Frameworkに含まれるフレームワークの一つで、 Spring Frameworkの機能を使いやすくするため のフレームワーク。
*/
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.User;

/*＜アノテーション＞
 * @Controller
 *  org.springframework.stereotype.Controller （読み方「オアグ・スプリングフレームワーク・ステレオタイプ・コントローラー」）
 * 「１．HTTPリクエストを受け取り」、
 * 「２．適切な処理を行って」、
 * 「３．レスポンスを返す役割を担う」
 *
 * @GetMapping
 * org.springframework.web.bind.annotation.GetMapping （読み方「ゲットマッピング」）﻿
 * Spring FrameworkにおいてHTTPのGETリクエストを受け付けるメソッドを定義するためのアノテーションです。
 *
 * @PostMapping
 * org.springframework.web.bind.annotation.PostMapping（読み方「ポストマッピング」﻿）
 * Spring FrameworkにおいてHTTPのPOSTリクエストを受け付けるメソッドを定義するためのアノテーションです。﻿
 *
 * @ModelAttribute
 * org.springframework.web.bind.annotation.ModelAttribute（読み方「モデルアトリビュート」）
 * リクエストパラメータをモデルオブジェクトに変換し、Controllerの引数として受け取るためのアノテーションです。﻿
 *
 */

@Controller
public class HomeController {

	//Get送信
    @GetMapping("/form")
    private String readForm(@ModelAttribute User user) {
        return "form";
    }

	//Post送信
    @PostMapping("/form")
    private String confirm(@ModelAttribute User user) {
        return "confirm";
    }
}
