package http

import skinny.http.{HTTP, Response}

object HTTPClient {

  def GET(request: String): Response =
     HTTP.get(request)

}
