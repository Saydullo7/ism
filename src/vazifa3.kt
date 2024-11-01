fun main() {
 try {
     armiya(18)
 }catch (e:Exception){
     println(e.message)
 }
}
fun armiya(age:Int){
    if (age>=18) {
        println("armiyaga olindigiz")
    }else{
        throw ArithmeticException("pubg o'ynab turing")
    }
}

