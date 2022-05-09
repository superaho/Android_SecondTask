package jp.techacademy.taiki.hamaguchi.android_secondtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Kurara = Human(
                "倉本寿彦", 31, "打率のあげ方"
        )
        Kurara.say()
        Kurara.think()

        val Mishima = Human(
                "三嶋一輝", 32 , "セーブ成功率のあげ方"
        )
        Mishima.say()
        Mishima.think()
    }
}

// パッケージレベルに定義した定数
const val MY_TAG = "kotlintest"