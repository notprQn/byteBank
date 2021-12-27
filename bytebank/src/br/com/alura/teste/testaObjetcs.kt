package br.com.alura.teste

import br.com.alura.modelo.*

fun testaObjects(){
    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 1000)

    println("Nome do Cliente: ${fran.nome}")

    var joao = Cliente("Alex", "", senha = 1)
    var alex = Cliente("João", "", senha = 2)
    val contaPoupanca = ContaPoupanca(joao, 1000)
    val contaCorrente = ContaCorrente(alex, 2000)


    println("Total de contas: ${Conta.total}")
}