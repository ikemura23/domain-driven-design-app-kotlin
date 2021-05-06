import domain.FullName

fun main() {
    println("chapter2")
    chapter2()

}

private fun chapter2() {
    // 値オブジェクトを作成
    val name = FullName(firstName = "ikemura", lastName = "kazutaka")
    println("${name.firstName} ${name.lastName}")

    // 値オブジェクトは代入できない
    // name.firstName = ""

    // 値を変更するには交換しかない
    val name2 = FullName(firstName = name.firstName, "hoge")
    println("${name2.firstName} ${name2.lastName}")

    // 2.2.3 値オブジェクト同士の比較
    val name3 = FullName(firstName = name.firstName, "kazutaka")
    println("${name == name3}")
}