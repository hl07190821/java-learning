package pack1.pack2;

/**
 * ClassName: Books
 * Package: pack1.pack2
 * Description:
 *
 * @Author Soon
 * @Create 2025/12/15 20:09
 * @Version 1.0
 */
public class Books {
    private String bookName;
    private String author;
    private String publisher;
    private int price;

    public void setBookName(String str){
        bookName = str;
    }
    public void setAuthor(String str){
        author = str;
    }
    public void setPublisher(String str){
        publisher = str;
    }
    public void setPrice(int num){
        price = num;
    }

    public String getBookName(){
        return bookName;
    }
    public String getAuthor(){
        return author;
    }
    public String getPublisher(){
        return publisher;
    }
    public int getPrice(){
        return price;
    }

}
