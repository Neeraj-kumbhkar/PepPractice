package scala.programs

import java.util.Scanner

object SumOfTwoArray {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val n1 = sc.nextInt();
    val arr1 = new Array[Int](n1)
    for(i<-0 to n1-1) arr1(i) = sc.nextInt()
    val n2 = sc.nextInt()
    val arr2 = new Array[Int](n2)
    for (i<-0 to n2-1) arr2(i) = sc.nextInt()
    sum(n1,arr1,n2,arr2)
  }
    def sum(n1:Int,arr1:Array[Int],n2:Int,arr2:Array[Int]):Unit={
      var p1 = n1-1
      var p2 = n2-1
      var p3=0
      var carry = 0
      var ans = new Array[Int](if (n1>n2) n1 else n2)
      p3 = ans.length-1
      while(p3>=0){
        var sum=(if(p1>=0) arr1(p1) else 0)+(if(p2>=0) arr2(p2) else 0) + carry
        ans(p3) = sum%10
        carry=sum/10
        p1=p1-1
        p2=p2-1
        p3=p3-1
      }
      if(carry>0) println(carry)
      ans.foreach(i=>println(i))
  }
}
