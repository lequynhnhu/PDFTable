/*
 * Copyright (C) pmossie <peter.mosseveld@gmail.com>
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

// TODO: Auto-generated Javadoc
/**
 * The Class PDFTableCell.
 */
public class PDFTableCell {

  /** The cell height. */
  private float cellHeight = 0f;

  /** The cell width. */
  private float cellWidth = 0f;

  /** The colSpan. */
  private int colSpan = 1;

  /** The column. */
  private final int column;

  /** The heading. */
  private boolean heading = false;

  /** The padding bottom. */
  private final PDFCellPadding paddingBottom;

  /** The padding left. */
  private final PDFCellPadding paddingLeft;

  /** The padding right. */
  private final PDFCellPadding paddingRight;

  /** The padding top. */
  private final PDFCellPadding paddingTop;

  /** The row. */
  private final int row;

  /**
   * Instantiates a new PDFTableCell.
   * 
   * @param pRow the row
   * @param pColumn the column
   */
  public PDFTableCell(final int pRow, final int pColumn) {
    this.column = pColumn;
    this.row = pRow;

    this.paddingBottom = new PDFCellPadding();
    this.paddingLeft = new PDFCellPadding();
    this.paddingRight = new PDFCellPadding();
    this.paddingTop = new PDFCellPadding();

  }

  /**
   * Gets the cell height.
   * 
   * @return the cell height
   */
  public final float getCellHeight() {
    return this.cellHeight;
  }

  /**
   * Gets the cell width.
   * 
   * @return the cell width
   */
  public final float getCellWidth() {
    return this.cellWidth;
  }

  /**
   * Gets the colspan.
   * 
   * @return the colspan
   */
  public final int getColSpan() {
    return this.colSpan;
  }

  /**
   * Gets the column.
   * 
   * @return the column
   */
  public final int getColumn() {
    return this.column;
  }

  /**
   * Gets the padding bottom.
   * 
   * @return the paddingBottom
   */
  public final PDFCellPadding getPaddingBottom() {
    return this.paddingBottom;
  }

  /**
   * Gets the padding left.
   * 
   * @return the paddingLeft
   */
  public final PDFCellPadding getPaddingLeft() {
    return this.paddingLeft;
  }

  /**
   * Gets the padding right.
   * 
   * @return the paddingRight
   */
  public final PDFCellPadding getPaddingRight() {
    return this.paddingRight;
  }

  /**
   * Gets the padding top.
   * 
   * @return the paddingTop
   */
  public final PDFCellPadding getPaddingTop() {
    return this.paddingTop;
  }

  /**
   * Gets the row.
   * 
   * @return the row
   */
  public final int getRow() {
    return this.row;
  }

  /**
   * Checks if is heading.
   * 
   * @return true, if is heading
   */
  public final boolean isHeading() {
    return this.heading;
  }

  /**
   * Sets the cell height.
   * 
   * @param pCellHeight the new cell height
   */
  public final void setCellHeight(final float pCellHeight) {
    this.cellHeight = pCellHeight;
  }

  /**
   * Sets the cell width.
   * 
   * @param pCellWidth the new cell width
   */
  public final void setCellWidth(final float pCellWidth) {
    this.cellWidth = pCellWidth;
  }

  /**
   * Sets the colspan.
   * 
   * @param pColSpan the new col span
   */
  public final void setColSpan(final int pColSpan) {
    this.colSpan = pColSpan;
  }

  /**
   * Sets the heading.
   * 
   * @param pHeading the new heading
   */
  public final void setHeading(final boolean pHeading) {
    this.heading = pHeading;
  }

}