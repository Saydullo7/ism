fun main() {
 try {
     codial(10)
 }catch (e:Exception){
     println(e.message)
 }
}
fun codial (age:Int){
    if (age>=10) {
        println("codialga qobul qilidigiz")
    }else{
        throw ArithmeticException("codialga qubul qiladingiz")
    }

}



