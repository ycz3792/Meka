/*
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 * Copyright (C) 2015 University of Waikato, Hamilton, New Zealand
 */

package meka.classifiers.multilabel;

import junit.framework.Test;
import junit.framework.TestSuite;
import meka.classifiers.AbstractMekaClassifierTest;
import weka.classifiers.Classifier;

/**
 * Tests PMCC. Run from the command line with:<p/>
 * java meka.classifiers.multilabel.PMCCTest
 *
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 117 $
 */
public class PMCCTest 
  extends AbstractMekaClassifierTest {

  /**
   * Initializes the test.
   * 
   * @param name the name of the test
   */
  public PMCCTest(String name) { 
    super(name);  
  }

  /** 
   * Creates a default classifier.
   * 
   * @return the classifier
   */
  @Override
  public Classifier getClassifier() {
    return new PMCC();
  }

  public static Test suite() {
    return new TestSuite(PMCCTest.class);
  }

  public static void main(String[] args){
    junit.textui.TestRunner.run(suite());
  }
}
