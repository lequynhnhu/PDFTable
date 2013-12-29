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

import java.util.ArrayList;
import java.util.List;

/**
 * The Class PDFTable.
 * 
 * This class describes a Table layout.
 */
public class PDFTable {

  private static void autoFormatTable() {

  }

  /** Number of columns in the table. */
  private final int columnSize;

  /** Contains the width of each column. */
  private final List<Float> columnWidths;

  /** The rows of the PDFTable. */
  private final List<PDFTableRow> rows;

  /** Number of rows in the table. */
  private final int rowSize;

  /**
   * Instantiates a new PDFTable.
   * 
   * @param pColumnSize the column size
   * @param pRowSize the row size
   */
  public PDFTable(int pColumnSize, int pRowSize) {
    this.columnSize = pColumnSize;
    this.rowSize = pRowSize;

    this.columnWidths = new ArrayList<Float>(pColumnSize);
    this.rows = new ArrayList<PDFTableRow>(pColumnSize * pRowSize);
  }

  /**
   * Adds a PDFTableRow to the PDFTable.
   * 
   * @param pRow the row
   */
  public void addRow(PDFTableRow pRow) {
    this.rows.add(pRow.getRow(), pRow);
  }

  /**
   * Gets the number of columns in the table.
   * 
   * @return the number of columns.
   */
  public int getColumnSize() {
    return this.columnSize;
  }

  /**
   * Gets the widths of the i-th column.
   * 
   * @param pIndex the index
   * @return the columnWidths
   */
  public Float getColumnWidth(int pIndex) {
    return this.columnWidths.get(pIndex);
  }

  /**
   * Gets the i-th row.
   * 
   * @param pIndex the index
   * @return the row
   */
  public PDFTableRow getRow(int pIndex) {
    return this.rows.get(pIndex);
  }

  /**
   * Gets the number of rows in the table.
   * 
   * @return the number of rows.
   */
  public int getRowSize() {
    return this.rowSize;
  }

}
