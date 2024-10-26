class Desno : Instrukcija {
    override fun pomjeri(pozicija: Int): Int {
        if (pozicija == 3 || pozicija == 6 || pozicija == 9)
            return pozicija
        return pozicija + 1
    }
}