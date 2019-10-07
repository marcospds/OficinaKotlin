fun main() {
    (1..10).filter {
        it % 2 == 0
    }.map {
        it * 2
    }.forEach {
        println(it)
    }
}