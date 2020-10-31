import java.io.*

fun main(args: Array<String>) {
    var c: Int
    try {
        val `in`: InputStream = LowerCaseInputStream(
            BufferedInputStream(
                FileInputStream("test.txt")
            )
        )
        while (`in`.read().also { c = it } >= 0) {
            print(c.toChar())
        }
    } catch (e: FileNotFoundException) {
        e.printStackTrace()
    } catch (e: IOException) {
        e.printStackTrace()
    }
}