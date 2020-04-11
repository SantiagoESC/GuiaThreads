package Entities;

public class Book {

    //region Propierties
    public int idBook;

    public String title;
    //endregion

    //region Constructor

    public Book(){
        //hola
    }

    public Book(int idBook, String title){
        this.idBook = idBook;
        this.title  = title;
    }

    //endregion

    //region Getters && Setters

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //endregion

}
