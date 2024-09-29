

fun condicaoIf(saldo: Double) {
    if (saldo > 0.00) {
        println("Conta Positiva")
    } else if (saldo == 0.00) {
        println("Sem Saldo")
    } else {
        println("Conta Negativa")
    }
}