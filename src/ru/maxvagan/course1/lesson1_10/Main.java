package ru.maxvagan.course1.lesson1_10;

public class Main {

    public static void main(String[] args) {
	    //Task 1
        clsAuthor firstAuthor = new clsAuthor("Agatha", "Christie");
        clsBook firstBook = new clsBook("Death On The Nile", 1937, firstAuthor);
        clsAuthor secondAuthor = new clsAuthor("Stanislaw", "Lem");
        clsBook secondBook = new clsBook("Undefeated", 1964, secondAuthor);
        System.out.println("====================== First Book ======================");
        System.out.println(firstBook);
        System.out.println("====================== Second Book ======================");
        System.out.println(secondBook);
        secondBook.setPublicYear(1990);
        System.out.println(secondBook);
        System.out.println("====================== Compare Books ======================");
        boolean isBooksEqual = firstBook.equals(secondBook);
        if (isBooksEqual)
            System.out.println("Книги одинаковы!");
        else
            System.out.println("Книги разные!");
    }
}
