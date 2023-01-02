package com.hanjunkwon.bodystory.Utils

import android.util.Log

object BSLog {

    /**
     * 태그가 없는 개발 로그 출력하는 메소드.
     * @param message 로그 메세지
     */
    fun d(message: String) {
        Log.d("", message);
    }

    /**
     * 태그가 있는 개발 로그 출력하는 메소드.
     * @param tag 로그 필터링에 사용할 태그
     * @param message 로그 메세지
     */
    fun d(tag: String, message: String) {
        Log.d(tag, message);
    }
}