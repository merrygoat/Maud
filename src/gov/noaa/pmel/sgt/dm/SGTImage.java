/*
 * $Id: SGTImage.java,v 1.1 2004/12/27 16:15:22 luca Exp $
 *
 * This software is provided by NOAA for full, free and open release.  It is
 * understood by the recipient/user that NOAA assumes no liability for any
 * errors contained in the code.  Although this software is released without
 * conditions or restrictions in its use, it is expected that appropriate
 * credit be given to its author and to the National Oceanic and Atmospheric
 * Administration should the software be included by the recipient as an
 * element in other product development.
 */
 
package gov.noaa.pmel.sgt.dm;
 
import java.awt.Image;
 
/**
 * Defines a data object to be of <code>Image</code> type. Interpretation 
 * of X and Y is determined by the <code>CoordinateSystem</code>.  For
 * <code>Cartesian</code>, X and Y are the Cartesian coordinates. For
 * <code>Polar</code>,
 * X and Y are R (radius) and Theta (angle), respectively.
 *
 * The </code>SGTImage</code> interface only specifies the methods required
 * to access information. The methods used to construct an
 * object that implements <code>SGTImage</code> is left to the developer.
 *
 * @author Donald Denbo
 * @version $Revision: 1.1 $, $Date: 2004/12/27 16:15:22 $
 * @since 1.0
 * @see SGTData
 * @see CoordinateSystem
 * @see Cartesian
 * @see Polar
 */
public interface SGTImage extends SGTData {
  /**
   * Get the X coordinate edges.
   */
  public double[] getXEdges();
  /**
   * Get the Y coordinate edges.
   */
  public double[] getYEdges();
  /**
   * Get the image.
   */
  public Image getImage();
  /**
   * Get the X coordinate SGTMetaData.
   */
  public SGTMetaData getXMetaData();
  /**
   * Get the Y coordinate SGTMetaData.
   */
  public SGTMetaData getYMetaData();
  /**
   * Get the pixel SGTMetaData.
   */
  public SGTMetaData getZMetaData();
}

