package zio.ocr

import io.github.iltotore.iron.*
import zio.ocr.types.constraint.*

package object types:
  opaque type JPEGPath = String :| JPEGPathConstraint
  object JPEGPath
      extends RefinedTypeOpsImpl[String, JPEGPathConstraint, JPEGPath]

  opaque type PNGPath = String :| PNGPathConstraint
  object PNGPath extends RefinedTypeOpsImpl[String, PNGPathConstraint, PNGPath]

  type ImagePath = JPEGPath | PNGPath
