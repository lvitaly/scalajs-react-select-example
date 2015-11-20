package scalajsreact.select.example.models

import com.payalabs.scalajs.react.bridge.ReactBridgeComponent

import scala.scalajs.js

case class Select(id: js.UndefOr[String] = js.undefined,
                  className: js.UndefOr[String] = js.undefined,
                  ref: js.UndefOr[String] = js.undefined,
                  key: js.UndefOr[Any] = js.undefined,
                  name: js.UndefOr[String] = js.undefined,
                  value: js.UndefOr[Any] = js.undefined,
                  options: js.UndefOr[js.Array[String]] = js.undefined) extends ReactBridgeComponent