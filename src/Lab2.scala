import scala.math.pow

/*
  На языке Scala написать функцию variance, вычисляющую дисперсию
  значений элементов последовательности. Реализовать эту же функцию через flatMap.
  variance(Stream()) = None
  variance(List()) = None
*/

object Lab2 {

  /**
    * @param list
    * @return variance of the list
    */
  def varianceList(list: List[Int]): Double = {
    if (list.isEmpty) sys.error("list is empty")
    val av: Double = meanList(list)
    var s: Double = 0
    list.foreach(x => s += pow(x - av, 2.0))
    s/list.length
  }

  /**
    *
    * @param stream
    * @return variance of the stream
    */
  def varianceStream(stream: Stream[Int]): Double = {
    if (stream.isEmpty) sys.error("stream is empty")
    val av: Double = meanStream(stream)
    var s: Double = 0
    stream.foreach(x => s+= pow(x - av, 2.0))
    s/stream.length
  }

  def main(args: Array[String]): Unit = {
    println(varianceStream(Stream(1, 2)))
  }

  /**
    *
    * @param lst
    * @param acc
    * @param size
    * @return average of the lst
    */
  def meanList(lst: List[Int], acc: Int = 0, size: Int = 0): Double = {
    if (lst.isEmpty) acc.toDouble/size
    else meanList(lst.tail, acc + lst.head, size + 1)
  }

  /**
    *
    * @param str
    * @param acc
    * @param size
    * @return average of the stream
    */
  def meanStream(str: Stream[Int], acc: Int = 0, size: Int = 0): Double = {
    if (str.isEmpty) acc.toDouble/size
    else meanStream(str.tail, acc + str.head, size + 1)
  }
}
