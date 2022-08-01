object Number {
    def number(p:Int) : Unit ={
         p match{
            case x if x<=0 => println("Negative/Zero")
            case x if x%2==0 => println("Even number")
            case x if x%2!=0 => println("Odd number")
        }
    }
    def main(args: Array[String]) = {
    println(number(5));
    }
}