object accounts {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(45); 
  val a = new BankAccount();System.out.println("""a  : BankAccount = """ + $show(a ));$skip(15); 
  a deposit 20;$skip(31); 
  
  val b = new BankAccount();System.out.println("""b  : BankAccount = """ + $show(b ));$skip(38); 
  val total = consolidated(List(a,b));System.out.println("""total  : <error> = """ + $show(total ));$skip(18); 
  
  b deposit 30;$skip(38); 
  print(s"Total balance: ${total()}")}
 	
  
  
}
