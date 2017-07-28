package api

trait ClaraGiphyApi {
  def images(keyword: String): Seq[GifImage]
}

