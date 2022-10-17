package com.hanjunkwon.bodystrory.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hanjunkwon.bodystrory.R

/**
 * 앱이 실행 시 가장 처음 호출되는 Activity
 */
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }
}