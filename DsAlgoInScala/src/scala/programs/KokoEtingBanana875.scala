package scala.programs

object KokoEtingBanana875 {
    def minEatingSpeed(piles: Array[Int], h: Int): Int = {
      var lo = 1
      var hi = 1e9.toInt
      var speed = 1e9.toInt
      while(lo<=hi){
        var mid  = lo+(hi-lo)/2
        if(chaker(piles,mid,h)){
          speed = mid
          hi = mid-1
        } else lo = mid+1
      }
      return speed
    }
    def chaker(piles:Array[Int],speed:Int,h:Int):Boolean={
      var time = 0
      for(nob<-piles){
        time = time+Math.ceil(nob/(1.0*speed)).toInt
      }
      return time<=h
    }
  def main(args: Array[String]): Unit = {

  }
}
