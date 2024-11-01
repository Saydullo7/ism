fun main() {
 try {
     oqishga(19)
 }catch (e:Exception){
     println(e.message)
 }

}
fun oqishga (age:Int){
    if (age>=18) {
        println("oqishga qabul qilindinggiz")
    }else{
        throw ArithmeticException("yoshingiz kichik")
    }
}
























