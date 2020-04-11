package Entities;

import java.util.Random;

public class Partner extends Thread {

    //region Propierties

    public int IdPartner;

    public  Book Book;

    public Library Library;

    //endregion

    //region Constructor

    public  Partner(){
        this.Book = new Book();
    }
    public Partner(Library biblioteca, int idPartner) {
        this.Library    = biblioteca;
        this.IdPartner  = idPartner;
    }
    public Partner(int idPartner, Book book, Library library){
        this.IdPartner  = idPartner;
        this.Book       = book;
        this.Library    = library;
    }

    //endregion

    //region Getters && Setters
    public int getIdPartner() {
        return IdPartner;
    }

    public void setIdPartner(int idPartner) {
        IdPartner = idPartner;
    }

    public Book getBook() {
        return Book;
    }

    public void setBook(Book book) {
        Book = book;
    }

    public Entities.Library getLibrary() {
        return Library;
    }

    public void setLibrary(Entities.Library library) {
        Library = library;
    }

    //endregion

    //region Methods
    @Override
    public void run() {

        try
        {
            int val = 0;
            for (int i =0;i<10;i++)
            {
                val = this.random();

                this.setBook(this.Library.GiveBack(val));
                if (this.getBook()!=null){
                    System.out.println("El socio"+ getName() +"  saco el libro "+this.getBook().getTitle());
                }
                Partner.sleep((long)this.random());

                this.Library.AddBook(this.getBook());
                if(this.getBook()!=null){
                    System.out.println("El socio " + this.getName()+ " devolvio el libro "+this.getBook().getTitle());
                }
                Partner.sleep((long)this.random());
            }
        }
        catch (InterruptedException e)
        {

        }
    }
    public int random (){
        Random ran = new Random();

        int val = ran.nextInt()%20;

        if (val<0)
        {
            val = val* (-1);
        }
        return val;
    }

    //endregion
}
