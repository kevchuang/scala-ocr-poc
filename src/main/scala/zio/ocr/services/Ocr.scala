package zio.ocr.services

object Ocr:
  type Ocr = OcrService
  trait OcrService:
    def parseImage: ???
  end OcrService
end Ocr
