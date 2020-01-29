 import scala.collection.mutable._

// Creating object 
object Queue1
{ 
	// Main method 
	def main(args:Array[String]) 
	{ 
		// Initialize a queue 
		var fruits = Queue[String]() 
		
		// Adding elements to the queue 
		fruits.enqueue("apple") 
		fruits.enqueue("banana") 
		fruits.enqueue("mango") 
		fruits.enqueue("guava") 
		
		// Print the elements of queue 
		print("Queue Elements: ") 
		fruits.foreach((element:String) => print(element+" ")) 
		
		// Print the first element of the queue 
		var firstElement = fruits.front 
		println("\nFirst element in the queue: "+ firstElement) 
		
		// Enqueue pineapple in the queue 
		fruits.enqueue("pineapple") 
		
		// Print the elements of queue 
		print("Queue Elements after enqueue: ") 
		fruits.foreach((element:String) => print(element+" ")) 
		
		// Dequeue first element from the queue 
		var deq = fruits.dequeue 
		
		// Print the elements of queue 
		print("\nQueue Elements after dequeue: ") 
		fruits.foreach((element:String) => print(element+" ")) 
		
		// Print the Dequeued element 
		print("\nDequeued element: " + deq) 

		// Using clear method 
		println("\nclear the queue: "+ fruits.clear) 
		
		// Using isEmpty method 
		println("\nqueue is empty: "+ fruits.isEmpty) 
		
	} 
} 

