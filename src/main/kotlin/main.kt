import domain.FullName
import domain.Money
import domain.user.UserApplicationService

fun main() {
    println("chapter2")
//    chapter2()
    chapter6()
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

    // 2.3 値のチェックは値オブジェクト内で行われるべき
    try {
        FullName(firstName = name.firstName, "") // NGである空白を入れてみる
    } catch (e: Exception) {
        println(e.stackTraceToString())
    }
    try {
        FullName(firstName = "池村", lastName = "kazutaka") // アルファベット以外はNG
    } catch (e: Exception) {
        println(e.stackTraceToString())
    }

    // 2.4 ふるまいをもった値オブジェクト
    val money1 = Money(1000L.toBigDecimal(), "JPY")
    val money2 = Money(2000L.toBigDecimal(), "JPY")
    // お金の加算処理
    val money3: Money = money1 + money2
    println("${money3.amount} ${money3.currency}") // 3000 JPY
    try {
        val moneyJpy = Money(1000L.toBigDecimal(), "JPY")
        val moneyUsd = Money(2000L.toBigDecimal(), "USD")
        moneyJpy + moneyUsd // 通貨が違うと例外がスローされる
    } catch (e: Exception) {
        println(e.stackTraceToString())
    }
}

fun chapter6() {
    UserApplicationService().run()
}
