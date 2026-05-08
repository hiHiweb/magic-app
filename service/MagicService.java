package com.example.magic.service;

import org.springframework.stereotype.Service;
@Service
public class MagicService {
public String recommend(String input){String lowerInput=input.toLowerCase();
if(lowerInput.contains("大豆")){return "カビを消滅させる魔法<br><br>メモ:まず納豆か味噌を用意してこの魔法をかける";}
if(lowerInput.contains("花")){return"花を咲かせる魔法";}
if(lowerInput.contains("燈の漢字が完成させられない")) {return"火を出す魔法<br><br>燈など火偏の漢字を完成させられる";}
if(lowerInput.contains("地域密着型のアイディアが出てこない")) {return"背中の痒い部分を掻く魔法";}
if(lowerInput.contains("ハイチュウのリンゴ味を作る時に赤リンゴを買ってきてしまった時")){return"赤リンゴを青リンゴに変える魔法";}
if(lowerInput.contains("キーケンパを読みやすくしたい")) {return"パンケーキを上手にひっくり返す魔法";}
if(lowerInput.contains("血糖値が気になる")) {return"甘い葡萄を酸っぱい葡萄に変える魔法<br><br>甘いものを食べてる高揚感を感じながら葡萄が食べられる";}
if(lowerInput.contains("対面に渡りたい")) {return"かき氷を出す魔法<br><br>コンクリートに氷を混ぜでひび割れを防ぐ";}
if(lowerInput.contains("ヒーローになりたい")) {return"底なし沼から引っこ抜く魔法<br><br>どん底にいる人を救う";}
if(lowerInput.contains("自由研究が終わらない")) {return"失くした装飾品を探す魔法<br><br>人に物々交換してもらってどこまで行くのか、または旅の中でこの装飾品が何と交換され続けるのか記録して提出する";}
if(lowerInput.contains("ウィンドウォッシャーを継ぎ足したときに手を洗わずにそのままハンドルを握れる")) {return"しつこい油汚れを取る魔法";}
if(lowerInput.contains("恩返しをしたい")) {return"呪い返しの魔法　願いよりも強い呪いに変換して、幸せを届ける";}
if(lowerInput.contains("体を鍛えたい")){return"花畑を出す魔法<br><br>ダイエットをすると普段より食費が嵩むのでブロッコリーだけでも魔法で出させてもらう　蕾が開花しない様に調節する";}
return"なし";}}

