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

public class PDFCellPadding {

  private float value = 0.0f;

  /**
   * Instantiates a new PDFCellPadding.
   * 
   * @param pValue the value
   * @throws PDFCellPaddingOutOfBoundsException
   */
  public PDFCellPadding(final float pValue)
      throws PDFCellPaddingOutOfBoundsException {
    if (pValue >= 0.0f) {
      this.value = pValue;
    } else {
      throw new PDFCellPaddingOutOfBoundsException();
    }
  }

  /**
   * Gets the padding value.
   * 
   * @return the value
   */
  public float getValue() {
    return this.value;
  }

  /**
   * Sets the padding value.
   * 
   * @param pValue the new value
   * @throws PDFCellPaddingOutOfBoundsException the pDF cell padding out
   *           of bounds exception
   */
  public void setValue(float pValue)
      throws PDFCellPaddingOutOfBoundsException {
    if (pValue >= 0.0f) {
      this.value = pValue;
    } else {
      throw new PDFCellPaddingOutOfBoundsException();
    }
  }
}
