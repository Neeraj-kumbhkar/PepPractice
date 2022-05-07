package scala.programs

import java.util.Scanner

object InverseArray {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val n = sc.nextInt();
    val arr = new Array[Int](n)
    for(i<-0 to n-1){
      arr(i) = sc.nextInt()
    }
    for(i<-(0 to arr.length-1).reverse){
      arr(arr(i))=i
    }
    arr.foreach(i=>print(i+","))
  }
}
