package api

import giphyapi.GiphyClientFacade

object ClaraGiphyFacade extends ClaraGiphyApi {

  override def images(keyword: String): Seq[GifImage] = {
    val numberOfImages = 5
    val resultBody = GiphyClientFacade.search(keyword, numberOfImages).textBody
    val images = GifImageConversion.to(resultBody)
    ClaraGiphyImages(images).getMinOrZero(numberOfImages)
  }

}
