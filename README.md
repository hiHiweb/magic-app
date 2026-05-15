# 魔法おすすめアプリ（Magic Recommender）

【概要】
日常の困りごとを入力すると、独自のキーワードマッチングにより、最適な魔法をレコメンドします。
<br>例：
<br><br>-「掃除」→カビを消滅させる魔法
<br><br>-「花」→ 花畑を出す魔法 

【機能】
- キーワード入力による魔法の提案
<br>キーワードマッチング:入力テキストとMagicService 内に保持された魔法リストが持つキーワードをマッチングさせる。

【工夫した点】
- Controller Service Modelを分けて保守性を意識
- 利用者さんの検索にヒットしやすい様にListで記入

【使用技術】
<br>- Java
<br>- Spring Boot
<br>- Spring MVC
<br>- Thymeleaf
<br>- Spring Web
<br>- HTML

【構成】
```text
src/main/java/com/example/cigarette
├── MagicApplication.java
├── controller
│   └── MagicController.java
├── model
│   └── Magic.java
├── service
│   └── MagicService.java

src/main/resources/templates
├── result.html
```
