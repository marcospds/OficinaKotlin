fun main() {
    var num = 5

    // Condicional simples
    if(num % 2 == 0) {
        println("Par")
    } else {
        println("Impar")
    }

    // A ultima linha do bloco é o retorno dele
    val resultato = if(num % 2 == 0) {
        "par"
    } else {
        print("não muda o fluxo")        
        "impar"
    }

    println("$num é $resultato")
}
