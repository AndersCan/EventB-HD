package parser

import org.scalatest.{FlatSpec, Matchers}

import scala.xml.Node

/**
  * Created by anders on 05/04/2016.
  */
class MachineParserTests extends FlatSpec with Matchers {
  val xmlNode: Seq[Node] =
      <org.eventb.core.variable org.eventb.core.identifier="ID1" name="("/>
        <org.eventb.core.variable org.eventb.core.identifier="ID2" name=")"/>
        <org.eventb.core.variable org.eventb.core.identifier="ID3" name="*"/>
        <org.eventb.core.variable org.eventb.core.identifier="ID4" name="+"/>
        <org.eventb.core.variable org.eventb.core.identifier="ID5" name=","/>

  "MachineParser" should "find highest valued name of variables" in {
    val max = MachineParser.getHighestValuedName(xmlNode)
    max should be(',')
  }
  it should "be able to increment char value of a node" in {
    val n = MachineParser.increment(
        <org.eventb.core.variable org.eventb.core.identifier="ID1" name="("/>,
      28)

    println(n)

  }


}

//it should "work for all char combinations " in {
//    forAll { (c1: Char, c2: Char) =>
//      val node1 = <org.eventb.core.variable org.eventb.core.identifier="ID1" name={c1}/>
//      val node2 = <org.eventb.core.variable org.eventb.core.identifier="ID1" name={c2}/>
//      val max = MachineParser.getHighestValuedName(node1 ++ node2)
//      val c1Greatest = c1 > c2
//      if (c1Greatest) {
//        max.shouldBe(c1)
//      } else {
//        max.shouldBe(c2)
//      }
//    }
//  }