package domain.user

class UserRepositoryImpl : UserRepository {
    override fun save(user: User) {
        // TODO: DBに保存する処理
    }

    override fun find(userName: UserName): Boolean {
        // TODO: DBにuserNameを重複チェックする処理
        return false
    }

    override fun find(userId: UserId): Boolean {
        // TODO: DBにuserIdを重複チェックする処理
        return true
    }

    override fun delete(user: User) {
        // TODO: DBからuserを削除
    }
}
