/*
 * Copyright (C) 2014 Mossie <mossie@MosSoft.nl>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307,
 * USA.
 */
package nl.mossoft.PDFTable.main;

import org.pdfclown.documents.contents.fonts.StandardType1Font;

/**
 * The Class PDFTextCellTextStyle.
 */
public class PDFTextCellTextStyle {

  /** The default font family. */
  private static final StandardType1Font.FamilyEnum DEFAULT_FONT_FAMILY =
      StandardType1Font.FamilyEnum.Helvetica;

  /** The default fontsize. */
  private static final float DEFAULT_FONTSIZE = 10.0F;

  /** The font family. */
  private StandardType1Font.FamilyEnum fontFamily;

  /** The fontSize. */
  private float fontSize;

  /**
   * Instantiates a new PDFTextCellTextStyle using the default font
   * family and the default fontsize.
   */
  public PDFTextCellTextStyle() {
    this.fontFamily = DEFAULT_FONT_FAMILY;
    this.fontSize = DEFAULT_FONTSIZE;
  }

  /**
   * Instantiates a new PDFTextCellTextStyle using the default font
   * family and a custom fontsize.
   * 
   * @param pFontSize the fontSize
   */
  public PDFTextCellTextStyle(final float pFontSize) {
    this.fontFamily = DEFAULT_FONT_FAMILY;
    this.fontSize = pFontSize;
  }

  /**
   * Instantiates a new PDFTextCellTextStyle using a custom font family
   * and a custom fontsize.
   * 
   * @param pFontFamily the font family
   * @param pFontSize the fontsize
   */
  public PDFTextCellTextStyle(
      final StandardType1Font.FamilyEnum pFontFamily,
      final float pFontSize) {
    this.fontFamily = pFontFamily;
    this.fontSize = pFontSize;
  }

  /**
   * Gets the font family.
   * 
   * @return the font family
   */
  public final StandardType1Font.FamilyEnum getFontFamily() {
    return this.fontFamily;
  }

  /**
   * Gets the fontsize.
   * 
   * @return the fontSize
   */
  public final float getFontSize() {
    return this.fontSize;
  }

  /**
   * Sets the font family.
   * 
   * @param pFontFamily the new font family
   */
  public final void setFontFamily(
      final StandardType1Font.FamilyEnum pFontFamily) {
    this.fontFamily = pFontFamily;
  }

  /**
   * Sets the fontsize.
   * 
   * @param pFontsize the new fontsize
   */
  public final void setFontSize(final float pFontsize) {
    this.fontSize = pFontsize;
  }
}
