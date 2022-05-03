package scala.programs

import scala.io.StdIn.{readInt, readLine}

object IsPrime {
  def isPrime(n:Int):Boolean={
    if(n<=1) false
    else if(n==2) true
    else !(2+:(3 to Math.sqrt(n).toInt by  2) exists (n%_ == 0))
  }
  def main(args: Array[String]): Unit = {
    println(isPrime(readInt()))
  }
}
