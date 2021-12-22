class ContaPoupanca(
    titular: String,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun sacar(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        } else {
            println("Não pode sacar, Quandtidade de dinheiro na conta: ${saldo}")
        }
    }
}