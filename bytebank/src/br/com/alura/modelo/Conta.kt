package br.com.alura.modelo

import br.com.alura.exception.FalhaAutenticacaoException
import br.com.alura.exception.SaldoInsuficienteException

abstract class Conta(
    var titular: Cliente,
    val numero: Int
): Autenticavel {
    var saldo = 0.0
        protected set

    //Sem nome, tem nome explicito de Companion
    companion object{
        var total = 0
            private set
    }

    init{
        println("Criando Conta")
        total++
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta, senha: Int) {
        if(saldo < valor){
            throw SaldoInsuficienteException(
                mensagem = "Saldo insuficiente, Saldo Atual: $saldo, valor a ser subtraido: $valor"
            )
        }
        if(!autentica(senha)){
            throw FalhaAutenticacaoException()
        }
        saldo -= valor
        destino.deposita(valor)
    }
}

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if(this.saldo >= valorComTaxa){
            this.saldo -= valorComTaxa
        }
    }
}

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {

    override fun saca(valor: Double) {
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }
}