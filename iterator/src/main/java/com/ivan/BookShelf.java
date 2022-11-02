package com.ivan;

public class BookShelf implements Aggregate{

    private Book[] books;
    private int last = 0;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    public void appendBook(Book book) {
        books[last] = book;
        last++;
    }

    public Book getBook(int idx) {
        if (idx >= last) {
            return null;
        }
        return books[idx];
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
