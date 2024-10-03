public class Main {
   public static void main (String[] args) {
//       int liczbaC;
//       float liczbaZmiennoprzecinkowa = 2.0f;
//       double liczbaZmiennoprzecinkowa = 2.0;
//       boolean bool = false;
//       char znak = 85;
//       String ciagZnakow = "Cześć";
//       System.out.println(ciagZnakow);

       Student student = new Student(1, "Robert", "Kubica");
       Student student2 = new Student(2, "Andrzej", "Maj");
       System.out.println(student.name);
       System.out.println(student2.name);
       student2.przedstawSie();
   }

}
