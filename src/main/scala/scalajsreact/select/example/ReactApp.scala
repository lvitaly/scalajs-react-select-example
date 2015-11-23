package scalajsreact.select.example

import japgolly.scalajs.react._
import org.scalajs.dom

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport
import scalajsreact.select.example.css.AppCSS
import scalajsreact.select.example.routes.AppRouter

@JSExport
object ReactApp extends JSApp {

  @JSExport
  override def main(): Unit = {
    AppCSS.load
    AppRouter.router().render(dom.document.getElementById("app-container"))
  }

}

