class Gore : Instrukcija {
    override fun pomjeri(instrukcija: Char, pozicija: Int): Int {
        if (pozicija == 1 || pozicija == 2 || pozicija == 3)
            return pozicija
        return pozicija - 3
    }
}