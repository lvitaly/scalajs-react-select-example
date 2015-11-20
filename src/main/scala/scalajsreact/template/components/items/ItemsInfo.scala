package scalajsreact.template.components.items

import japgolly.scalajs.react.{ReactComponentB, _}
import japgolly.scalajs.react.vdom.prefix_<^._

import scalajsreact.template.models.Select

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
