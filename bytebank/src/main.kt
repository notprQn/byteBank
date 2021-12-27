import br.com.alura.modelo.*

fun main(){
    val endereco = Endereco(
        logradouro = "Rua vergueiro",
        complemento = "Alura",
        cep = "00000-0700"
    )
    val enderecoNovo = Endereco(
        logradouro = "Rua vergueiro",
        complemento = "Alura",
        cep = "00000-0700"
    )

    val endereco = Endereco()
    val enderecoNovo = Endereco()

    println("Vendo se uma função é igual a outra:")
    println(endereco.equals(enderecoNovo))
    println()

    println("Vendo o hashCode de cada função:")
    println(endereco.hashCode())
    println(enderecoNovo.hashCode())
    println()

    println("Vendo o toString da Função:")
    println(endereco.toString())
    println(enderecoNovo.toString())
    println()

    println("toSting 'Personalizado':")
    println("${endereco.javaClass}@${
        Integer.toHexString(endereco.hashCode())
    }")

}

fun imprime(valor: Any) : Any{
    println(valor)
    return valor
}