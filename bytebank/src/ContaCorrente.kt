class ContaCorrente(
    titular: String,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
){
    override fun sacar(valor: Double){
        val valorComTaxa = valor + 0.1
            if (this.saldo >= valorComTaxa) {
                this.saldo -= valorComTaxa
            } else {
                println("Não pode sacar, Quandtidade de dinheiro na conta: ${saldo}")
            }

    }
}