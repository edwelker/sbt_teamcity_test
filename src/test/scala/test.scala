import org.scalatest._
import org.scalatest.matchers.ShouldMatchers

class HelloSpec extends FlatSpec with ShouldMatchers {
  "Hello" should "know how to greet" in {
    Hello.who should be === "TeamCity"
  }
}
