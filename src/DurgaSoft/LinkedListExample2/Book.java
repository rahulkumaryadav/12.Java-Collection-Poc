package DurgaSoft.LinkedListExample2;

import java.util.LinkedList;

public class Book {
    int id;
    String name,author,publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

 class LinkedListExample{
     public static void main(String[] args) {
         LinkedList<Book> linkedList=new LinkedList<Book>();
         Book b1=new Book(100,"rahul","rahul yadav","rahul yadav",6);
         Book b2=new Book(101,"bhavik","Bhavik makwana","Bhavik makwana",6);
         linkedList.add(b1);
         linkedList.add(b2);

         //Traversing list
         for (Book b:linkedList){
             System.out.println(b.id+"--"+b.name);
             System.out.println("---------------");
         }
     }
}
