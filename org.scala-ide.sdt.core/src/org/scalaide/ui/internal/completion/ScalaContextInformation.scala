package org.scalaide.ui.internal.completion

import org.eclipse.jface.text.contentassist.IContextInformation
import org.eclipse.jface.text.contentassist.IContextInformationExtension
import org.eclipse.swt.graphics.Image

class ScalaContextInformation(
    display: String, info: String, image: Image, pos: Int)
    extends IContextInformation
    with IContextInformationExtension {

  def getContextDisplayString() = display
  def getImage() = image
  def getInformationDisplayString() = info
  def getContextInformationPosition(): Int = pos
}
