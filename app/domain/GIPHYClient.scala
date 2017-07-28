package domain

import skinny.http.Response



trait GIPHYClientApi {

  def search(keyword: String): Response

}

object GIPHYClientFacade extends GIPHYClientApi with GIPHYApiConfig {

  override def search(keyword: String): Response = {
    val searchParams = keyword.replace(' ', '+')
    HTTPClient.GET(SEARCH_URL + searchParams + API_KEY)
  }

}
