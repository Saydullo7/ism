import java.util.*

fun main() {
try {
    maktabga(8)
}catch (e:Exception){
    println(e.message)
}
}
fun maktabga(age:Int){
    if (age>=7) {
        println("maktbga qabul qlindingiz")
    }else{
        throw ArithmeticException("yoshigiz kichkina")
    }
}


