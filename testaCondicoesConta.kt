fun testaComportamentosConta() {
    println("Bem-vindo ao ByteBank")

    val contaJoao = Conta(titular = "Joao", numero = 1000)
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