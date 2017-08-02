import api.ClaraGiphyFacade
import org.specs2.mutable._
import org.specs2.runner._
import org.junit.runner._

@RunWith(classOf[JUnitRunner])
class ClaraGiphyFacadeAT extends  Specification {

  val api = ClaraGiphyFacade

  "images should return only 5 images with search keyword that has more than 5 results" in  {
    api.images("funny cat").size equals 5
  }

  "images should return 0 results when search keyword results in less than 5" in {
    api.images("sindhu").isEmpty shouldEqual true
  }

}
