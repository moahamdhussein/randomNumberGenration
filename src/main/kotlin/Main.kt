fun main(args: Array<String>) {
    println("enter first number x0")
    val x: Int = readln().toInt()
    println("enter the multiplier")
    val a: Int = readln().toInt()
    println("enter the increment")
    val c: Int = readln().toInt()
    println("enter the modulus")
    val m: Int = readln().toInt()
    println("enter how many number yiu need to generate")
    val n :Int = readln().toInt()
    val generatedNumber : MutableList<Int> = MutableList(n){0}
    for (i in generatedNumber.indices){
        if (i == 0){
            generatedNumber[i] = (a*x + c)%m
        }else{
            generatedNumber[i] = (a*generatedNumber[i-1]+c)%m
        }
    }
    println(generatedNumber.toString())
    println((19*77)%100)
}