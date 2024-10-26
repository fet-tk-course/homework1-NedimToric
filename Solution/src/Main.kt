fun main() {
    val listaInstrukcija = listOf(
        "^<<",
        ">>vvv",
        "<^>v<",
        "^^^^v"
    )
    println(Dekoder(listaInstrukcija, Tastatura()).dekodiraj())
}