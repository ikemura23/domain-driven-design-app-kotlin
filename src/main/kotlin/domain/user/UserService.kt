package domain.user

/**
 * 4.2.2 Userのドメインサービス
 */
class UserService(private val userRepository: UserRepository) {

    /**
     * 重複を確認する
     */
    fun exists(userName: UserName): Boolean = userRepository.find(userName)
}
