package br.com.alura.teste

import br.com.alura.modelo.Endereco

fun testaNulo() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "rua vergueiro", complemento = "prédio")
    val logradouroNovo: String? = enderecoNulo?.logradouro
    enderecoNulo?.let {
        println(it.logradouro.length)
        var enderecoNulo: Endereco? = Endereco(logradouro = "rua vergueiro", complemento = "prédio")
    }
}