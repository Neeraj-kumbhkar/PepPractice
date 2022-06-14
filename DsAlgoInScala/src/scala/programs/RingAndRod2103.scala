package scala.programs

import scala.collection.immutable.HashSet
import scala.collection.immutable.Nil.distinct

object RingAndRod2103 {
  def countPoints(rings: String): Int = {
    val n = rings.length()-1
    var arr = new Array[HashSet[Character]](10)

    for (i<-0 to 9){
      arr(i) = new HashSet[Character]()
    }

    for(i<-0 to n by 2){
      val pair = rings.substring(i,i+2)
      val ring = pair.charAt(0)
      println(ring)
      val rod = pair.charAt(1)-'0'
      println(rod)
      arr(rod)+=ring
    }
    var count=0
    for(i<-0 to 9){
      if(arr(i).size==3){
        count=count+1
      }
    }
    return count
  }
  def countPointsFunctional(rings: String): Int = {
    val rods = rings.partition(char => char.isDigit)
    rods._1.zip(rods._2)
      .groupBy(element => element._1)
      .map(seq => seq._2.map(ch => ch._2).toSet)
      .count(seq => seq.size == 3)
  }

  def main(args: Array[String]): Unit = {
      val s = "B0B6G0R6R0R6G9"
      println(countPoints(s))
    println(countPointsFunctional(s))
  }
}
