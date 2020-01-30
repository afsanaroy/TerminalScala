package week2

object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  object sim extends Circuits with Parameters
  import sim._
  val in1, in2,sum, carry = new Wire              //> in1  : week2.test.sim.Wire = week2.Gates$Wire@27f674d
                                                  //| in2  : week2.test.sim.Wire = week2.Gates$Wire@1d251891
                                                  //| sum  : week2.test.sim.Wire = week2.Gates$Wire@48140564
                                                  //| carry  : week2.test.sim.Wire = week2.Gates$Wire@58ceff1
  halfAdder(in1, in2, sum, carry)
  probe("sum", sum)                               //> sum 0 new-value = false
  probe("carry", carry)                           //> carry 0 new-value = false
  
  in1 setSignal true
  run()                                           //> ***simulation started, time = 0***
                                                  //| sum 8 new-value = true
                                                  //| scala.MatchError: List() (of class scala.collection.immutable.Nil$)
                                                  //| 	at week2.Simulation.loop(Simulation.scala:32)
                                                  //| 	at week2.Simulation.run(Simulation.scala:28)
                                                  //| 	at week2.test$.$anonfun$main$1(week2.test.scala:13)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$anonfun$$ex
                                                  //| ecute$1(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:76)
                                                  //| 	at week2.test$.main(week2.test.scala:3)
                                                  //| 	at week2.test.main(week2.test.scala)
  in2 setSignal true
  run()
  
  in1 setSignal false
  run()
  
}