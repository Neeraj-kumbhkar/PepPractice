package scala.programs

import java.util.Scanner

object SubsetOfArray {

  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val n = sc.nextInt()
    val arr = new Array[Int](n)
    for(i<-0 to arr.length-1){
      arr(i) = sc.nextInt()
    }
    val tans = (Math.pow(2,n)-1).toInt
    for(i<-0  to tans){
      var tmp = i
      var ans = ""
      for(j<-(0 to (n-1)).reverse){
        val dec = tmp%2
        ans = if(dec==0) "-\t"+ans else arr(j)+"\t"+ans
        tmp=tmp/2
      }
      println(ans)
    }
  }
}
