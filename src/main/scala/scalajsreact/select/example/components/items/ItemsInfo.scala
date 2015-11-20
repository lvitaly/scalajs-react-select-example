package scalajsreact.select.example.components.items

import japgolly.scalajs.react.vdom.prefix_<^._
import japgolly.scalajs.react.{ReactComponentB, _}

import scalajsreact.select.example.models.Select

import com.payalabs.scalajs.react.bridge._

object ItemsInfo {

  val component = ReactComponentB.static("ItemsInfo",
    <.div(
      <.div(" Items Root Page  "),
      Select(name = "Select")()
    )
  ).buildU

  def apply() = component()
}
