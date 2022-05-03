package scala.programs

import java.util.Scanner

object BuildTowerFromNum {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val n = sc.nextInt()
    var max = 0
    val arr = new Array[Int](n)
    for(i<- 0 to n-1){
      arr(i)=sc.nextInt()
      max=Math.max(max,arr(i))
    }
    for(i<-(1 to max).reverse){
      for(b<-arr){
        if(b>=i) print("*\t") else print("\t")
      }
      println()
    }
  }
}
