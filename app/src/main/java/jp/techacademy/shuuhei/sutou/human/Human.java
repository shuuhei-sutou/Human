package jp.techacademy.shuuhei.sutou.human;

import android.util.Log;

/**
 * Created by user on 2018/02/26.
 */

public class Human extends Animal implements Thinkable{

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void say(){
        Log.d("javatest", "私の名前は" + this.name + "です。");
        Log.d("javatest", "年は" + this.age + "歳です。");
    }

    @Override
    public void think(String hobby){
        Log.d("javatest", "私は" + hobby + "について考える");
    }

}
