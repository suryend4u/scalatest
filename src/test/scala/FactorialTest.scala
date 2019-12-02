import org.scalatest.WordSpec
import org.scalatest.Matchers._

class FactorialTest extends WordSpec {

  val factService = Factorial
  "Factorial with for loop" should {

    "return 1 for 1!" in {

      factService.withForLoop(1) shouldBe 1
    }

    "return 2 for 2!" in {

      factService.withForLoop(2) shouldBe 2
    }

    "return 6 for 3!" in {

      factService.withForLoop(3) shouldBe 6
    }

    "return 24 for 4!" in {

      factService.withForLoop(4) shouldBe 24
    }
  }

  "Factorial with while loop" should {

    "return 1 for 1!" in {

      factService.withWhileLoop(1) shouldBe 1
    }

    "return 2 for 2!" in {

      factService.withWhileLoop(2) shouldBe 2
    }

    "return 6 for 3!" in {

      factService.withWhileLoop(3) shouldBe 6
    }

    "return 24 for 4!" in {

      factService.withWhileLoop(4) shouldBe 24
    }
  }

  "Factorial with Recursion" should {

    "return 1 for 1!" in {

      factService.withRecursion(1) shouldBe 1
    }

    "return 2 for 2!" in {

      factService.withRecursion(2) shouldBe 2
    }

    "return 120 for 5!" in {

      factService.withRecursion(5) shouldBe 120
    }

    "return 720 for 6!" in {

      factService.withRecursion(6) shouldBe 720
    }
    "Throw StackOverflowError for large value" in {
      intercept[StackOverflowError] {
        factService.withRecursion(Int.MaxValue)
      }
    }
  }

  "Factorial with Tailed Recursion" should {

    "return 1 for 1!" in {

      factService.withTailedRecursion(1) shouldBe 1
    }

    "return 2 for 2!" in {

      factService.withTailedRecursion(2) shouldBe 2
    }

    "return 120 for 5!" in {

      factService.withTailedRecursion(5) shouldBe 120
    }

    "return 720 for 6!" in {

      factService.withTailedRecursion(6) shouldBe 720
    }
  }

  "Factorial with Left Fold" should {

    "return 1 for 1!" in {

      factService.withLeftFold(1) shouldBe 1
    }

    "return 2 for 2!" in {

      factService.withLeftFold(2) shouldBe 2
    }

    "return 120 for 5!" in {

      factService.withLeftFold(5) shouldBe 120
    }

    "return 720 for 6!" in {

      factService.withLeftFold(6) shouldBe 720
    }
  }
}
