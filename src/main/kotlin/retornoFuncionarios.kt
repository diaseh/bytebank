


fun retornoFuncionarios() {

    val alex = Analista (
        "Alex",
        "124.267.354-48",
        1000.00
    )

    println("Nome: ${alex.nome}")
    println("CPF: ${alex.cpf}")
    println("Salário: ${alex.salario}")
    println("Bonificação: ${alex.bonificacao}")
    println()

    val fran = Gerente(
        "Fran",
        "278.234.544-27",
        2000.0,
        1235

    )

    println("Nome: ${fran.nome}")
    println("CPF: ${fran.cpf}")
    println("Salário: ${fran.salario}")
    println("Bonificação: ${fran.bonificacao}")
    if (fran.autentica(1234)) {
        println("Autenticado com Sucesso")
    } else println("Falha na Autenticação")
    println()

    val gui = Diretor(
        "Gui",
        "254.233.867-22",
        7500.0,
        78910,
        200.00

    )
    println("Nome: ${gui.nome}")
    println("CPF: ${gui.cpf}")
    println("Salário: ${gui.salario}")
    println("Bonificação: ${gui.bonificacao}")
    println("PLR: ${gui.plr}")
    if (gui.autentica(78910)) {
        println("Autenticado com Sucesso")
    } else println("Falha na Autenticação")
    println()

    val maria = Analista(
        "Maria",
        "229.264.188-22",
        2100.00,

        )

    println("Nome: ${maria.nome}")
    println("CPF: ${maria.cpf}")
    println("Salário: ${maria.salario}")
    println("Bonificação: ${maria.bonificacao}")



    println("----------------")
    val calculadora = CalculadoraBonificacau()
    calculadora.registra(alex);
    calculadora.registra(fran);
    calculadora.registra(gui);
    calculadora.registra(maria);
    println("Total de Bonificação ${calculadora.total}")
}