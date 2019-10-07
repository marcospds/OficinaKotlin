fun main() {

    // Entrada de dados
    // readLine()!! garante que será um inteiro ou ocorrerá o exception - não é bom
    // readLine()? garante que será um inteiro ou null - é melhor, te forçará a tratar
    val n1 = readLine()!!.toInt()
    val n2 = readLine()!!.toInt()

    // String template
    println("$n1 + $n2 = ${n1 + n2}")

    val nome = "Marcos"
    val idade = 30

    println("Nome: $nome")
    println("Nome: $idade")
}
