package tags

import scala.xml.Node

/**
  * Created by anders on 06/04/2016.
  */
object Tags {

  sealed abstract class Tag(val n: Node) {
    val getNode = n

    val getTag = n.label
  }

  case object Variable extends Tag(<org.eventb.core.variable/>)

  case object Event extends Tag(<org.eventb.core.event></org.eventb.core.event>)

  case object Invariant extends Tag(<org.eventb.core.invariant/>)

}