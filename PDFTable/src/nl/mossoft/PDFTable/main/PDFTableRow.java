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

import java.util.ArrayList;
import java.util.List;

/**
 * The Class PDFTableRow.
 */
public class PDFTableRow {

  /** The PDFCells in the PDFTableRow. */
  private final List<PDFTableCell> cells;

  /** the row number in the PDFTable. */
  private final int row;

  /**
	 * Instantiates a new PDFTableRow.
	 * 
	 * @param pRow
	 *            the row
	 */
  public PDFTableRow(final int pRow) {
    this.row = pRow;
    this.cells = new ArrayList<PDFTableCell>();
  }

  /**
   * Adds a PDFTableCell to the PDFTableRow.
   *
   * @param pCell the cell
   */
  final void addCell(final PDFTableCell pCell) {
    this.cells.add(pCell.getColumn(), pCell);
  }

  /**
   * Gets the row number.
   * 
   * @return the row
   */
  public final int getRow() {
    return this.row;
  }
}
