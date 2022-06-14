package scala.programs

object RunningSum {
  def runningSum(a:Array[Int]):Array[Int]={
    a.scanLeft(0)(_+_).drop(1)
    a.tail.scanLeft(a.head)(_+_)
  }
  def main(args: Array[String]): Unit = {
    val a = Array(1,2,3,4,5,6)
    runningSum(a).mkString(",").foreach(i=>print(i))
  }
}
