fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "João",
        numero = 1000
    )
    val contaPoupanca = ContaPoupanca(
        titular = "Alex",
        numero = 1001
    )

    contaCorrente.depositar(1000.0)
    contaPoupanca.depositar(1000.0)

    println("Saldo da conta Corrente: ${contaCorrente.saldo}")
    println("Saldo da conta Poupança: ${contaPoupanca.saldo}")
    println()

    contaCorrente.sacar(100.0)
    contaPoupanca.sacar(100.0)

    println("Saldo após saque conta Corrente: ${contaCorrente.saldo}")
    println("Saldo após saque conta Poupança: ${contaPoupanca.saldo}")
    println()

    contaCorrente.transferir(contaPoupanca, 100.0)

    println("Saldo Corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("Saldo após poupança receber transferência: ${contaPoupanca.saldo}")
    println()

    contaPoupanca.transferir(contaCorrente, 100.0)

    println("Saldo Corrente após transferir para corrente: ${contaPoupanca.saldo}")
    println("Saldo após saque carrente: ${contaCorrente.saldo}")
    println()
}