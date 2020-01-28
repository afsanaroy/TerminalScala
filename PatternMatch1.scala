object MainObject {  
   def main(args: Array[String]) {  
        var a = 1  
        a match{  
            case 1 => println("One")  
            case 2 => println("Two")  
            case _ => println("No")  
        }  
        }  
}  
