import org.scalatest.WordSpec
import org.scalatest.Matchers._

class StringProcessorSpec extends WordSpec {

  val stringProcessorService = StringProcessor
  "Sum of integers in the string" should {

    "return 4 for 4" in {

      stringProcessorService.processString("4") shouldBe 4
    }

    "return 9 for 45" in {

      stringProcessorService.processString("45") shouldBe 9
    }

    "return 9 for 4sd5" in {

      stringProcessorService.processString("4sd5") shouldBe 9
    }

    "return 7 for ab1231da" in {

      stringProcessorService.processString("ab1231da") shouldBe 7
    }

    "return 0 for surya" in {

      stringProcessorService.processString("surya") shouldBe 0
    }

    "return 0 for empty String" in {

      stringProcessorService.processString("") shouldBe 0
    }

  }
}