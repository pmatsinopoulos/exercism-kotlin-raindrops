private val I_TO_WORD = mapOf(3 to "Pling", 5 to "Plang", 7 to "Plong")

object Raindrops {

    fun convert(n: Int): String = buildString {
        I_TO_WORD.keys.forEach { i ->
            if (n.mod(i) == 0) append(I_TO_WORD[i])
        }
        if (isBlank()) append(n.toString())
    }
}
