//import Signal.caller
//import scala.util.DynamicVariable

class BankAccount {
  
  val balance = Var(0)

  def deposit(x: Int): Unit = {
    val curBalance = balance()
    balance() = curBalance + x
  }
  def withdraw(x: Int): Unit = {
    val curBalance = balance()
    balance() = curBalance - x
  }

def consolidated(accts: List[BankAccount]): Signal[Int] =
  Signal(accts.map(_.balance()).sum, accts.map(_.balance))
}
  
