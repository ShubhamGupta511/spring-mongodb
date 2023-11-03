package com.example.springmongo4.demomongo4;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Book {
    private String name;
    private String authorName;

    private int cost;
    private int count;

    public Book(String name, String authorName, int cost, int count) {
        this.name = name;
        this.authorName = authorName;
        this.cost = cost;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Book() {
    }

    public Book(String name, String authorName, int cost) {
        this.name = name;
        this.authorName = authorName;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
