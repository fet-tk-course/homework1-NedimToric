class Dole : Instrukcija {
    override fun pomjeri(instrukcija: Char, pozicija: Int): Int {
        if (pozicija >= 7)
            return pozicija
        return pozicija + 3
    }
}