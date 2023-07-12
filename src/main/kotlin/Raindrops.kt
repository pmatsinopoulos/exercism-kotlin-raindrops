object Raindrops {

    fun convert(n: Int): String {
        val iToWord = mapOf(3 to "Pling", 5 to "Plang", 7 to "Plong")

        var result = iToWord.keys.fold("") { acc, k ->
            if (n.mod(k) == 0) {
                acc + iToWord[k]
            } else {
                acc
            }
        }
        if (result == "") result = n.toString()

        return result
    }
}
