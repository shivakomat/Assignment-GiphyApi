package giphyapi

import http.HTTPClient
import skinny.http.Response

object GiphyClientFacade extends GiphyClientApi with GiphyConfig {

  override def search(keyword: String, limit: Int = 20): Response = {
    val searchParams = keyword.replace(' ', '+')
    val requestURL = SEARCH_URL + searchParams + WITH_LIMIT + limit.toString + API_KEY
    HTTPClient.GET(requestURL)
  }

}
