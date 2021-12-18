fun main() {
    println("Bem-vindo ao ByteBank")
    val contaJoao = Conta(titular = "Joao",numero =  1000)
    contaJoao.depositar(200.0)


    val contaAlex = Conta(numero = 1001, titular = "Alex")
    contaAlex.depositar(100.0)

    println()
    println("Nome do titular: ${contaJoao.titular}")
    println("Numero da conta: ${contaJoao.numero}")
    println("Saldo da conta: ${contaJoao.saldo}")
    println()

    println("Nome do titular: ${contaAlex.titular}")
    println("Numero da conta: ${contaAlex.numero}")
    println("Saldo da conta: ${contaAlex.saldo}")
    println()
    println("Despositando na conta do Alex")
    contaAlex.depositar(70.0)

    println("Despositando na conta do Joao")
    contaJoao.depositar(50.0)
    println()

    println("Sacando na conta do Joao")
    contaJoao.sacar(250.0)

    println("Sacando na conta do Alex")
    contaAlex.sacar(100.0)
    println()

    println("Transferindo para a conta do Alex")
    if (contaAlex.transferir(destino = contaJoao, valor = 20.0)) {
        println("Transferencia Concluida")
    } else {
        println("Transferencia Falhada")
    }
    println(contaJoao.saldo)
    println(contaAlex.saldo)
}

// Contrutor Primário //
class Conta(
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
        println(saldo)
    }

    fun sacar(valor: Double) {
        if (this.saldo >= valor) {
            saldo -= valor
            println(saldo)
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

//Testando Condições
fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("Sua conta está no positivo.")
    } else if (saldo == 0.0) {
        println("Sua conta está neutra")
    } else {
        println("Sua conta está negativa")
    }
}


//Testando laços
fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular: String = "Joao Pedro $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("Nome do titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo da conta: $saldo")
        println()
        i++
    }

//    for (i in 1..4) {
//        if (i == 2){
//            break
//        }
//        if (i == 3){
//            continue
//        }
//
//        val titular: String = "Joao Pedro $i"
//        val numeroConta: Int = 1000 + i
//        var saldo = i+ 10.0
//
//        println("Nome do titular: $titular")
//        println("Número da conta: $numeroConta")
//        println("Saldo da conta: $saldo")
//        println()
//    }
}
