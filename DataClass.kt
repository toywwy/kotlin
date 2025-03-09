class General(val name: String, val id: Int)
data class Data(val name: String, val id: Int)

fun main() {
    val a = General("성하", 222)
    println(a == General("성하", 222))
    println(a.hashCode())
    println(a)

    println("--------------")

    val b = Data("성하", 222)
    println(b == Data("성하", 222)) // equals가 구현 되어 있다.
    println(b.hashCode())
    println(b) // toString 구현 되어 있다.

    println("--------------")
    println(b.copy()) // 원본 복사한 새 객체 생성
    println(b.copy("하성"))
    println(b.copy(id = 333))

    println("Componet X Test")
    val list = listOf(
        Data("보영", 123),
        Data("루다", 306),
        Data("아린", 618)
    )

    // a가 component1(), b가 component2() 함수를 사용 하게 됨
    // DataClass 에서만 가능하다.
    for ((a, b) in list) {
        println("$a, $b")
    }
}
