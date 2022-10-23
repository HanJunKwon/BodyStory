package com.hanjunkwon.bodystrory.Utils

import android.content.Context

/**
 * 앱 4대 컴포넌트에서 사용할 수 있는 공통 함수를 모아 놓은 클래스.
 */
object CommonUtils {

    /**
     * 앱 패키지 명 반환하는 메소드.
     * @return 앱 패키지명 ex) com.xxxxx.xxxx.appPackageName
     */
    fun getPackageName(context: Context): String {
        return context.packageName;
    }

}