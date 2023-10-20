package zio.ocr.parser

import zio.*
import zio.ocr.types.*

trait Ocr:
  def parseImage(path: ImagePath): Task[String]

object Ocr:
  def parseImage(path: ImagePath): ZIO[Ocr, Throwable, String] =
    ZIO.serviceWithZIO[Ocr](_.parseImage(path))
