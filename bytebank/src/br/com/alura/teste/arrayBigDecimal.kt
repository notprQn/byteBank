package br.com.alura.teste

import java.math.BigDecimal

fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce{ acumulador, valor ->
        acumulador + valor
    }
}

fun Array<BigDecimal>.media(): BigDecimal{
    return if(this.isEmpty()){
        BigDecimal.ZERO
    } else{
        this.somatoria() / this.size.toBigDecimal()
    }
}
