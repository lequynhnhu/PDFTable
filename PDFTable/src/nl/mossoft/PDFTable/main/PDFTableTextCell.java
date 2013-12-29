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
 * The Class PDFTableTextCell.
 * 
 * This class represents a cell in a table that contains text content.
 */
public class PDFTableTextCell extends PDFTableCell {

  private final String text;

  private final float textWidth;

  /**
   * Instantiates a new PDFTableCell containing text.
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

}
