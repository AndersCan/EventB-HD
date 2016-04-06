package tags

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by anders on 06/04/2016.
  */
class TagsTest extends FlatSpec with Matchers {
  "Tags" should "return a variable node" in {
    val expected = <org.eventb.core.variable/>
    val actual = Tags.Variable.getNode
    actual should be(expected)
  }
  it should "return the correct string tag representation" in {
    val expected = "org.eventb.core.variable"
    val actual = Tags.Variable.getTag
    actual should be(expected)
  }
}
