/***
 * 컬렉션 연산 함수, 고차 함수 Higher-Order Functions (람다 함수를 사용해서 컬렉션을 좀 더 편하게 조작)
 * (고차 함수 : 매개변수를 전달받거나, 반환하는 함수)
 * 컬렉션 함수는 list나 set, map 과 같은 컬렉션 또는 배열에
 * 일반 함수 또는 람다 함수 형태를 사용하여 for문 없이도 아이템을 순회하며 참조하거나
 * 조건을 걸고, 구조의 변경까지 가능한 여러가지 함수를 지칭한다.
 * filter, map ...
 * any, all, none
 * first - 조건에 맞는 첫번째 반환 , last (= 컬레션이 비어있을때 Exception 발생 NoSuchElementException)
 * find, findLast로 대체 가능하다.
 * count 즉 컬렉션 함수에 조건문을 추가 할 수 있다는 것
 */

fun main() {
    val nameList = listOf("박수영", "김지수", "김다현", "신유나", "김지우")
    nameList.forEach { print(it + " ") }
    println()

    println(nameList.filter { it.startsWith("김") })

    println("-----------Map--------------")
    println(nameList.map { "이름 : $it" })
    println(nameList.any { it == "김지연" })
    println(nameList.all { it.length == 3 })
    println(nameList.none { it.startsWith("이") })

    println(nameList.first { it.startsWith("김") })
    println(nameList.last { it.startsWith("김") }) // last - 끝에서 부터 검사한다.
    println(nameList.count { it.contains("지") })
}