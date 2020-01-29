//Create object
object SquareIt
{
	//square function
	def square(a:Int):Int
	=
	{
		a*a
	}

	//Main
	def main(args:Array[String])
	{
	  //source collection
	  val collection = List(1, 3, 2, 4 ,7)
	  //transformed collection
	  val new_collection = collection.map(square)

	  println(new_collection)
	}
}
