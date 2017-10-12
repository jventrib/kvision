@file:Suppress("TooManyFunctions")
package pl.treksoft.kvision.utils

import pl.treksoft.kvision.css.CssSize
import pl.treksoft.kvision.css.UNIT

fun Int.px(): CssSize = Pair(this, UNIT.px)
fun Int.em(): CssSize = Pair(this, UNIT.em)
fun Int.pt(): CssSize = Pair(this, UNIT.pt)
fun Int.perc(): CssSize = Pair(this, UNIT.perc)
fun Int.rem(): CssSize = Pair(this, UNIT.rem)
fun Int.ch(): CssSize = Pair(this, UNIT.ch)
fun Int.cm(): CssSize = Pair(this, UNIT.cm)
fun Int.mm(): CssSize = Pair(this, UNIT.mm)
@Suppress("FunctionNaming")
fun Int.`in`(): CssSize = Pair(this, UNIT.`in`)
fun Int.pc(): CssSize = Pair(this, UNIT.pc)
fun Int.vh(): CssSize = Pair(this, UNIT.vh)
fun Int.vw(): CssSize = Pair(this, UNIT.vw)
fun Int.vmin(): CssSize = Pair(this, UNIT.vmin)
fun Int.vmax(): CssSize = Pair(this, UNIT.vmax)

object Utils {

    private val hex = arrayOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f")

    @Suppress("MagicNumber")
    fun intToHexString(n: Int): String {
        var result = ""
        var num = n
        for (i in 0 until 6) {
            result = hex[num and 0xF] + result
            num = num shr 4
        }
        return result
    }

}