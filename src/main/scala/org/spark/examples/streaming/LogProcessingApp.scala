/*
 * Copyright (c) 2015 Daniel Higuero.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.spark.examples.streaming

import org.apache.log4j.{Level, Logger}

/**
 * Code here the solution for the proposed exercises.
 */
object LogProcessingApp {

  /**
   * Field separator.
   */
  val Separator = ";";

  /**
   * Threshold that determines when a number of failed auth entries is considered an attack.
   */
  val ThresholdAuth = 1;

  /**
   * Threshold that determines when a number of failed web access entries is considered an attack.
   */
  val ThresholdWeb = 1;

  def main(args : Array[String]) {

    //Suppress Spark output
    Logger.getLogger("org").setLevel(Level.ERROR)
    Logger.getLogger("akka").setLevel(Level.ERROR)

    println("Launching LogProcessingApp...")

    //Step 1 - Connect to the OS sockets.
    //Step 2 - Transform plain text into classes.
    //...

  }

}
