import org.scalatest.FunSuite

class Lab1Test extends FunSuite{
  test("Should return 36") {
    val result = Lab1.multiply(1, 3, Lab1.pow2)
    assert(result == 36)
  }

  test("Should return 13824") {
    val result = Lab1.multiply(1, 4, Lab1.pow3)
    assert(result == 13824)
  }
}
