class CalculadoraBonificacau() {

    var total: Double = 0.00
        private set

    fun registra(funcionario: Funcionario){
        println("Funcionário: ${funcionario.nome}")
        this.total += funcionario.bonificacao
    }

}