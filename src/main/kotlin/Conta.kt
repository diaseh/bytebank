package org.example

open class Conta(
    var titular: String,
    val numero: Int
) {

    var saldo = 0.00
        private set


    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    open fun saque(valor: Double) {
        if (saldo >= 0.00) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

}