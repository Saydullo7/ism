fun main() {
try{
    guvhnoma(12)
}catch (e:Exception){
    println(e.message)
}
}
fun guvhnoma (age:Int){
    if(age>=18) {
        println("guvhnoma berishi mumkin")
    }else{
        throw ArithmeticException("bulur oynab tiring" )

    }
}
