package giphyapi

import skinny.http.Response



trait GiphyClientApi {

  def search(keyword: String, limit: Int): Response

}
