package controllers

import domain.{GifImage, ClaraGIPHYFacade}
import play.api.mvc._
import play.api.libs.json._

object Application extends Controller with GifImageJsonWrite {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def search(keyword: String) = Action { implicit request =>
     val api = ClaraGIPHYFacade
     Ok(Json.toJson(api.images(keyword)))
  }
}
