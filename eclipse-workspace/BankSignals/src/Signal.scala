

class Signal[T](expr: => T, observed: List[Signal[_]] = Nil) {
  private var curExpr: () => T = () => expr
  private var curVal: T = expr
    
  private var observers: Set[Signal[_]] = Set()
  observed.foreach( obs => obs.observers += this )

  protected def computeValue(): Unit = {
    curVal = curExpr()
    observers.foreach(_.computeValue())
  }

  protected def update(expr: => T): Unit = {
    curExpr = () => expr
    computeValue()
  }

  def apply() = curVal

}

object Signal {
  def apply[T](expr: => T,  observed: List[Signal[_]] = Nil) = new Signal(expr, observed)
}

// Leave the implementation of Var as it is for now
class Var[T](expr: => T) extends Signal[T](expr) {
  override def update(expr: => T): Unit = super.update(expr)
}
object Var { def apply[T](expr: => T) = new Var(expr) }