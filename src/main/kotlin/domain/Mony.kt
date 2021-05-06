package domain

import java.lang.IllegalArgumentException
import java.math.BigDecimal

/**
 * 2.4 お金の値オブジェクト
 */
data class Mony(
    // 量
    val amount: BigDecimal,
    // 通貨（円・ドル）
    val currency: String
) {
    /**
     * 加算処理
     */
    operator fun plus(mony: Mony): Mony {
        if (this.currency != mony.currency) throw IllegalArgumentException("通貨単位が異なります。")
        return Mony(mony.amount.add(this.amount), mony.currency)
    }
}