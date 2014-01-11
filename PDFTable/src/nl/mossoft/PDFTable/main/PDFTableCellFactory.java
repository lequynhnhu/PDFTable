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
 * A factory for creating PDFTableCell objects.
 */
public class PDFTableCellFactory {

  /**
   * Gets an instance of PDFTableCell.
   * 
   * @param pRow the row
   * @param pColumn the column
   * @param pCellType the cell type
   * @return the PDFTableCell
   * @throws PDFTableCellTypeUnknownTypeException the
   *           PDFTableCellTypeUnknownTypeException
   */
  public final PDFTableCell getPDFTableCell(
      final int pRow,
      final int pColumn,
      final PDFTableCellType pCellType)
      throws PDFTableCellTypeUnknownTypeException {

    PDFTableCell cell = null;
    switch (pCellType) {
      case TEXT:
        cell = new PDFTableTextCell(pRow, pColumn);
        break;

      default:
        throw new PDFTableCellTypeUnknownTypeException();
    }
    return cell;
  }

}
