package Entities;

import java.util.ArrayList;
import java.util.Random;

public class Donor extends Thread{

    //region Propierties
    public int IdDonor;
    public Book Book;
    public ArrayList<Book> Library;

    //endregion

    //region Constructor

    public Donor(){
        this.Library = new ArrayList<Book>();
    }

    public Donor(int idDonor, Book book, ArrayList<Book> library){
        this.IdDonor    = idDonor;
        this.Book       = book;
        this.Library    =library;
    }

    //endregion

    //region Getters && Setters
    public int getIdDonor() {
        return IdDonor;
    }

    public void setIdDonor(int idDonor) {
        IdDonor = idDonor;
    }

    public Entities.Book getBook() {
        return Book;
    }

    public void setBook(Entities.Book book) {
        Book = book;
    }

    public ArrayList<Entities.Book> getLibrary() {
        return Library;
    }

    public void setLibrary(ArrayList<Entities.Book> library) {
        Library = library;
    }
    //endregion

    //region Methods

    @Override
    public void run() {
        try
        {
            int i=0;
            while(!this.Library.isEmpty())
            {
                //agregar
               // this.Library.donar(libros.get(0));
                System.out.println("\nEl donador " + this.getId()+ " dono el libro "+this.Library.get(i).getIdBook()+" id: "+ this.Library.get(i).getTitle() + "\n");
                Library.remove(0);
                Donor.sleep((long)random());
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
