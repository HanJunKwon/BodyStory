package com.hanjunkwon.bodystrory.Utils

import android.content.Context
import android.content.SharedPreferences

/**
 * App에서 생성되는 데이터를 SharedPreference에 저장하는 메소드로
 * 특정 Activity에만 저장하는 데이터는 없고 모든 데이터는 Context로 저장되어 데이터를 공유한다.
 */
class SharedPreferenceUtils(context: Context) {
    // <editor-fold desc="상수">
    val TAG = SharedPreferenceUtils::class.java.simpleName
    // </editor-fold>

    private lateinit var mContext: Context
    init {
        this.mContext = context
    }

    private fun createSharedPreference(): SharedPreferences {
        BSLog.d(TAG, "createSharedPreference()")

        return mContext.getSharedPreferences(CommonUtils.getPackageName(mContext), Context.MODE_PRIVATE)
    }

    // <editor-fold desc="값 저장">
    /**
     * 문자열 데이터 저장하는 메소드
     * @param key 문자열 데이터의 key 값
     * @param value 저장한 문자열 데이터
     */
    fun saveSharedPreference(key: String, value: String) {
        BSLog.d(TAG, "saveSharedPreference() :: key: ${key}, value: ${value}")

        // 수신 객체가 Non-nullable이고 반환이 필요하는 경우에는 with 사용
        with (createSharedPreference().edit()) {
            putString(key, value)
            apply()
        }
    }
    // </editor-fold>


    // <editor-fold desc="저장된 값 반환">
    /**
     * SharedPreference에 저장된 값을 반환하는 메소드.
     * @param key
     * @param defaultValue
     * @return
     */
    fun getSharedPreference(key: String, defaultValue: String): String {
        BSLog.d(TAG, "getSharedPreference() :: key: ${key}, defaultValue: ${defaultValue}")

        return createSharedPreference().run {
            getString(key, defaultValue)?: defaultValue
        }
    }
    // </editor-fold>
}