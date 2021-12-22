abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
) {

    //Não pode ter implementação em classes abstratas
    abstract val bonificacao: Double
}