package giphyapi

trait GiphyConfig {

  val API_KEY: String = "&api_key=b7b15a716a454d20926cb5e4be6f90b4"
  val ROOT_URL: String = "http://api.giphy.com/v1/gifs/"

  val SEARCH_URL: String = ROOT_URL.concat("search?q=")

  val WITH_LIMIT: String = "&limit="

}
