import org.example.Conta


fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++
    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta("joão", 10)
    contaJoao.titular = "João"
    var contaMaria = Conta("Maria", 20)
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"

    println("Titular da conta João: ${contaJoao.titular}")
    println("Titular conta Maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}