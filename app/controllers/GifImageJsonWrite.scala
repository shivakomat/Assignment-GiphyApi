package controllers

import domain.GifImage
import play.api.libs.json.{Json, Writes}

trait GifImageJsonWrite {

  implicit val gifImageWrites = new Writes[GifImage] {
    def writes(gifImage: GifImage) = Json.obj(
      "gif_id" -> gifImage.gifId,
      "url" -> gifImage.url
    )
  }

}
