import br.com.alura.modelo.*
import br.com.alura.teste.bigDecimalArrayOf
import br.com.alura.teste.calculaAumentoRelativo
import br.com.alura.teste.media
import br.com.alura.teste.somatoria
import java.lang.ClassCastException
import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val salarios1 = bigDecimalArrayOf("1500.00", "2000.00", "5000.00", "10000.00")
    println(salarios1.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios1
        .map { salario ->
            calculaAumentoRelativo(salario, aumento)
        }
        .toTypedArray()

    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()
    println(gastoInicial)

    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println(gastoTotal)

    val media = salariosComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()
    println(media)

    val mediaMaior = salariosComAumento
        .sorted()
        .take(3)
        .toTypedArray()
        .media()
    println(mediaMaior)
}

























