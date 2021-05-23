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
        // 通貨が同一かチェック
        if (this.currency != money.currency) throw IllegalArgumentException("通貨単位が異なります。")
        // 値オブジェクトは不変なので計算後は新たなインスンスを生成して返す
        return Money(money.amount.add(this.amount), money.currency)
    }

    /**
     * 2.4.1 掛け算は定義されない
     */
    operator fun times(money: Money) {
        // 通貨の乗算はできない
    }
}
