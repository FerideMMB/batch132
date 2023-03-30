package practices.practice06;

public class Q03 {
    //Type code to add books to library with its info (bookName,authorName, pageNumber), then create a method to show
    //information of the book.
    String bookName;
    String authorName;
    int numOfPage;
     static int numOfBooks;
     String bookID;

    public static void main(String[] args) {
        Q03 book1=new Q03("Crime and Punishment", "Dostoyevski",650);
        //Book Name: Crime and PunishmentAuthor Name: DostoyevskiNumber Of Page650Book ID: Cr1
        Q03 book2 = new Q03 ( "Thousand Shiny Suns","Khaled Houseyni",276);
        //Book Name: Thousand Shiny SunsAuthor Name: Khaled HouseyniNumber Of Page276Book ID: Th2
        Q03 book3=new Q03 ("A wild sheep chase","Murakami",756);
        //Book Name: A wild sheep chaseAuthor Name: MurakamiNumber Of Page756Book ID: A 3

        book1.display();
        book2.display();
        book3.display();

    }
    Q03(String bookName,String authorName, int numOfPage){
      this.bookName=bookName;
      this.authorName=authorName;
      this.numOfPage=numOfPage;
      numOfBooks++;
     bookID= bookName.substring(0,2)+numOfBooks;
    }
    public void display(){
        System.out.println("Book Name: "+ bookName+ "Author Name: "+ authorName+ "Number Of Page"+numOfPage+
                "Book ID: "+ bookID);
    }

}
