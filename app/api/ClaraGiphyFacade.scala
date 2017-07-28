package api

import giphyapi.GiphyClientFacade

object ClaraGiphyFacade extends ClaraGiphyApi {
  override def images(keyword: String): Seq[GifImage] =
    GifImageConversion.to(GiphyClientFacade.search(keyword).textBody)
}
