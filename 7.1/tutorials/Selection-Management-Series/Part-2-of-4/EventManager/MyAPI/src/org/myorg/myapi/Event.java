package org.myorg.myapi;

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
   
   @Override
   public String toString() {
       return index + " - " + date;
   }
   
}