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

  /**
    *
    * @param s any sequence
    * @return mean of the passed sequence
    */
  def mean(s: Seq[Double]) = if (s.isEmpty) None else Some(s.sum / s.length)

}
