object MainObject {  
   def main(args: Array[String]) {  
      val result = checkIt(-10)  
      println (result)  
   }  
    def checkIt (a:Int)  =  if (a >= 0) 1 else -1    // Passing a if expression value to function  
}  
