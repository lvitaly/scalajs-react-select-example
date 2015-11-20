package scalajsreact.select.example.css

import scalacss.Defaults._
import scalacss.ScalaCssReact._
import scalacss.mutable.GlobalRegistry
import scalajsreact.select.example.components.{LeftNav, TopNav}
import scalajsreact.select.example.pages.{ItemsPage, HomePage}

object AppCSS {

  def load = {
    GlobalRegistry.register(
      GlobalStyle,
      TopNav.Style,
      LeftNav.Style,
      ItemsPage.Style,
      HomePage.Style)
    GlobalRegistry.onRegistration(_.addToDocument())
  }
}
