class CubeCalculator{
  def cube(x: Int) = {
    x * x * x
  }
}

object CubeCalculator extends CubeCalculator with App {

  println(cube(4))

}