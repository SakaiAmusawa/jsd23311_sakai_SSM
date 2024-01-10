package com.sakai.spring.dibase;

public class Book {
    private String bookName;
    private String bookAuthor;

    public Book() {
    }

    public Book(String bookName, String bookAuthor) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }

    /**
     * 获取
     *
     * @return bookName
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * 设置
     *
     * @param bookName 书籍的名字
     */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    /**
     * 获取
     *
     * @return bookAuthor
     */
    public String getBookAuthor() {
        return bookAuthor;
    }

    /**
     * 设置
     *
     * @param bookAuthor 书籍的作者
     */
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String toString() {
        return "Book{bookName = " + bookName + ", bookAuthor = " + bookAuthor + "}";
    }
}
