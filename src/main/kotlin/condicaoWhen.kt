

fun condicaoWhen(saldo: Double) {
    when {
        saldo > 0.00 -> println("Conta é Positiva")
        saldo == 0.00 -> println("Conta está sem Saldo")
        else -> println("Conta está Negativa")
    }
}