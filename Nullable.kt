fun fct(str: String?): Int {
    return str!!.length // java.lang.NullPointerException
}

fun main() {
    var str: String? = "seonghalee"
    // str = null
    println(str?.length ?: 0)
    /***
     *  ?: (엘비스 연산자, Elvis Operator)
     * 왼쪽 값이 null이면 ?: 뒤의 값을 반환하는 연산자.
     * Kotlin에서 null 처리를 간편하게 할 때 자주 사용됨.
     */

    var str2: String? = "lee"
    // str2 = null
    fct(str2)
}
