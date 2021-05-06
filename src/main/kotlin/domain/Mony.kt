package domain

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
        return Mony(mony.amount.add(this.amount), mony.currency)
    }
}