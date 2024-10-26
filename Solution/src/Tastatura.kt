class Tastatura {
    var tastatura = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )
    fun pomjeri(instrukcija: Char, pozicija: Int) : Int{
        val novaPozicija = when(instrukcija) {
            '^' -> Gore().pomjeri(pozicija)
            'v' -> Dole().pomjeri(pozicija)
            '<' -> Lijevo().pomjeri(pozicija)
            '>' -> Desno().pomjeri(pozicija)
            else -> return pozicija // u slucaju pogresne instrukcije, vratimo trenutnu poziciju
        }
        return novaPozicija
    }
}