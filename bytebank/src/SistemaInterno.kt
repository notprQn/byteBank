class SistemaInterno {

    fun entrar(admin: Autenticavel, senha: Int){
        if(admin.autenticar(senha)){
            println("Bem-Vindo ao ByteBank")
        }
        else{
            println("Falha na Autenticação")
        }
    }
}