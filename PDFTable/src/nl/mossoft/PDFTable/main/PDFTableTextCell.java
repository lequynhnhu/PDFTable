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

/**
 * The Class PDFTableTextCell.
 */
public class PDFTableTextCell extends PDFTableCell {

  /** The text. */
  private final String text;

  /** The text width. */
  private final float textWidth;

  /** The font style. */
  private PDFTableTextCellTextStyle textStyle;

  /**
   * Instantiates a new PDFTableTextCell.
   * 
   * @param pRow the row
   * @param pColumn the column
   */
  public PDFTableTextCell(final int pRow, final int pColumn) {
    super(pRow, pColumn);

    this.text = "";
    this.textWidth = 0;

    setCellWidth(this.textWidth);
  }

  /**
   * Instantiates a new PDFTableTextCell.
   * 
   * @param pRow the row
   * @param pColumn the column
   * @param pText the text
   */
  public PDFTableTextCell(
      final int pRow,
      final int pColumn,
      final String pText) {
    super(pRow, pColumn);

    this.text = pText;
    this.textWidth = 0;

    setCellWidth(this.textWidth);
  }

  /**
   * Gets the text.
   * 
   * @return the text
   */
  public final String getText() {
    return this.text;
  }

  /**
   * Get text style.
   * 
   * @return the textStyle
   */
  public final PDFTableTextCellTextStyle getTextStyle() {
    return this.textStyle;
  }

  /**
   * Gets the text width.
   * 
   * @return the text width
   */
  public final float getTextWidth() {
    return this.textWidth;
  }

  /**
   * Sets the text style.
   * 
   * @param pTextStyle the textStyle to set
   */
  public final void setTextStyle(final PDFTableTextCellTextStyle pTextStyle) {
    this.textStyle = pTextStyle;
  }

}
