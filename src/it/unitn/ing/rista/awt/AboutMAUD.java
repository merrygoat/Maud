/*
 * @(#)AboutMAUD.java created 1/01/1997 ?
 *
 * Copyright (c) 2000 Luca Lutterotti All Rights Reserved.
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

package it.unitn.ing.rista.awt;

import symantec.itools.awt.*;
import symantec.itools.multimedia.*;
import it.unitn.ing.rista.util.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.*;
import javax.swing.border.*;


/**
 * The AboutMAUD is a dialog class providing the about information box.
 *
 * @version $Revision: 1.4 $, $Date: 2006/11/10 09:32:59 $
 * @author Luca Lutterotti
 * @since JDK1.1
 */

public class AboutMAUD extends myJDialog {

	public AboutMAUD(Frame parent, boolean modal) {

		super(parent, modal);

		MouseClicked closing = new MouseClicked();

		Container c1 = getContentPane();
		c1.addMouseListener(closing);
		c1.setLayout(new BorderLayout(6, 6));

		JPanel bp1 = new JPanel();
		bp1.addMouseListener(closing);
		bp1.setLayout(new FlowLayout(FlowLayout.CENTER, 6, 6));

		Animator animator1 = new Animator();
		animator1.addMouseListener(closing);
		try {
			java.net.URL[] tempURL = new java.net.URL[3];
			tempURL[0] = Misc.getResourceURL(Constants.imagesJar, Constants.imagefolder + "Maud_ladybug2_full512.jpg");
			tempURL[1] = Misc.getResourceURL(Constants.imagesJar, Constants.imagefolder + "UNITN_DII_512.jpg");
			tempURL[2] = Misc.getResourceURL(Constants.imagesJar, Constants.imagefolder + "team.jpg");
			animator1.setImageList(tempURL);
			animator1.setDelay(2000);
		} catch (java.beans.PropertyVetoException e) {
		}
		bp1.add(animator1);

		c1.add(BorderLayout.CENTER, bp1);

		bp1 = new JPanel(new BorderLayout(6, 6));
		bp1.addMouseListener(closing);
		c1.add(BorderLayout.EAST, bp1);

		JPanel textPanel = new JPanel(new GridLayout(0, 1, 3, 3));
		bp1.add(BorderLayout.NORTH, textPanel);
		JPanel row = new JPanel(new FlowLayout(FlowLayout.LEFT, 3 , 3));
		row.add(new JLabel("MAUD, Material Analysis Using Diffraction"));
		textPanel.add(row);
		row = new JPanel(new FlowLayout(FlowLayout.LEFT, 3 , 3));
		row.add(new JLabel("version " + Constants.getVersion()));
		textPanel.add(row);
		row = new JPanel(new FlowLayout(FlowLayout.LEFT, 3 , 3));
		row.add(new JLabel(""));
		textPanel.add(row);
		row = new JPanel(new FlowLayout(FlowLayout.LEFT, 3 , 3));
		row.add(new JLabel("written in Java by Luca Lutterotti"));
		textPanel.add(row);
		row = new JPanel(new FlowLayout(FlowLayout.LEFT, 3 , 3));
		row.add(new JLabel("In collaboration with S. Matthies and H. -R. Wenk"));
		textPanel.add(row);
		row = new JPanel(new FlowLayout(FlowLayout.LEFT, 3 , 3));
		row.add(new JLabel("Special thanks to contributors:"));
		textPanel.add(row);
		row = new JPanel(new FlowLayout(FlowLayout.LEFT, 3 , 3));
		row.add(new JLabel("M. Bortolotti, L. Cont, M. Ferrari, D. Chateigner,"));
		textPanel.add(row);
		row = new JPanel(new FlowLayout(FlowLayout.LEFT, 3 , 3));
		row.add(new JLabel("A. Gibaud, R. W. Grosse-Kunstleve and many others"));
		textPanel.add(row);
		row = new JPanel(new FlowLayout(FlowLayout.LEFT, 3 , 3));
		row.add(new JLabel("http://maud.radiographema.com"));
		textPanel.add(row);
		row = new JPanel(new FlowLayout(FlowLayout.LEFT, 3 , 3));
		row.add(new JLabel("1997-2019 Luca Lutterotti, all Rights Reserved"));
		textPanel.add(row);
		row = new JPanel(new FlowLayout(FlowLayout.LEFT, 3 , 3));
		JButton licenseB = new JButton("Show license agreement");
		licenseB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				showHelp("license_maud.txt");
			}
		});
		row.add(licenseB);
		textPanel.add(row);

		setTitle("About MAUD");
		pack();

		animator1.setEnabled(true);

	}

	public AboutMAUD(Frame parent, boolean modal, int dismiss) {

    super(parent, modal);

    MouseClicked closing = new MouseClicked();

    Container c1 = getContentPane();
    c1.addMouseListener(closing);
    c1.setLayout(new BorderLayout(6, 6));

    JPanel bp1 = new JPanel(new BorderLayout(6, 6));
    bp1.addMouseListener(closing);
    bp1.setBorder(new BevelBorder(BevelBorder.LOWERED));
    c1.add(BorderLayout.CENTER, bp1);

    ScrollingText scrollingText1 = new ScrollingText();
    scrollingText1.addMouseListener(closing);
    try {
      scrollingText1.setScrollInterval(100);
      scrollingText1.setScrollUnit(5);
      scrollingText1.setHiliteColor(new java.awt.Color(-13536155));
      java.lang.String[] tempString = new java.lang.String[5];
      tempString[0] = new java.lang.String("written in Java by Luca Lutterotti, "
              + Constants.maudReleaseBuilt);
      tempString[1] = new java.lang.String("In collaboration with S. Matthies and H. -R. Wenk");
      tempString[2] = new java.lang.String("Special thanks to contributors:");
      tempString[3] = new java.lang.String("M. Bortolotti, L. Cont, M. Ferrari, D. Chateigner, A. Gibaud, R. W. Grosse-Kunstleve");
      tempString[4] = new java.lang.String("Many thanks to testers: M. De, Yanxia....");
      scrollingText1.setMessageList(tempString);
    } catch (java.beans.PropertyVetoException e) {
    }
    scrollingText1.setSize(220, 40);
    scrollingText1.setForeground(new Color(255));
    bp1.add(BorderLayout.WEST, scrollingText1);

    ImagePanel imagePanel3 = new ImagePanel();
    imagePanel3.addMouseListener(closing);
    try {
      imagePanel3.setImageURL(Misc.getResourceURL(Constants.imagesJar, Constants.imagefolder + "madeonmac.gif"));
      imagePanel3.setStyle(ImagePanel.IMAGE_CENTERED);
    } catch (java.beans.PropertyVetoException e) {
    }
    imagePanel3.setSize(270, 40);
    bp1.add(BorderLayout.CENTER, imagePanel3);

    bp1 = new JPanel();
    bp1.addMouseListener(closing);
    bp1.setBorder(new BevelBorder(BevelBorder.LOWERED));
    bp1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

    Animator animator1 = new Animator();
    animator1.addMouseListener(closing);
    try {
      animator1.setDelay(3000);
      animator1.setClearFrame(true);
      java.net.URL[] tempURL = new java.net.URL[3];
      tempURL[0] = Misc.getResourceURL(Constants.imagesJar, Constants.imagefolder + "unitndpm.jpg");
      tempURL[1] = Misc.getResourceURL(Constants.imagesJar, Constants.imagefolder + "unibkl.jpg");
      tempURL[2] = Misc.getResourceURL(Constants.imagesJar, Constants.imagefolder + "lacms.jpg");
      animator1.setImageList(tempURL);
    } catch (java.beans.PropertyVetoException e) {
    }
    bp1.add(animator1);

    c1.add(BorderLayout.SOUTH, bp1);

    ImagePanel imagePanel2 = new ImagePanel();
    imagePanel2.addMouseListener(closing);
    try {
      imagePanel2.setImageURL(Misc.getResourceURL(Constants.imagesJar, Constants.imagefolder + "maud_logo.tif"));
      imagePanel2.setStyle(ImagePanel.IMAGE_CENTERED);
    } catch (java.beans.PropertyVetoException e) {
    }
    imagePanel2.setSize(480, 164);

    c1.add(BorderLayout.NORTH, imagePanel2);
    setTitle("About MAUD");
    pack();

    animator1.setEnabled(true);

  }

  public AboutMAUD(Frame parent, String title, boolean modal) {
    this(parent, modal);
    setTitle(title);
  }

	public void showHelp(String filename) {

//		if (helpWindow == null)
		TextViewer helpWindow = new TextViewer(null);
//		else {
//			helpWindow.setVisible(false);
//			helpWindow.dispose();
//		}

		URL helpfile = Misc.getResourceURL(Constants.helpJar, Constants.helpfolder + filename);
		if (helpfile == null)
			System.out.println("File not found: " + Constants.helpfolder + filename);
		else
			helpWindow.DisplayText(helpfile);

		helpWindow.setVisible(true);
	}



	class MouseClicked extends java.awt.event.MouseAdapter {
    public void mousePressed(java.awt.event.MouseEvent event) {
      setVisible(false);
      dispose();
    }
  }


}
