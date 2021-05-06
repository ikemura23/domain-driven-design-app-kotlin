package domain

/**
 * 氏名を格納する値オブジェクト
 * - プロパティは不変である
 */
data class FullName(val firstName: String, val lastName: String) {
    init {
        // 2.3 値のチェックは値オブジェクト内で行われるべき
        require(firstName.isNotEmpty())
        require(lastName.isNotEmpty())
    }
}