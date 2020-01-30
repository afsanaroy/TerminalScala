object account {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val acct = new BankAccount                      //> acct  : BankAccount = BankAccount@4c203ea1
  acct deposit 50
  acct withdraw 20                                //> res0: Int = 30
  acct withdraw 10                                //> res1: Int = 20
  acct withdraw 5                                 //> res2: Int = 15
   
  
  
  
}