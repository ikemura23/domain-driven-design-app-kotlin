package domain.user

/**
 * 2.5.3 ユーザーの値オブジェクト
 */
data class User(val id: UserId, var name: UserName) {

    /**
     * ユーザー名の変更
     * 4.3 サービスクラスに持たせたいが、ユーザー名を変更するふるまいはUserクラスにもたせる。
     * 理由は、変更するための条件があったとき、その条件はUserというドメインの制限だからである。
     * Valueオブジェクトの制限はサービスではなく、ドメインオブジェクトに持たせるべき
     */
    fun changeUserName(name: UserName) {
        this.name = name
    }
}
