package various
import eu.timepit.refined.auto._

object RunIt extends App {

  val nameOfUser = refinement.foo("gogo")
  println(s"refinement stuff $nameOfUser")
}
