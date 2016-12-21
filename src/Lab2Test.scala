import org.scalatest.FunSuite

class Lab2Test extends FunSuite{

  test(" Expect to return variance Some(1778.5)") {
    val s: Seq[Double] = List(1.0, 2.0, 5.0, 100.0);

    assert(Lab2.variance(s) == Some(1778.5))
  }

  test("The is no variance for empty list") {
    assert(Lab2.variance(Nil) == None)
  }

}
