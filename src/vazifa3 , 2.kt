fun main() {
 try {
     ishaga(17)
 } catch (e:Exception){
     println(e.message    )
 }

}
fun  ishaga (age:Int) {


    if (age >= 15) {
        println("ishga olindigiz")
    }else{
        throw ArithmeticException("ishga olimadingiz")
}}


