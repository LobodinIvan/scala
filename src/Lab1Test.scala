import org.scalatest.FunSuite

class Lab1Test extends FunSuite{
  test("Expect to return 36") {
    val result = Lab1.multiply(1, 3, Lab1.pow2)
    assert(result == 36)
  }

  test("Expect to return 13824") {
    val result = Lab1.multiply(1, 4, Lab1.pow3)
    assert(result == 13824)
  }

  test("Expect to return 576") {
    val result = Lab1.multiply(4, 1, Lab1.pow2)
    assert(result == 676)
  }
}
