package domain.user

import kotlin.random.Random

/**
 * 2.5.3 ユーザーのEntity
 */
data class User(var name: UserName) {
    var id: UserId = UserId(Random(100).nextInt().toString())
        private set

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
