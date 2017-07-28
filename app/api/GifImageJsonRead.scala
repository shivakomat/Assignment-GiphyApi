package api

import play.api.libs.json.{JsPath, Reads}
import play.api.libs.functional.syntax._

trait GifImageJsonRead {

  implicit val giImageReads: Reads[GifImage] = (
      (JsPath \ "id").read[String] and
      (JsPath \ "url").read[String]
  )(GifImage.apply _)

}
