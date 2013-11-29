package webit.script.demo.mvc.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Zqq
 */
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;

    private String title;

    private String author;

    private Date publication;

    private int price;

    public Book() {
    }

    public Book(int id) {
        this.id = id;
    }

    public Book(int id, String title, String author, Date publication, int price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publication = publication;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublication() {
        return publication;
    }

    public void setPublication(Date publication) {
        this.publication = publication;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
