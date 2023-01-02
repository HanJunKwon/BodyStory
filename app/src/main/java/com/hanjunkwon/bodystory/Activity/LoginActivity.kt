package com.hanjunkwon.bodystory.Activity

import android.os.Bundle
import com.hanjunkwon.bodystory.R
import com.hanjunkwon.bodystory.databinding.ActivityLoginBinding

class LoginActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        // View Binding
        val viewBinding by lazy { ActivityLoginBinding.inflate(layoutInflater) }

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // 컴포넌트 초기화 및 이벤트 등록
        setViewBinding()

        // 자동로그인 여부
    }

    // <editor-fold desc="화면">

    /**
     * 로그인 액티비에서 사용하는 컴포넌트 초기화 및 이벤트 등록하는 메소드
     */
    private fun setViewBinding() {



    }

    // </editor-fold>
}