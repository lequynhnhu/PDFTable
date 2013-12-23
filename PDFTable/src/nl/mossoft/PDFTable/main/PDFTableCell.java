/*
 * Copyright (C) 2013 Mossie <mossie@MosSoft.nl>
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
 * The Class PDFTableCell.
 */
public class PDFTableCell {

  /** The column. */
  private final int column;

  /** The row. */
  private final int row;

  /** The cell height. */
  private float cellHeight = 0f;

  /** The cell width. */
  private float cellWidth = 0f;

  /** The colSpan. */
  private int colSpan = 1;

  /** The heading. */
  private boolean heading = false;

  /**
   * Instantiates a new PDFTableCell.
   * 
   * @param pRow the row
   * @param pColumn the column
   */
  public PDFTableCell(final int pRow, final int pColumn) {
    this.column = pColumn;
    this.row = pRow;
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
   * @param pColspan the new colspan
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

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public final String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("PDFTableCell [column=");
    builder.append(getColumn());
    builder.append(", row=");
    builder.append(getRow());
    builder.append(", cellHeight=");
    builder.append(getCellHeight());
    builder.append(", CellWidth=");
    builder.append(getCellWidth());
    builder.append(", colSpan=");
    builder.append(getColSpan());
    builder.append(", isHeading=");
    builder.append(isHeading());
    builder.append("]");
    return builder.toString();
  }

}
