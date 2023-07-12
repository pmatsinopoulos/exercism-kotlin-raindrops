private val I_TO_WORD = mapOf(3 to "Pling", 5 to "Plang", 7 to "Plong")

object Raindrops {

    fun convert(n: Int): String {
        var result = I_TO_WORD.keys.fold("") { acc, k ->
            if (n.mod(k) == 0) {
                acc + I_TO_WORD[k]
            } else {
                acc
            }
        }
        if (result == "") result = n.toString()

        return result
    }
}
