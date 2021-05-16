package domain

import java.lang.IllegalArgumentException
import java.math.BigDecimal

/**
 * 2.4 お金の値オブジェクト
 */
data class Money(
    // 量
    val amount: BigDecimal,
    // 通貨（円・ドル）
    val currency: String
) {
    /**
     * 加算処理
     */
    operator fun plus(money: Money): Money {
        if (this.currency != money.currency) throw IllegalArgumentException("通貨単位が異なります。")
        return Money(money.amount.add(this.amount), money.currency)
    }
}