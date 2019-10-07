fun main() {
    val level = 0

    // When com parâmetro
    // Cada um já tem o "break"
    val titulo = when(level) {
        in(1..3) -> "Noob"
        in(4..6) -> "Pro"
        in(7..10) -> "Master"
        else -> "Outro"
    }

    println(titulo)

    // When é mais abrangente 
    // Bom para ser usado em tratamento de erros por exemplo
    when {
        level % 2 == 0 -> println("Par")
        level is Int -> println("Inteiro")
    }
}
