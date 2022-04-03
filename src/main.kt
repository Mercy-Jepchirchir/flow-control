fun main(){
/*    1. Create a function that prints out all the odd numbers between 1 and 100 (2pts)
    2. Create a function that takes in an array of names and returns the number of
    names longer than 5 characters (2pts)
    3. You are creating a robot to serve drinks at a party. The robot is required to
    serve a glass of milk for guests under the age of 6. For guests under the age of
    15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
    else gets a bottle of coca cola. Create a function that will make these
            decisions, printing out the name of the drink each person gets according to
    their age. (2pts)
    4. Write a function that prints each number from 1 to 100 on a new line. For each
            multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
    "Buzz" instead of the number. For numbers which are multiples of both 3 and
    5, print "FizzBuzz" instead of the number. (4pts)*/
    numbers()
    println(arrayOfNames(arrayOf("chirii","Jepchirchir","Merrcy","Naima")))
   hotelRobot(5)
    hotelRobot(15)
   hotelRobot(30)
    fizz()
}
fun numbers(){
    for (x in 1..100)
        if (x%2 !=0){
            println(x)
        }

}
fun arrayOfNames(name:Array<String>):Int{
    var z= 0
    name.forEach { k->
        if (k.length>5){
            z++
        }
    }
    return z
}
fun hotelRobot(age:Int){
    if (age<6) {
        println("age $age your are drinking milk")

    }else if (age<=15){
        println("age $age your are drinking fanta orange")
   }else{
   println("age $age your are drinking cocacola")
 }


//    for (six in  0..6){
//        println("drink milk")
//    }
//    for (teens in 7..15){
//        println("drink fanta orange")
//
//    }
//    for (adults in 16..120){
//        println("drink cocacola")
//
//    }

}
fun fizz(){
    for (multiple in 1..100){
        if (multiple%3==0 && multiple%5==0){
            println("FizzBuzz")


        }
        else if (multiple%3==0){
            println("Fizz")

        }
        else if (multiple%5==0){
            println("Buzz")

        }
    }
}

