package com.example.magic.service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.magic.model.Magic;

@Service
public class MagicService{
private List<Magic>magicList=new ArrayList<>();
public MagicService() {
magicList.add(new Magic("カビを消滅させる魔法<br><br>納豆か味噌にこの魔法をかけると大豆が出てくる",Arrays.asList("大豆")));
magicList.add(new Magic("カビを消滅させる魔法<br><br>日用品メーカーに震撼が走る",Arrays.asList("カビ","掃除","きれい","汚い","綺麗")));
magicList.add(new Magic("火を出す魔法<br><br>「無人島に1つだけ持って行くとしたら」の質問に実質2個持っていける",Arrays.asList("火","無人島","キャンプ","遭難")));
magicList.add(new Magic("背中の痒い部分を搔く魔法",Arrays.asList("新規格","革命的","アイディア")));
magicList.add(new Magic("赤リンゴを青リンゴに変える魔法<br><br>ハイチュウを作るときに赤リンゴを間違えて買ってきてしまった時に使える",Arrays.asList("ハイチュウ","リンゴ","りんご","林檎")));
magicList.add(new Magic("パンケーキを上手にひっくり返す魔法<br><br>キーケンパを読みやすくする",Arrays.asList("キーケンパ")));
magicList.add(new Magic("パンケーキを上手にひっくり返す魔法<br><br>タネと火と鉄板があればパンケーキが食べられる",Arrays.asList("パンケーキ","すいた","空いた")));
magicList.add(new Magic("かき氷を出す魔法<br><br>後で冷たい水を飲める",Arrays.asList("冷たい水","喉","のど")));
magicList.add(new Magic("底なし沼から引っこ抜く魔法<br><br>どん底にいる人を救う",Arrays.asList("ヒーロー","偽善者","助")));
magicList.add(new Magic("失くした装飾品を探す魔法<br><br>人に物々交換をしてもらって、どの様な人に何と交換されるのか記録して提出する<br><br>漫画に装飾品を付けておき、催促が来た時に時間を省ける",Arrays.asList("自由研究","漫画","借りパク")));
magicList.add(new Magic("しつこい油汚れを取る魔法<br><br>ウィンドーウォッシャーを継ぎ足した時にそのままハンドルを握れる",Arrays.asList("手","油","汚れ","車")));
magicList.add(new Magic("花畑を出す魔法<br><br>ダイエットをすると普段より食費が嵩むのでブロッコリーだけでも魔法で出させてもらう<br>*蕾が開花しない様に要調節",Arrays.asList("体","身体","鍛")));
magicList.add(new Magic("パンケーキを上手にひっくり返す魔法",Arrays.asList("腹","すいた","空いた")));
magicList.add(new Magic("服の汚れをきれいさっぱり落とす魔法<br><br>デート中に知らない子どもがぶつかって来て服にアイスクリームが付いても落とせる",Arrays.asList("服","よごれ","汚れ")));
magicList.add(new Magic("服が透けて見える魔法<br><br>いつでもT.M Revolutionができる",Arrays.asList("出し物","余興")));
magicList.add(new Magic("高速で移動する魔法<br><br>早く帰れる、遅刻を免れられるかもしれない、「早すぎて見えない」が実現できる",Arrays.asList("帰","帰宅","遅刻")));
magicList.add(new Magic("高速で移動する魔法<br><br>有給の節約できる",Arrays.asList("旅行","有給")));
magicList.add(new Magic("甘い葡萄を酸っぱい葡萄に変える魔法<br><br>酸っぱい状態で寝れる人は少ないでしょう",Arrays.asList("眠い","眠気","ねむい")));}
public String recommend(String input) {
    String lowerInput = input.toLowerCase();

    for (Magic magic : magicList) {
        for (String keyword : magic.getKeywords()) {
            String lowerKeyword = keyword.toLowerCase();

            if (lowerInput.contains(lowerKeyword)
                    || lowerKeyword.contains(lowerInput)) {
                return magic.getName();
            }
        }
    }

    return "なし";
}}
