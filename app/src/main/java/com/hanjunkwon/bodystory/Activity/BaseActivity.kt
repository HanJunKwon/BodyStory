package com.hanjunkwon.bodystory.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hanjunkwon.bodystory.R

/**
 * 모든 액티비티를 상속하는 최상위 액티비티.
 * 액티비에서 사용하는 공통 메소드 또는 생명 주기에 따라 공통 로직을 처리한다.
 */
open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }

    // <editor-fold desc="공통 함수">
    /**
     * 사용자의 자동로그인 여부를 반환.
     * @return 사용자 자동로그인 여부
     */
    fun isAutoLogin() : Boolean {


        return false;
    }
    // </editor-fold>
}