/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenselectionsuite;

import java.util.Date;

public final class Event {

   private final Date date = new Date();
   private static int count = 0;
   private final int index;

   public Event() {
      index = count++;
   }

   public Date getDate() {
      return date;
   }

   public int getIndex() {
      return index;
   }

   public String toString() {
       return index + " - " + date;
   }

}