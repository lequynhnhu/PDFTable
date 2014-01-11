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

import org.pdfclown.documents.contents.composition.XAlignmentEnum;
import org.pdfclown.documents.contents.composition.YAlignmentEnum;
import org.pdfclown.documents.contents.fonts.StandardType1Font;

/**
 * The Class PDFTableTextCellTextStyle.
 */
public class PDFTableTextCellTextStyle {

  /** The Constant DEFAULT_FONT_FAMILY. */
  private static final StandardType1Font.FamilyEnum DEFAULT_FONT_FAMILY =
      StandardType1Font.FamilyEnum.Helvetica;

  /** The Constant DEFAULT_FONTSIZE. */
  private static final float DEFAULT_FONTSIZE = 10.0F;

  /** The default xalignment. */
  private static final XAlignmentEnum DEFAULT_XALIGNMENT =
      XAlignmentEnum.Left;

  /** The default yalignment. */
  private static final YAlignmentEnum DEFAULT_YALIGNMENT =
      YAlignmentEnum.Middle;

  /** The font family. */
  private StandardType1Font.FamilyEnum fontFamily;

  /** The font size. */
  private float fontSize;

  /** The x alignment. */
  private XAlignmentEnum xAlignment;

  /** The y alignment. */
  private YAlignmentEnum yAlignment;

  /**
   * Instantiates a new PDFTableTextCellTextStyle with default settings.
   */
  public PDFTableTextCellTextStyle() {
    this.fontFamily = DEFAULT_FONT_FAMILY;
    this.fontSize = DEFAULT_FONTSIZE;
    this.xAlignment = DEFAULT_XALIGNMENT;
    this.yAlignment = DEFAULT_YALIGNMENT;
  }

  /**
   * Instantiates a new PDFTableTextCellTextStyle with defaults and custom
   * fontsize.
   * 
   * @param pFontSize the font size
   */
  public PDFTableTextCellTextStyle(final float pFontSize) {
    this.fontFamily = DEFAULT_FONT_FAMILY;
    this.fontSize = pFontSize;
    this.xAlignment = DEFAULT_XALIGNMENT;
    this.yAlignment = DEFAULT_YALIGNMENT;
  }

  /**
   * Instantiates a new PDFTableTextCellTextStyle with defaults and custom
   * font family and fontsize.
   * 
   * @param pFontFamily the font family
   * @param pFontSize the font size
   */
  public PDFTableTextCellTextStyle(
      final StandardType1Font.FamilyEnum pFontFamily,
      final float pFontSize) {
    this.fontFamily = pFontFamily;
    this.fontSize = pFontSize;
    this.xAlignment = DEFAULT_XALIGNMENT;
    this.yAlignment = DEFAULT_YALIGNMENT;
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
   * Gets the font size.
   * 
   * @return the font size
   */
  public final float getFontSize() {
    return this.fontSize;
  }

  /**
   * Gets the x alignment.
   * 
   * @return the xAlignment
   */
  public final XAlignmentEnum getXAlignment() {
    return this.xAlignment;
  }

  /**
   * Gets the y alignment.
   * 
   * @return the yAlignment
   */
  public final YAlignmentEnum getYAlignment() {
    return this.yAlignment;
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
   * Sets the font size.
   * 
   * @param pFontsize the new font size
   */
  public final void setFontSize(final float pFontsize) {
    this.fontSize = pFontsize;
  }

  /**
   * @param pXAlignment the xAlignment to set
   */
  public final void setXAlignment(final XAlignmentEnum pXAlignment) {
    this.xAlignment = pXAlignment;
  }

  /**
   * @param pYAlignment the yAlignment to set
   */
  public final void setYAlignment(final YAlignmentEnum pYAlignment) {
    this.yAlignment = pYAlignment;
  }
}
