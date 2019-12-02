object StringProcessor {
  def processString(value: String): Int = {

    //value.toInt
    val stringArr = value.toList
    val numList = (0 to 9).toList.map(_.toString)
    stringArr.foldLeft(0)((a, b) => {
      if (numList.contains(b.toString))
        a + b.toString.toInt
      else
        a
    })

  }

}
