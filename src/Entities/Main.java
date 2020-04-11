package Entities;

import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Book libro1 = new Book (0, "La vaca loca");
        Book libro2 = new Book (1, "El viejo y el mar");
        Book libro3 = new Book (2, "Tu vieja tambien");
        Book libro4 = new Book (3, "Harry el sucio Potter");
        Book libro5 = new Book (4, "Aca no sabia que poner");

        Library biblioteca = new Library();

        biblioteca.getBooks().put(libro1.getIdBook(),libro1);
        biblioteca.getBooks().put(libro2.getIdBook(),libro2);
        biblioteca.getBooks().put(libro3.getIdBook(),libro3);
        biblioteca.getBooks().put(libro4.getIdBook(),libro4);
        biblioteca.getBooks().put(libro5.getIdBook(),libro5);

        Partner socio1 = new Partner(biblioteca, 1);
        Partner socio2 = new Partner(biblioteca, 2);
        Partner socio3 = new Partner(biblioteca, 3);
        Partner socio4 = new Partner(biblioteca, 4);
        Partner socio5 = new Partner(biblioteca, 5);
        Partner socio6 = new Partner(biblioteca, 6);
        Partner socio7 = new Partner(biblioteca, 7);
        Partner socio8 = new Partner(biblioteca, 8);
        Partner socio9 = new Partner(biblioteca, 9);
        Partner socio10 = new Partner(biblioteca, 10);

        socio1.start();
        socio2.start();
        socio3.start();
        socio4.start();
        socio5.start();
        socio6.start();
        socio7.start();
        socio8.start();
        socio9.start();
        socio10.start();
    }
}