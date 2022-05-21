package scala.programs

import java.util.Scanner

object BinarySearch {

  def bsMethod(arr: Array[Int], key: Int): Int= {
    var l = 0
    var r = arr.length-1
    while(l<=r){
      val mid = l+r/2
      if(arr(mid)==key) return mid
      if(arr(mid)>key) r = mid-1 else l =  mid+1
    }
    return -1
  }

  def main(args: Array[String]): Unit = {
    val arr = Array(1,2,4,5,7,9,11,12,14,16,17,20,22,30)
    val sc = new Scanner(System.in)
    val key = sc.nextInt()
    print(bsMethod(arr,key))
  }
}
