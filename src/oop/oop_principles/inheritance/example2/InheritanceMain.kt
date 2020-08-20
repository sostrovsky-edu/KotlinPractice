package oop.oop_principles.inheritance.example2

import java.math.BigDecimal
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val cheque = ChequePayment(3.toBigDecimal(), "Torro Burger", "01234")
    println("The cheque info is:" +
            // "\n\tbankId : ${cheque.bankId}" +
            "\n\tname : ${cheque.name}"
    )
}

open class Payment(val amount: BigDecimal)

class CardPayment(amount: BigDecimal,
                  val number: String,
                  val expiryDate: LocalDateTime,
                  val type: CardType) : Payment(amount)

class ChequePayment : Payment {
    constructor(amount: BigDecimal, name: String, bankId: String) : super(amount) {
        this.name = name
        this.bankId = bankId
    }

    var name: String = ""
        get() = field
    var bankId: String = ""
        get() = field
}