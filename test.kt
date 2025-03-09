/***
 * 매개변수 -> 본문
 */

val fct = { a: Int, b: Int -> a * b }
val fct1: (a: Int) -> Int = { a -> a * a }
val fct2: (a: Int) -> Int = { it * it }
val fct3: (a: Int, b: Int) -> Unit = { a, b -> println(a * b) }
val fct4: (Int, Int) -> Unit = { a, b -> println(a * b) } // 어차피

typealias MyFunType = (Int, Int) -> Boolean

val fctCompare: MyFunType = { a, b -> a < b }

fun hofFun(arg: (Int) -> Boolean): () -> String {
    val result = if (arg(10)) {
        "True"
    } else {
        "False"
    }

    return { "hotFun result : $result" }
    // ** return result <- 안된다 반환 형태가 String이여야 한다.
    // String을 반환해주어야 하기 때문이다. 그런데 여기에 $result를 넣으면 toString으로 들어가게 된다. 결국 String 반환해야 함
}

fun main() {
    val res = hofFun({ a: Int -> a > 9 }) //hotFun은 () -> String 매개변수는 없고 반환형이 String인 람다 함수임
    println(res())
}