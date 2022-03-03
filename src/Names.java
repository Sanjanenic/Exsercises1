public class Names {
    public static void main(String[] args) {

     String name ="Anna" ;
     String nachname ="Berger";
 System.out.println ("Diese Person heisst " + name +" "+ nachname + ".");

 //sad ovo radimo kao metodu

        String firstName ="Ada";
        String lastName = "Lovelace";
        System.out.println (firstName + " " + lastName );
        System.out.println ("method:" + makeFullName(firstName, lastName));
        System.out.println (makeFullName("Grace", "Hopper"));
    }

    //metoda ide ispod main metode ne unutra!!!!!

    public static String makeFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }
}
