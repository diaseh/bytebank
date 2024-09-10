package org.example

fun main() {
    println("Bem vindo ao Bytebank")
    val contaAlex = Conta("Alex", 1000)

    contaAlex.deposita(243.67)
    println("Titular: ${contaAlex.titular}")
    println("Conta: ${contaAlex.numero}")
    println("Saldo: ${contaAlex.saldo}")
    println()

    val contaFran = Conta("Fran", 1001)

    contaFran.deposita(301.21)
    println("Titular: ${contaFran.titular}")
    println("Conta: ${contaFran.numero}")
    println("Saldo: ${contaFran.saldo}")

    println()
    println("***Movimentações***")
    contaAlex.deposita(51.44)
    contaFran.deposita(71.22)

    println("Depositando R$51,44 na Conta do Alex saldo Atualizado->R$ ${(contaAlex.saldo)}")
    println("Depositando R$71,22 na Conta do Fran saldo Atualizado->R$ ${(contaFran.saldo)}")

    println()
    contaAlex.saque(10.00)
    contaFran.saque(20.00)

    println("Sacando R$10,00 na Conta do Alex saldo Atualizado->R$ ${(contaAlex.saldo)}")
    println("Sacando R$20,00 na Conta do Fran saldo Atualizado->R$ ${(contaFran.saldo)}")

    println()
    contaAlex.saque(10.00)
    contaFran.saque(20.00)

    println("Sacando excesso R$10,00 na Conta do Alex saldo Atualizado->R$ ${(contaAlex.saldo)}")
    println("Sacando excesso R$20,00 na Conta do Fran saldo Atualizado->R$ ${(contaFran.saldo)}")

    println()
    println("Transferência de R$ 100.00 da conta da Fran para o Alex")
    if (contaFran.transfere(100.00, contaAlex)) {
        println("Transferência efetuada com Sucesso")
    } else {
        println("Transferência não efetuada")
    }

    println()
    println(contaAlex.saldo)
    println(contaFran.saldo)
}


class Conta(val titular: String, val numero: Int) {
    //    var titular = titular
    //    var numero = numero
    var saldo = 0.00
        private set

//    constructor(titular: String, numero: Int) {
//        this.titular = titular
//        this.numero = numero
//    }


    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saque(valor: Double) {
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

//    fun getSaldo(): Double {
//        return saldo
//    }
//
//    fun setSaldo(valor: Double) {
//        if(valor > 0){
//        saldo = valor
//    }
}


fun testaLacos() {
    for (i in 1..5) {

        val titular = "Alex"
        val numeroConta = 1000 + i
        var saldo: Double = i + 0.00
        saldo = i + 5.00

        println("Titular $titular")
        println("Número da Conta $numeroConta")
        println("Saldo da Conta $saldo")
        println()

        //condicaoWhen(saldo)
        //condicaoIf(saldo)

    }
}

fun condicaoIf(saldo: Double) {
    if (saldo > 0.00) {
        println("Conta Positiva")
    } else if (saldo == 0.00) {
        println("Sem Saldo")
    } else {
        println("Conta Negativa")
    }
}

fun condicaoWhen(saldo: Double) {
    when {
        saldo > 0.00 -> println("Conta é Positiva")
        saldo == 0.00 -> println("Conta está sem Saldo")
        else -> println("Conta está Negativa")
    }
}
