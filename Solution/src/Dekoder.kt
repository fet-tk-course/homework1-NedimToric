class Dekoder (val listaInstrukcija: List<String>, val tastatura: Tastatura) {
    fun dekodiraj() : Int {
        var kod : String = ""
        for (linija in this.listaInstrukcija) {
            var pozicija = 5
            if (kod.isNotEmpty()) pozicija = kod[kod.length - 1].toString().toInt()
            for (instrukcija in linija) {
                pozicija = tastatura.pomjeri(instrukcija, pozicija)
            }
            kod += pozicija
        }
        return kod.toInt()
    }
}