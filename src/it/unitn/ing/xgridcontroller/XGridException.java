/*
 * @(#)XGridException.java created Feb 17, 2006 Newark Liberty Int. Airport
 *
 * Copyright (c) 1996-2004 Luca Lutterotti All Rights Reserved.
 *
 * This software is the research result of Luca Lutterotti and it is 
 * provided as it is as confidential and proprietary information.  
 * You shall not disclose such Confidential Information and shall use 
 * it only in accordance with the terms of the license agreement you 
 * entered into with the author.
 *
 * THE AUTHOR MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE
 * SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE, OR NON-INFRINGEMENT. THE AUTHOR SHALL NOT BE LIABLE FOR ANY DAMAGES
 * SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING
 * THIS SOFTWARE OR ITS DERIVATIVES.
 *
 */

package it.unitn.ing.xgridcontroller;


/**
 * The XGridException is a class
 * <p/>
 * Description
 *
 * @author Luca Lutterotti
 * @version $Revision: 1.1 $, $Date: 2006/07/20 14:06:05 $
 * @since JDK1.1
 */

public class XGridException extends Throwable {
  private String val;

  public XGridException() {
    val = "XGrid error: unknown error.";
  }

  public XGridException(String str) {
    val = new String("XGrid error: " + str);
  }

  public String toString() {
    return new String(val);
  }
}

