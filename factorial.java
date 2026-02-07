class fact {
   fact() {
   }

   public static void main(String[] var0) {
      byte var1 = 6;
      int var2 = 1;

      for(int var3 = 1; var3 <= var1; ++var3) {
         var2 *= var3;
      }

      System.out.print("factorial of 6 is :" + var2);
   }
}
