public class EnumExample{

  enum Mobile{
    APPLE,SAMSUNG,HTC;
    //can add methods,constuctors and variables also in Enums
    //every enum extends a class called enum which has many
    // methods like name(),ordinal()
    //enums can implement some interface but cannot extend any other class
    //the main enum class by default extends Object class
  }

  public static void main(String[] args) {
    Mobile m = Mobile.SAMSUNG;

    switch (m) {
      case APPLE:
               System.out.println("Apple is best");
               break;
      case SAMSUNG:
               System.out.println("First copy");
               break;  }
   //to print the values or constant elements
   // of enum we can use method values()

      Mobile m1[] = Mobile.values();
      for (Mobile mobile : m1){
        System.out.println(mobile);
      }



  //to use ordinal method of enums
  System.out.println(Mobile.APPLE.ordinal());
  System.out.println(Mobile.SAMSUNG.ordinal());
  System.out.println(Mobile.HTC.ordinal());
  }
}
