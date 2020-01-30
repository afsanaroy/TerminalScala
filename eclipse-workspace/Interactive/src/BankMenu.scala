

class BankMenu {
  private var balance =0
  
  def deposit(amount: Int): Unit = 
  {  
      if(amount > 0) balance = balance + amount
      Console.println("Balance is : "+balance)
  }
  def withdraw(amount: Int): Int =
    if(0<amount && amount <= balance){
      balance = balance - amount
      balance
    }else throw new Error("Insufficient funds")
}
object userinput
{
    def main(args: Array[String])
    {
      Console.printf("Please enter a number: ")
      val in = scala.io.StdIn.readInt.ensuring(_>=0)
      var ui = new BankMenu
      
      if(in==1)
      {
        Console.printf("Enter amount to deposit: ")
       val amount = scala.io.StdIn.readInt()
        ui.deposit(amount)  
      }
      }
}