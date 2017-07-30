package api

class ClaraGiphyImages(images: Seq[GifImage]) {

  def getMinOrZero(min: Int): Seq[GifImage] =
    if(images.size == min) images else Seq.empty[GifImage]

}


object ClaraGiphyImages {

  def apply(images: Seq[GifImage]): ClaraGiphyImages = new ClaraGiphyImages(images)

}
