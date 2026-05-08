package com.example.magic.service;

import org.springframework.stereotype.Service;
@Service
public class MagicService {
public String recommend(String input){String lowerInput=input.toLowerCase();
if(lowerInput.contains("おいしい大豆")){return "カビを消滅させる魔法<br><br>メモ:まず納豆か味噌を用意してこの魔法をかける";}
if(lowerInput.contains("花")){return"花を咲かせる魔法";}
if(lowerInput.contains("冷たい水")) {return"かき氷を出す魔法<br><br>あとで冷たい水を飲みたい時に使える";}
if(lowerInput.contains("アイディアがわかない")) {return"背中の痒い部分を掻く魔法";}
if(lowerInput.contains("リンゴ味のハイチュウ")){return"赤リンゴを青リンゴに変える魔法<br><br>ハイチュウを作るときに赤リンゴを買ってきてしまった時に使える";}
if(lowerInput.contains("キーケンパ")) {return"パンケーキを上手にひっくり返す魔法<br><br>キーケンパが読みやすくなる";}
if(lowerInput.contains("血糖値")) {return"甘い葡萄を酸っぱい葡萄に変える魔法<br><br>甘いものを食べてる高揚感を感じながら葡萄が食べられる";}
if(lowerInput.contains("向こう岸に渡りたい")) {return"かき氷を出す魔法<br><br>コンクリートに氷を混ぜでひび割れを防ぐ";}
if(lowerInput.contains("ヒーロー")) {return"底なし沼から引っこ抜く魔法<br><br>どん底にいる人を救いヒーローになれる";}
if(lowerInput.contains("自由研究")) {return"失くした装飾品を探す魔法<br><br>人に物々交換してもらってどこまで行くのか、または旅の中でこの装飾品が何と交換され続けるのか記録して提出できる。";}
if(lowerInput.contains("ウィンドウォッシャー")) {return"しつこい油汚れを取る魔法<br><br>ウィンドーウォッシャーを追加した時に手を洗わずにそのまま出かけられる";}
if(lowerInput.contains("体を鍛える")){return"花畑を出す魔法<br><br>ダイエットをすると普段より食費が嵩むのでブロッコリーだけでも魔法で出させてもらう<br><br>メモ:蕾が開花しない様に調節する";}
return"なし";}}

