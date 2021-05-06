package domain

import java.lang.IllegalArgumentException

/**
 * 2.5.2 ユーザー名の値オブジェクト
 */
data class UserName(val value: String) {
    init {
        // 値オブジェクト側にルールを作成するべきである
        if (value.length >= 3) throw IllegalArgumentException("ユーザー名は3文字以上です。")
    }
}