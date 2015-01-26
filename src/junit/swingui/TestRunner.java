/**
 * File Name: TestRunner.java
 * 
 * Copyright (c) 2014 BISON Schweiz AG, All Rights Reserved.
 */

package junit.swingui;

import junit.framework.TestCase;

@Deprecated
public class TestRunner {

  public static void main(String[] args) {
    junit.textui.TestRunner.main(args);
  }

  public static void run(Class<?> clazz) {
    @SuppressWarnings("unchecked")
    Class<TestCase> testClass = (Class<TestCase>)clazz;
    junit.textui.TestRunner.run(testClass);
  }
}
