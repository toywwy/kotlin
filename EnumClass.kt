
enum class Color(val number:Int){
    RED(1),
    BLUE(2),
    GREEN(3); // 세미콜론 추가하여 함수도 추가 가능

    fun isRed() = this == Color.RED
}

enum class State(val message: String) {
    SING("노래를 부릅니다."),
    EAT("밥을 먹습니다."),
    SLEEP("잠을 잡니다");

    fun isSleeping() = this == State.SLEEP
}
fun main() {
    var state = State.SING
    println(state) // toString 호출
    println(state.isSleeping())

    state = State.SLEEP
    println(state.isSleeping())



}