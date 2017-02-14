/*
 * $Id: SGException.java,v 1.1 2004/12/27 16:15:20 luca Exp $
 *
 * This software is provided by NOAA for full, free and open release.  It is
 * understood by the recipient/user that NOAA assumes no liability for any
 * errors contained in the code.  Although this software is released without
 * conditions or restrictions in its use, it is expected that appropriate
 * credit be given to its author and to the National Oceanic and Atmospheric
 * Administration should the software be included by the recipient as an
 * element in other product development.
 */

package  gov.noaa.pmel.sgt;

/**
 * Base class for gov.noaa.pmel.sgt exceptions.
 *
 * @author Donald Denbo
 * @version $Revision: 1.1 $, $Date: 2004/12/27 16:15:20 $
 */
public class SGException extends java.lang.Exception {
  public SGException() {
    super();
  }
  public SGException(String s) {
    super(s);
  }
}