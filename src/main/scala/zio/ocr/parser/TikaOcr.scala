package zio.ocr.parser
import zio.*
import zio.ocr.types.ImagePath

final class TikaOcr() extends Ocr:
  def parseImage(path: ImagePath): Task[String] = ???

object TikaOcr:
  lazy val layer: ULayer[Ocr] = ZLayer.succeed(new TikaOcr())
