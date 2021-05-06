package domain

/**
 * 氏名を格納する値オブジェクト
 * - プロパティは不変である
 */
data class FullName(val firstName: String, val lastName: String) {
    init {
        // 2.3 値のチェックは値オブジェクト内で行われるべき
//        require(firstName.isNotEmpty())
//        require(lastName.isNotEmpty())

        // こちらのチェックのほうが親切
        if (firstName.isEmpty()) throw IllegalArgumentException("firstNameは1文字以上である必要があります。")
        if (lastName.isEmpty()) throw IllegalArgumentException("lastNameは1文字以上である必要があります。")

        if (!validateName(firstName)) throw IllegalArgumentException("許可されていない文字が使われています。")
        if (!validateName(lastName)) throw IllegalArgumentException("許可されていない文字が使われています。")
    }

    /**
     * 値のバリデーション
     */
    private fun validateName(value: String): Boolean {
        // アルファベットに限定する
        return Regex("""^[A-Za-z]+$""").matches(value)
    }
}