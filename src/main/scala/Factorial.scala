import scala.jdk.Accumulator

object Factorial {
  def withLeftFold(value: Int):Int =
    (1 to value).foldLeft(1)((accm,index)=> accm*index)



  def withTailedRecursion(value: Int):Int ={

    def withRecursion(value: Int, accumulator: Int):Int = value match {
      case 0 => accumulator
      case _ =>  withRecursion(value - 1,accumulator*value)
    }
    //5,1
    //4,(5*1)
    //3,(4*5)
    //2,(3*20)
    //1,(2*60)
    //0,(1*120)
    withRecursion(value,1)
  }

  def withRecursion(value: Int):Int = value match {
      case 0 => 1
      case _ => value * withRecursion(value - 1)
    }
 //   if (value == 0) 1 else value * withRecursion(value - 1)


  def withWhileLoop(value: Int): Int = {
    var acc = 1
    var counter = 1
    while (counter <= value) {
      acc = counter * acc
      counter = counter + 1
    }
    acc
  }

  def withForLoop(value: Int): Int = {
    var accumulator = 1
    for (y <- 1 to value) {
      accumulator = y * accumulator
    }
    accumulator
  }

}
