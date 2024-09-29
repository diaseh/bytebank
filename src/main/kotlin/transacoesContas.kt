


fun transacoesContas() {
    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )

    val contaPoupaca = ContaPoupaca(
        titular = "Alex",
        numero = 100
    )

    contaCorrente.deposita(1500.00)
    contaPoupaca.deposita(1510.00)

    println("Saldo Conta Corrente ${contaCorrente.saldo}")
    println("Saldo Conta Poupança ${contaPoupaca.saldo}")
    println()

    contaCorrente.saque(500.00)
    contaPoupaca.saque(500.00)
    println("Saldo Conta Corrente Atualizado ${contaCorrente.saldo}")
    println("Saldo Conta Poupança Atualizado ${contaPoupaca.saldo}")
    println()

    contaCorrente.transfere(1000.00, contaPoupaca)
    println()

    println("Transferência c/c para c/p")
    contaPoupaca.transfere(600.00, contaCorrente)
    println("Saldo Conta Corrente Atualizado ${contaCorrente.saldo}")
    println("Saldo Conta Poupança Atualizado ${contaPoupaca.saldo}")
    println()

    println("Transferência c/p para c/c")
    contaCorrente.transfere(50.00, contaPoupaca)
    println("Saldo Conta Corrente Atualizado ${contaCorrente.saldo}")
    println("Saldo Conta Poupança Atualizado ${contaPoupaca.saldo}")
}