package jp.techacademy.taiki.hamaguchi.android_secondtask

import android.util.Log

class Human: Animal, Thinkable {
    var bobby: String

    constructor(name: String, age: Int, bobby: String): super(name, age) {
        this.bobby = bobby
    }

    override fun say() {
        Log.d(MY_TAG, "私の名前は"+ this.name +"です。年は"+ this.age +"歳です。")
    }

    override fun think() {
        Log.d(MY_TAG, "私は" + this.bobby + "について考える。")
    }
}