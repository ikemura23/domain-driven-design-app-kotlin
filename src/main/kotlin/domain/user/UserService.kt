package domain.user

/**
 * 4.2.2 Userのドメインサービス
 */
interface UserService {
    fun exists(userName: UserName): Boolean
}

class UserServiceImpl(private val userRepository: UserRepository) : UserService {

    /**
     * 重複を確認する
     */
    override fun exists(userName: UserName): Boolean = userRepository.find(userName)
}
