package scala.programs

import scala.collection.mutable.ArrayBuffer

object StringCompaction {
  def compressNotInplace(chars: Array[Char]): Int = {
         if (chars.size == 1) 1
         else {
           val compressed = compressNotInplaceRec(chars.drop(1), chars.head, 1, "")
           val size = compressed.size
           (0 until size).foreach(i => chars(i) = compressed(i))
           size

         }
       }

  def compress(chars: Array[Char]): Int = {
    if (chars.size == 1) 1
    else compressRec1(chars, 1, 0, chars.head, 1)
  }

  def compressRec1(chars: Array[Char], i: Int, j: Int, lastChar: Char, lastCount: Int): Int = {
    val next = if (lastCount == 1) s"$lastChar" else s"$lastChar$lastCount"
    chars.lift(i) match {
      case Some(c) if c == lastChar =>
        compressRec1(chars, i + 1, j, lastChar, lastCount + 1)
      case Some(c) =>
        next.indices.foreach(k => chars(j + k) = next(k))
        compressRec1(chars, i + 1, j + next.size, c, 1)
      case None =>
        next.indices.foreach(k => chars(j + k) = next(k))
        j + next.size
    }
  }


       def compressNotInplaceRec(chars: Array[Char], lastChar: Char, lastCount: Int, acc: String): String = {
         val next = if (lastCount == 1) s"$lastChar" else s"$lastChar$lastCount"
         chars.headOption match {
           case Some(c) if c == lastChar => compressNotInplaceRec(chars.drop(1), lastChar, lastCount + 1, acc)
           case Some(c) => compressNotInplaceRec(chars.drop(1), c, 1, acc + next )
           case None => acc + next
         }
       }
  def main(args: Array[String]): Unit = {
   // println(compressNotInplace(Array('a','a','b','c','c')))
    println(compress(Array('a','a','b','c','c')))
  }
}
