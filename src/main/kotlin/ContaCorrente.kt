import org.example.Conta

class ContaCorrente(
    titular: String,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saque(valor: Double) {
        val tax = valor + 0.1
        super.saque(tax)
    }

}