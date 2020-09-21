package cn.hp.springboot2.pojo;

public class bookInfo {
    private Integer bookid;
    private String bookname;
    private String password;
    private String price;
    private String title;
    private String note;
    private bookType type;

    public bookInfo() {
        super();
    }

    public bookInfo(Integer bookid, String bookname, String password, String price, String title, String note, bookType type) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.password = password;
        this.price = price;
        this.title = title;
        this.note = note;
        this.type = type;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public bookType getType() {
        return type;
    }

    public void setType(bookType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "bookInfo{" +
                "bookid=" + bookid +
                ", bookname='" + bookname + '\'' +
                ", password='" + password + '\'' +
                ", price='" + price + '\'' +
                ", title='" + title + '\'' +
                ", note='" + note + '\'' +
                ", type=" + type +
                '}';
    }
}
