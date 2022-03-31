package org.example;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "booktb")
public class Books {
    private int bookid;
    private int bookprice;
    private String bookname;
    private String bookauthor;

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public int getBookprice() {
        return bookprice;
    }

    public void setBookprice(int bookprice) {
        this.bookprice = bookprice;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookid=" + bookid +
                ", bookprice=" + bookprice +
                ", bookname='" + bookname + '\'' +
                ", bookauthor='" + bookauthor + '\'' +
                '}';
    }
}
