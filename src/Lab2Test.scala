import org.scalatest.FunSuite

class Lab2Test extends FunSuite{
  test("Should return variance of List - 5.36") {
    val result = Lab2.varianceList(List(1,4,5,6,8))
    assert(result == 5.36)
  }

  test("Should return variance of Stream - 0.25") {
    val result = Lab2.varianceStream(Stream(1, 2))
    assert(result == 0.25)
  }

  test("Expect to throw RuntimeException because list is empty") {
    assertThrows[RuntimeException] {
      val variance = Lab2.varianceList(List())
    }
  }

  test("Should return 0") {
    val result = Lab2.varianceStream(Stream(1))
    assert(result == 0)
  }
}
