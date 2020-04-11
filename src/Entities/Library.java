package Entities;

import java.util.HashMap;

public class Library {

    //region Propierties
    public HashMap<Integer,Book> Books;
    //endregion

    //region Constructor
    public Library(){
        this.Books = new HashMap<Integer,Book>();
    }
    public Library(HashMap<Integer,Book> books){
        this.Books = books;
    }

    //endregion

    //region Methods

    public HashMap<Integer, Book> getBooks() {return Books;}

    public void AddBook(Book book){
        if(!this.Books.containsValue(book)){
            int a  = this.Books.size();
            a += a+1;
            this.Books.put(a,book);
        }
    }

    public void DeleteBook(int key,Book book){
        if(key != 0 && book != null){
            this.Books.remove(key,book);
        }
    }
    public synchronized Book GiveBack (int idBook){
        while (this.Books.get(idBook)== null)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {}
        }
        Book aux = Books.get(idBook);
        if (aux!=null){
            Books.remove(idBook);
            return aux;
        }else{
            return null;
        }
    }


    //endregion
}
