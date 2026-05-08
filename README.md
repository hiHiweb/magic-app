# 魔法おすすめアプリ（Magic Recommender）

【概要】
入力した内容に応じておすすめの魔法を表示するWebアプリです。

例：
-「掃除」→ 部屋をきれいにする魔法
-「花」→ 花を咲かせる魔法

【使用技術】
- Java
- Spring Boot
- Spring MVC
- Thymeleaf
- HTML 

【機能】
キーワード入力による魔法の提案

【工夫した点】
Controller Service Modelを分けて保守性を意識

【構成】
src-main-java/com/example/magic-controller
                               -service
                               
         -resources/templates-result.html
