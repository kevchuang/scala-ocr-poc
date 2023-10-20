package zio.ocr.types

import io.github.iltotore.iron.constraint.all.*

object constraint:
  type NotEmpty = Not[Empty]

  type JPEGPathConstraint = (MinLength[6] & Match[""".*\.jpg"""]) DescribedAs
    "JPEGPath should point towards a .jpg file"

  type PNGPathConstraint = (MinLength[5] & Match[""".*\.png"""]) DescribedAs
    "PNGPath should point towards a .png file"

