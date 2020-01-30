import scala.collection.immutable.List
 
object SumOfSquaresOfOdd
{
        def main(args:Array[String]):Unit =
        {
                var intList = List(1,2,3,4,5)
                def sum = intList.filter(x => x % 2 ==1).map(x => x * x).reduce((x,y) => x+y)
                println(sum)
        }
}