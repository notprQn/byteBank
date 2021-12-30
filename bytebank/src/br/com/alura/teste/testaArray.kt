package br.com.alura.teste

fun testaArray(){
    //Testa 1
    val idades: IntArray = intArrayOf(25, 19, 33, 20, 55, 99)

    idades[0] = 25
    idades[1] = 19
    idades[2] = 33
    idades[3] = 23

    var maiorIdade1 = Int.MIN_VALUE
    for(idade in idades){
        if (idade > maiorIdade1){
            maiorIdade1 = idade
        }
    }
    println("A maior idade é: $maiorIdade1")

    var menorIdade1 = Int.MAX_VALUE
    idades.forEach { idade ->
        if(idade < menorIdade1){
            menorIdade1 = idade
        }
    }
    println("A menor idade é: $menorIdade1")


    val salarios: DoubleArray = doubleArrayOf(1500.0, 2300.0, 5000.0, 10000.0)

    val aumento = 1.1
    for(indice in salarios.indices){
        salarios[indice] = salarios[indice] * aumento
    }
    println(salarios.contentToString())

    salarios.forEachIndexed{ i, salario ->
        salarios[i] = salario * aumento
    }
    println(salarios.contentToString())


    //Testa 2
    val serie: IntRange = 1.rangeTo(10)
    for(s in serie){
        print("$s ")
    }
    println()

    val numerosPares = 0..100 step 2
    for(numeroPar in numerosPares){
        print("$numeroPar ")
    }
    println()

    val numerosParesReversos = 100 downTo 0 step 2
    numerosParesReversos.forEach{
        print("$it ")
    }
    println()

    val intervalo = 1500.00..5000.0
    val salario = 5001.0

    if(salario in intervalo){
        println("Está dentro do interavalo")
    } else{
        println("Não está dentro do intervalo")
    }

    val alfabeto = 'A'..'Z'
    val letra = 'K'
    println(letra in alfabeto)

    //testa 3
    val idades1: IntArray = intArrayOf(18, 10, 22, 34, 34, 99, 70)


    val maiorIdade = idades1.max()
    println("MAIOR IDADE: $maiorIdade")

    val menorIdade = idades1.min()
    println("MENOR IDADE: $menorIdade")

    val media = idades1.average()
    println("MEDIA: $media")

    val todosMaiores = idades1.all { it >= 18 }
    println("TODOS MAIORES?: $todosMaiores")

    val umMaior = idades1.any { it >= 18 }
    println("ALGUM MAIOR DE IDADE?: $umMaior")

    val maiores = idades1.filter { it >= 18 }
    println("MAIORES: $maiores")

    val busca = idades1.find { it == 18 }
    println("BUSCA: $busca")
}