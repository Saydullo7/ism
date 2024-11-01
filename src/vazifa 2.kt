fun main() {
   try {
       mb(57)
   }catch (m:Exception){
       println(m.message)
   }

}
fun mb (mb:Int){
    if (mb<=50) {
        println("mbingiz yetarli")
    }else{
        throw ArithmeticException("mbingiz yetarli emas")

    }
}




