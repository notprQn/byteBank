fun testaAuntenticacao() {
    val gerente = Gerente(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 1000
    )
    val diretor = Diretor(
        nome = "Joao",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 2000,
        plr = 100.0
    )

    val cliente = Cliente(
        nome = "Fran",
        cpf = "333.333.333-33",
        senha = 1234
    )

    val sistema = SistemaInterno()
    sistema.entrar(gerente, senha = 1000)
    sistema.entrar(diretor, senha = 2000)
    sistema.entrar(cliente, senha = 1234)


}