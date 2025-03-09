fun main() {
    println("-----------------SET-------------------")
    val a = mutableSetOf("귤", "바나나", "키위")

    a.add("사과")
    println(a)

    println(a.contains("사과"))
    for ((idx, item) in a.withIndex()) {
        println("${idx} = ${item}")
    }

    a.remove("귤")
    println(a)
    println(a.contains("귤"))

    println("-----------------MAP-------------------")

    val b = mutableMapOf(
        "레드벨벳" to "음파음파",
        "트와이스" to "Fancy",
        "ITZY" to "ICY"
    )

    for (entry in b) {
        println("${entry.key}, ${entry.value}")
    }

    b.put("오마이걸", "번지")
    println(b)

    println(b["레드벨벳"])
}
