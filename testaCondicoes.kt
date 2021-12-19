//Testando Condições
fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("Sua conta está no positivo.")
    } else if (saldo == 0.0) {
        println("Sua conta está neutra")
    } else {
        println("Sua conta está negativa")
    }
}