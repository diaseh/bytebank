import org.example.Conta

fun testaComportamentosConta() {
    val contaAlex = Conta("Alex", 1000)

    contaAlex.deposita(243.67)
    println("Titular: ${contaAlex.titular}")
    println("Conta: ${contaAlex.numero}")
    println("Saldo: ${contaAlex.saldo}")
    println()

    val contaFran = Conta("Fran", 10002)

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
