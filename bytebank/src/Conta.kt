// Contrutor Primário //
open class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set

    // Construtor Secundário //
    //    constructor(titular: String, numero: Int){
    //        this.titular = titular
    //        this.numero = numero
    //    }

    fun depositar(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    open fun sacar(valor: Double) {
        if (this.saldo >= valor) {
            saldo -= valor
        } else {
            println("Não pode sacar, Quandtidade de dinheiro da conta: ${saldo}")
        }
    }

    fun transferir(destino: Conta, valor: Double): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.depositar(valor)
            return true
        }
        return false
    }

}