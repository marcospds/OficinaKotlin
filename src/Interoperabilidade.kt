fun main() {
    val pessoaKotlin = PessoaKotlin("Marcos" , 30)
    val outraPessoaKotlin = pessoaKotlin.copy(idade = 30)

    println(pessoaKotlin)
    println(outraPessoaKotlin)

    // Interoperabilidade
    val pessoaJava = PessoaJava("Marcos",10)

    println(pessoaJava)
}