class SimpleLoop
{
   public static int sum(int low, int high)
   {
      /* TO DO:  Return the sum of the integers between
         low and high (inclusive).  Yes, this can be
         done without a loop, but the point is to
         practice the syntax for a loop.
      */
      int newval = 0;
      for (int v = low; v < high+1; v++){
         newval = newval + v;
      }

      return newval;
   }
}
