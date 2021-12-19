//Testando laços
fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular: String = "Joao Pedro $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("Nome do titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo da conta: $saldo")
        println()
        i++
    }

//    for (i in 1..4) {
//        if (i == 2){
//            break
//        }
//        if (i == 3){
//            continue
//        }
//
//        val titular: String = "Joao Pedro $i"
//        val numeroConta: Int = 1000 + i
//        var saldo = i+ 10.0
//
//        println("Nome do titular: $titular")
//        println("Número da conta: $numeroConta")
//        println("Saldo da conta: $saldo")
//        println()
//    }
}