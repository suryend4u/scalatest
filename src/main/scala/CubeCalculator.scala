class CubeCalculator{
  def cube(x: Int) = {
    x * x * x
  }
}

object CubeCalculator extends CubeCalculator {



    def main(args: Array[String]) = {

     println(cube(4))

      Console.println("[total ms]")

  }

}