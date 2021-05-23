package domain.user

/**
 * Userリポジトリinterface
 */
interface UserRepository {
    fun exists(user: User): Boolean
}
