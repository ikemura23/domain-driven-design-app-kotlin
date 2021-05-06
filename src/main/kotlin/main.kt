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
}