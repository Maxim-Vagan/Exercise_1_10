package ru.maxvagan.course1.lesson1_10;

import java.util.Objects;

public class clsBook {
    private String bookLabel;
    private int publicYear;
    private clsAuthor author;

    public clsBook(String inpLabel, int inpPublicYear, clsAuthor inpAuthor) {
        bookLabel = inpLabel;
        publicYear = inpPublicYear;
        author = inpAuthor;
    }

    public String getBookLabel() {
        return bookLabel;
    }

    public void setBookLabel(String bookLabel) {
        this.bookLabel = bookLabel;
    }

    public int getPublicYear() {
        return publicYear;
    }

    public void setPublicYear(int publicYear) {
        this.publicYear = publicYear;
    }

    public clsAuthor getAuthor() {
        return author;
    }

    public void setAuthor(clsAuthor author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof clsBook)) return false;
        clsBook aBook = (clsBook) o;
        return getPublicYear() == aBook.getPublicYear() && getBookLabel().equals(aBook.getBookLabel()) && getAuthor().equals(aBook.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookLabel(), getPublicYear(), getAuthor());
    }

    @Override
    public String toString() {
        return "clsBook{" +
                "bookLabel=\"" + bookLabel + "\"" +
                ", publicYear=" + publicYear +
                ", author=" + author.toString() +
                '}';
    }
}
