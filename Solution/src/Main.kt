import java.io.File
import java.io.InputStream

fun procitajFile() : List<String>{
    print("Unesi putanju do fajla sa instrukcijama: ")
    val userPath = readln()
    val inputStream : InputStream = File(userPath).inputStream()
    val lineList = mutableListOf<String>()
    inputStream.bufferedReader().forEachLine { lineList.add(it) }
    return lineList
}

fun main() {
    val instrukcije : List<String> = procitajFile()
    println(Dekoder(instrukcije, Tastatura()).dekodiraj())
}