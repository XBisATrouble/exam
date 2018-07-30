package com.example.exam.bean;

/**
 * @author XBisA
 */
public class Pagination {
    private int page;
    private int pages;
    private int total;
    private int limit;
    private String self;
    private String prev;
    private String next;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }



    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }


    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getPrev() {
        return prev;
    }

    public void setPrev(String prev) {
        this.prev = prev;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }
}
