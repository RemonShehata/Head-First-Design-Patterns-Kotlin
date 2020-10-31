import java.io.FilterInputStream
import java.io.InputStream

class LowerCaseInputStream(`in`: InputStream) : FilterInputStream(`in`) {
    override fun read(): Int {
        val c = super.read()
        return if (c == -1) c else Character.toLowerCase(c)
    }

    override fun read(b: ByteArray, off: Int, len: Int): Int {
        val result = super.read(b, off, len)
        for (i in off until off + result) {
            b[i] = Character.toLowerCase(b[i].toChar()) as Byte
        }
        return result
    }
}