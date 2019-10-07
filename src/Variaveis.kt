// Tudo no Kotlin são objetos
fun main() {
    // Tipagem explicita
    var nome: String
    nome = "Marcos Paulo dos Santos"
    println(nome)

    // Tipagem implicita
    // Automaticamente assume o tipo String conforme valor inicializado
    var nome2 = "Marcos"
    println(nome2)

    // nome2 = 1

    // Constante
    val maximo = 30
    println(maximo)

    // Erro, não permite alterar a 'val'
    // maximo = 50

    // O IntelliJ sugere mudar para val, pois em nenhum momento ela é alterada
    var minimo = 10
    println(minimo)

    val idade = 30
    // Cast
    val idadeDouble = idade.toDouble()
    println(idadeDouble)

    var numeroString = "30A"

    // Faz o cast, se não conseguir retorna null
    var numero = numeroString.toIntOrNull()

    println(numeroString)
    println(numero)

    // Verificar o tipo
    println(numero is Int)
}

