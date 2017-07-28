package giphyapi

import http.HTTPClient
import skinny.http.Response

object GiphyClientFacade extends GiphyClientApi with GiphyConfig {

  override def search(keyword: String): Response = {
    val searchParams = keyword.replace(' ', '+')
    HTTPClient.GET(SEARCH_URL + searchParams + API_KEY)
  }

}
