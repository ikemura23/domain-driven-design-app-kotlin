package domain.user

/**
 * 2.5.3 ユーザーの値オブジェクト
 */
data class User(val id: UserId, var name: UserName) {

    /**
     * ユーザー名の変更
     */
    fun changeUserName(name: UserName) {
        this.name = name
    }
}
