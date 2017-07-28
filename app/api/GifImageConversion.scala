package api

import play.api.libs.json.Json

object GifImageConversion extends GifImageJsonRead {

  def to(body: String): Seq[GifImage] =
    (Json.parse(body) \ "data").as[Seq[GifImage]]

}
