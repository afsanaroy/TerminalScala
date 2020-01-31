object accounts {
  val a = new BankAccount()
  a deposit 20
  
  val b = new BankAccount()
  val total = consolidated(List(a,b))
  
  b deposit 30
  print(s"Total balance: ${total()}")
 	
  
  
}