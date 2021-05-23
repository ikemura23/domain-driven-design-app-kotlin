package domain.user

/**
 * Userリポジトリinterface
 */
interface UserRepository {
    /**
     * 保存
     */
    fun save(user: User)

    /**
     * 重複確認
     */
    fun exists(user: User): Boolean
}
