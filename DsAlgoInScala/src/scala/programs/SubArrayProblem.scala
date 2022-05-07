package scala.programs

object SubArrayProblem {
  def subArrayPr(a: Array[Int]) = {
    val n = a.length - 1
    for (st <- 0 to n) {
      for (end <- st to n) {
        for (tr <- st to end) {
          print(a(tr))
        }
        println()
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val n = Array(10, 20, 30)
    subArrayPr(n)
  }
}
