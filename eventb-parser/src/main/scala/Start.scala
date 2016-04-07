/**
  * Created by anders on 05/04/2016.
  */

import parser.MachineParser
import parser.MachineParser.BMachine
import tags.Tags

import scala.xml.{Node, XML}

/**
  * Proof of concept for combining Event-B Machines (.bum files)
  * // 1. Parse Event-b machines
  * // 2. Combine machines
  * // 3. Output file
  */
object Start {


  def main(args: Array[String]): Unit = {
    val machines = List("ParserTest/Machine1.bum")//, "ParserTest/Machine2.bum")

    val parsedMachines: List[BMachine] =
      machines
        .map(filepath => MachineParser.parseMachine(filepath))

    parsedMachines
      .foreach(bm => println(MachineParser.generateDeadlockInvariant(bm)))


    //    val combined = MachineParser.combineMachines(parsedMachines(0), parsedMachines(1))
    //    combined.variables
    //      .foreach(x => println(x))
    //    val machine1 = XML.loadFile("ParserTest/Machine1.bum")
    //    val xml = XML.loadFile("ParserTest/Machine1.bum")
    //    //    xml.descendant
    //    //      .filter(n => isVariable(n))
    //    //      .foreach((n: Node) => {
    //    //        println(n)
    //    //      })
    //    val variables = xml \ "org.eventb.core.variable"
    //    val events: Seq[Node] = xml \ "org.eventb.core.event"
    //
    //    variables foreach println
    //    println("---")
    //    events foreach println

    //    printVariables(xml.descendant)

  }

  def isVariable(node: Node): Boolean = {
    node match {
      case <org.eventb.core.variable/> => true
      case _ => false
    }
  }

  def isEvent(node: Node): Boolean = {
    node match {
      case Tags.Variable.getNode => true
      case _ => false
    }
  }

  def printVariables(inputXml: List[Node]): Unit = {
    inputXml match {
      case x :: xs => {
        x match {
          // @formatter:off
          case node @ Tags.Variable.getNode =>
            // @formatter:on
            println("ID: " + node \ "@org.eventb.core.identifier")
          case _ => {
            println("Printing")
            printVariables(xs)
          }
        }
      }
      case _ => println("EOF!")
    }
  }
}
