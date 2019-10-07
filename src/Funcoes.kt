fun main() {
    println(somar(1, 2))
    println(somarSingular(1))

    // Erro
    // println(somarMultiplicar(1, 2))

    // Parametro nomeado (x3)
    println(somarMultiplicar(1, x3 = 2))
}

fun somar(x1: Int, x2: Int = 5): Int {
    return x1 + x2
}

// Função com singular expression
fun somarSingular(x1: Int, x2: Int = 5): Int = x1 + x2

// Função com parametro opcional (x2)
fun somarMultiplicar(x1: Int, x2: Int = 2, x3: Int): Int = x1 + x2 * x3
