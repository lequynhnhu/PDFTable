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

/**
 * The Class PDFCellPaddingOutOfBoundsException.
 */
public class PDFCellPaddingOutOfBoundsException extends Exception {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = -9002186954804985298L;

  /**
   * Instantiates a new pDF cell padding out of bounds exception.
   */
  PDFCellPaddingOutOfBoundsException() {
  }

  /**
   * Instantiates a new PDFCellPaddingOutOfBounds exception.
   * 
   * Padding value should be zero or positive
   * 
   * @param pMessage the message
   */
  PDFCellPaddingOutOfBoundsException(final String pMessage) {
    super(pMessage);
  }

}
