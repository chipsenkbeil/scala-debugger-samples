package org.scaladebugger.samples

import org.scaladebugger.api.utils.JDITools

/**
 * Verifies that the Scala debugger library is usable by checking that the
 * underlying JDI library is available.
 */
object VerifyLibrary extends App {
  // Checks if the JDI is available in your runtime
  // classloader or by extracting it from tools.jar
  // found in JDK_HOME or JAVA_HOME
  println("JDI is available: " + JDITools.isJdiAvailable())

  // Loads the JDI from tools.jar and attempts to
  // add it to your system classloader
  println("Loaded JDI: " + JDITools.tryLoadJdi())
}
