package scala.programs

import scala.io.StdIn.readInt

object InvesreANum {
  def main(args: Array[String]): Unit = {
    var n:Int = readInt() //21543
    var y = 1
    var sum = 0
    while(n>0){
      val x = n%10
      sum+=y*Math.pow(10,x-1).toInt
      n = n/10
      y=y+1;
    }
    println(sum)  //32154
  }
}
