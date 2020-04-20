package reference

fun main() {
    val str1 = "abcdef"
    val str2 = "abcdef"
    val x = 2

    // compareTo
    println(str1.compareTo(str2, true))

    // equals
    println(str1.equals(str2))

    // get
    println(str1.get(2))

    // hashCode
    println("${str1.hashCode()} and ${str2.hashCode()}. str1 equals str2 = ${str1.hashCode() == str2.hashCode()}")

    // plus
    println(str1.plus(str2))

    // subSequence
    val d = 1..4
    println(str1.subSequence(d))

    // toString
    println(x.toString())

    // Indices
    println(str1.indices)

    println(str1.lastIndex)

    println(str1.indices)

    println(str1.lastIndex)

    // any
    val emptyStr = ""
    println(str1.any())


    // as iterable
    for (c in str1.asIterable()) {
        print("$c, ")
    }
    println()

    for (c in str1.asSequence()) {
        print("$c, ")
    }

}