package domain.user

class UserApplicationService {
    fun run() {
        val userService: UserService = UserServiceImpl(UserRepositoryImpl())
    }
}
