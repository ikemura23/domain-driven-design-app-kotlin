import domain.FullName

fun main() {
    println("hello world")
    val name = FullName(firstName = "ikemura", lastName = "kazutaka")
    println("${name.firstName} ${name.lastName}")
}