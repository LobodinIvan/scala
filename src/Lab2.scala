/*
  На языке Scala написать функцию variance, вычисляющую дисперсию
  значений элементов последовательности. Реализовать эту же функцию через flatMap.
  variance(Stream()) = None
  variance(List()) = None
*/

object Lab2 {

  /**
    *
    * @param xs any sequence
    * @return variance of the sequence
    */
  def variance(xs: Seq[Double]): Option[Double] = {
    mean(xs).flatMap(m => mean(xs.map(x => Math.pow(x - m, 2))))
  }

  def variance2(xs: Seq[Double]): Option[Double] = xs match {
    case Seq() => None
    case _ =>
      val length = xs.length
      val mean = xs.sum / xs.length
      Some(xs.map(x => math.pow(x - mean,2)).sum /length)
  }

  /**
    *
    * @param s any sequence
    * @return mean of the passed sequence
    */
  def mean(s: Seq[Double]) = if (s.isEmpty) None else Some(s.sum / s.length)

}
