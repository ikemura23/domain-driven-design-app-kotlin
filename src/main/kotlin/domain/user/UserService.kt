package domain.user

/**
 * 4.2.2 Userのドメインサービス
 */
class UserService {

    /**
     * 重複を確認する
     */
    fun exists(user: User): Boolean {
        return true
    }
}
