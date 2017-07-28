package domain


trait ClaraGIPHYApi {
  def images(keyword: String): Seq[GifImage]
}


object ClaraGIPHYFacade extends ClaraGIPHYApi {
  override def images(keyword: String): Seq[GifImage] =
    GifImageConversion.to(GIPHYClientFacade.search(keyword).textBody)
}
