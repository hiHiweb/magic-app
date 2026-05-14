# 魔法おすすめアプリ（Magic Recommender）

【概要】
日常の困りごとを入力すると、独自のキーワードマッチングにより、最適な魔法をレコメンドします。
例：
<br>-「掃除」→カビを消滅させる魔法
<br>-「花」→ 花畑を出す魔法

【使用技術】
- Java
- Spring Boot
- Spring MVC
- Thymeleaf
- Spring Web
- HTML 

【機能】
-キーワード入力による魔法の提案
-キーワードマッチング:入力テキストとMagicService 内に保持された魔法リストが持つキーワードをマッチングさせる。

【工夫した点】
<br><br>Controller Service Modelを分けて保守性を意識<br><br>利用者さんの検索にヒットしやすい様にListで記入

【構成】
src-main-java/com/example/magic-controller
                               -service
                               -Model
                               -MagicApplication
src/main/resources/templates/result.html
