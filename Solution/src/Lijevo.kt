class Lijevo : Instrukcija {
    override fun pomjeri(pozicija: Int): Int {
        if (pozicija == 1 || pozicija == 4 || pozicija == 7)
            return pozicija
        return pozicija - 1
    }
}