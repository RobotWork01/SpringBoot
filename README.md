# SpringBoot
スプリングブート
```
＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋
＋　Spring Bootプログラム実装手順（簡単なWEB画面アプリ）
＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋
```

参考：<a href="https://qiita.com/t-shin0hara/items/687085ec34ae78ca2260">https://qiita.com/t-shin0hara/items/687085ec34ae78ca2260</a><br/>

> ### Spring Boot + Spring MVC ～サンプルアプリ実装～
■まず、Springスターター・プロジェクトがインストールされているのかどうかを確認する。
```
IDE（Eclipse）を起動し、メニューバーから「ファイル」 > 「新規」 > 「その他」を選択すると、ウィンドウ「ウィザードを選択」画面が起動します。
その画面内の「ウィザードを選択する」リストの中から、「Spring Boot」フォルダーを展開し、「Spring スターター・プロジェクト（Spring Initializr）」があるか確認します。
（「Spring スターター・プロジェクト」を利用できる状況であることを確認します。）
```
<img width="1065" height="553" alt="image" src="https://github.com/user-attachments/assets/6c133161-5175-46a5-b6de-542a7f99b60c" />

> ### 依存関係で以下にチェックを入れて[完了]ボタンを押下します。<br/>
▼開発ツール・Spring Boot DevTools  ・Lombok   ▼テンプレート・エンジン・Thymeleaf   ▼Web ・Spring Web<br/>
<img width="1053" height="541" alt="image" src="https://github.com/user-attachments/assets/0b975b60-fac2-4a2e-a550-10efc15b56e4" />

<img width="807" height="356" alt="image" src="https://github.com/user-attachments/assets/6340ee7e-05df-40ea-a5bd-d2a553223b24" />

> ### ●Spring Bootプログラムを実行すると、コンパイルエラーが表示されてしまい、プログラム実行失敗しました。
```
Exception in thread "main" java.lang.UnsupportedClassVersionError: org/springframework/boot/SpringApplication has been compiled by a more recent version of the Java Runtime (class file version 61.0), this version of the Java Runtime only recognizes class file versions up to 59.0
	at java.base/java.lang.ClassLoader.defineClass1(Native Method)
	at java.base/java.lang.ClassLoader.defineClass(ClassLoader.java:1016)
	at java.base/java.security.SecureClassLoader.defineClass(SecureClassLoader.java:151)
	at java.base/jdk.internal.loader.BuiltinClassLoader.defineClass(BuiltinClassLoader.java:825)
	at java.base/jdk.internal.loader.BuiltinClassLoader.findClassOnClassPathOrNull(BuiltinClassLoader.java:723)
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClassOrNull(BuiltinClassLoader.java:646)
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:604)
	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:168)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:522)
	at com.example.demo.SpringMvc2Application.main(SpringMvc2Application.java:10)
```

> ### ●どうすれば解決するのか、インターネット検索して調査しました。<br/>
参考：https://stackoverflow.com/questions/47457105/class-has-been-compiled-by-a-more-recent-version-of-the-java-environment

```
While running a script, I am getting the following error message in the Eclipse console:
Class has been compiled by a more recent version of the Java Environment (class file version 53.0), this version of the Java Runtime only recognizes class file versions up to 52.0.
This is just a version mismatch. You have compiled your code using Java version 9 and your current JRE is version 8. Try upgrading your JRE to 9.
49 = Java 5
50 = Java 6
51 = Java 7
52 = Java 8
53 = Java 9
54 = Java 10
55 = Java 11
56 = Java 12
57 = Java 13
58 = Java 14
59 = Java 15
60 = Java 16
61 = Java 17　　　・・・・・・・java 17をダウンロード（インストール）すると解決することを確認できました！！
62 = Java 18
63 = Java 19
64 = Java 20
65 = Java 21
```

> ### ●java 17をダウンロード（インストール）しました。
https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html<br/>
jdk-17.0.12_windows-x64_bin.msi<br/>
<img width="361" height="275" alt="image" src="https://github.com/user-attachments/assets/a8fe09a6-98a4-4be2-9c1f-db0bcf0b7d0c" />
```
配布する場合には、Jarファイルを作成します。
cd C:\Users\XXXXX\OneDrive\ドキュメント\JAVA\workspace\spring-mvc3\target\classes\
```
> ### Jarファイル作成（圧縮ファイルを作成）
<img width="824" height="403" alt="image" src="https://github.com/user-attachments/assets/291fc6fe-dcba-4090-a988-61595574dd03" />

> ### ＜開発時のJAVA実行方法＞ javawコマンドでJAVA実行する。
C:\pleiades\2025-06\java\17\bin\javaw -Dfile.encoding=UTF-8  com.example.demo.SpringMvc3Application

> ### 配布する場合には、Jarファイルを作成します。
cd C:\Users\XXXXX\OneDrive\ドキュメント\JAVA\workspace\spring-mvc3\target\classes\

> ### Jarファイル作成（圧縮ファイルを作成）
C:\pleiades\2025-06\java\17\bin\jar cvfm spring-mvc3.jar META-INF\MANIFEST.MF com\example\demo\*.class
```
マニフェストが追加されました
com/example/demo/SpringMvc3Application.classを追加中です(入=751)(出=425)(43%収縮されました)
```
> ### C:\Users\XXXXX\OneDrive\ドキュメント\JAVA\workspace\spring-mvc3\target\classes>dir *.jar
```
ドライブ C のボリューム ラベルは Windows です
 ボリューム シリアル番号は B825-1DF9 です
 C:\Users\XXXXX\OneDrive\ドキュメント\JAVA\workspace\spring-mvc3\target\classes のディレクトリ
2025/09/17  22:45             1,011 spring-mvc3.jar
               1 個のファイル               1,011 バイト
               0 個のディレクトリ   6,265,737,216 バイトの空き領域
```

> ### Jarファイルを実行すると、エラーが表示され、失敗しました。
C:\pleiades\2025-06\java\17\bin\java -jar spring-mvc3.jar
```
spring-mvc3.jarにメイン・マニフェスト属性がありません
```

> ### Jarファイルを解凍してみます。
C:\pleiades\2025-06\java\17\bin\jar xvf spring-mvc3.jar
```
  META-INF/が作成されました
 META-INF/MANIFEST.MFが展開されました
 com/example/demo/SpringMvc3Application.classが展開されました
```

> 解凍した中身を確認します
C:\Users\XXXXX\OneDrive\ドキュメント\JAVA\workspace\spring-mvc3\target\classes>tree/F
```
C:.
│  application.properties
│  spring-mvc3.jar
│
├─com
│  └─example
│      └─demo
│              SpringMvc3Application.class
│
├─META-INF
│  │  MANIFEST.MF
│  │
│  └─maven
│      └─com.example
│          └─spring-mvc3
│                  pom.properties
│                  pom.xml
│
└─templates
        confirm.html
        form.html
```

> マニュフェストファイルにメインクラスを追加します。
C:\Users\XXXXX\OneDrive\ドキュメント\JAVA\workspace\spring-mvc3\target\classes>type META-INF\MANIFEST.MF
```
Manifest-Version: 1.0
Build-Jdk-Spec: 11
Implementation-Title: spring-mvc3
Implementation-Version: 0.0.1-SNAPSHOT
Created-By: Maven Integration for Eclipse
Main-Class: com.example.demo.SpringMvc3Application
```

> もう一度、Jarファイル作成（圧縮ファイルを再作成）
C:\pleiades\2025-06\java\17\bin\jar cvfm spring-mvc3.jar META-INF\MANIFEST.MF com\example\demo\*.class
```
マニフェストが追加されました
com/example/demo/SpringMvc3Application.classを追加中です(入=751)(出=425)(43%収縮されました)
```

> Jarファイルを実行すると、NoClassDefFoundErrorとなり、スプリングブート・プログラム実行に失敗する。
"C:\pleiades\2025-06\java\17\bin\java" -jar "spring-mvc3.jar"
```
Exception in thread "main" java.lang.NoClassDefFoundError: org/springframework/boot/SpringApplication
        at com.example.demo.SpringMvc3Application.main(SpringMvc3Application.java:18)
Caused by: java.lang.ClassNotFoundException: org.springframework.boot.SpringApplication
        at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
        at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:525)
        ... 1 more
```

> EclopseでJavawコマンド実行（Jarファイルを作成しないまま、スプリングブート・プログラム実行すると成功するのに）
Jarファイルを作成してからプログラム実行すると失敗する（疑問が残りました・・・）
