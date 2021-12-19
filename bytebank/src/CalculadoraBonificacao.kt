class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun regsitrar(funcionario: Funcionario){
        this.total += funcionario.bonificacao
    }
}