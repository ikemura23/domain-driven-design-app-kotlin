package domain.user

import java.lang.IllegalArgumentException

/**
 * UserIdの値オブジェクト
 */
data class UserId(val value: String) {
    init {
        if (value.isEmpty()) throw IllegalArgumentException("UserIdに空白は許可されていない")
    }
}