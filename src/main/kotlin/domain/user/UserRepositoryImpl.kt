package domain.user

class UserRepositoryImpl : UserRepository {
    override fun save(user: User) {
        // TODO: DBに保存する処理
    }

    override fun find(user: User): Boolean {
        // TODO: DBに重複チェックする処理
        return false
    }
}
