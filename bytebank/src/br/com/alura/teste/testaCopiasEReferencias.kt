import br.com.alura.modelo.Cliente
import br.com.alura.modelo.ContaCorrente
import br.com.alura.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente(nome = "João", cpf = "", senha = 1)

    val contaJoao = ContaCorrente(joao, 1002)
    contaJoao.titular.nome = "João"
    var contaMaria = ContaPoupanca(Cliente(
        nome = "Maria",
        cpf = "1",
        senha = 1
    ), 1003)
    contaMaria.titular.nome = "Maria"
    contaJoao.titular.nome = "João"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}