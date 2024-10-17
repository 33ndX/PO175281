package zad2;

public class Book {
    String title;
    String author;
    int publicationYear;

   public Book(){
       title = "Rondo";
       author = "Kubica";
       publicationYear = 2022;
   }
   public Book(String title, String author, int publicationYear){
       this.title = title;
       this.author = author;
       this.publicationYear = publicationYear;
   }

}
