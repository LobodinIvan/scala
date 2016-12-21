import scala.math.pow

/*Написать функцию умножения чисел (их квадратов, кубов и т.д.) в
  диапазоне (аналогично рассмотренной на лекции).*/

object Lab1 {

  /**
    * @param a range start
    * @param b range end
    * @param c function which involute
    * @return multiplied numbers in the range
    */
  def multiply(a: Int, b: Int, c: (Int) => Int): Int = {
    if (a == b) c(a)
    else if (a < b) c(a) * multiply(a + 1, b, c)
    else c(a) * multiply(a - 1, b, c)
  }

  /**
    * Function that takes one number and raised to the power 2
    * @param a number that should be involute
    * @return the number of the power of 2
    */
  def pow2(a: Int): Int = {
    pow(a, 2).toInt
  }

  /**
    * Function that takes one number and raised to the power 3
    * @param a number that should be involute
    * @return the number of the power of 3
    */
  def pow3(a: Int): Int = {
    pow(a, 3).toInt
  }

}