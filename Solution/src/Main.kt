import java.io.File
import java.io.InputStream

fun procitajFile(path: String) : List<String>{
    val inputStream : InputStream = File(path).inputStream()
    val lineList = mutableListOf<String>()
    inputStream.bufferedReader().forEachLine { lineList.add(it) }
    return lineList
}

fun main() {
    val instrukcije : List<String> = procitajFile("Solution/src/instrukcije.txt")
    println(Dekoder(instrukcije, Tastatura()).dekodiraj())
}