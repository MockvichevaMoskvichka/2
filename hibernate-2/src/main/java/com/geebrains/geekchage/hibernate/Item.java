package com.geebrains.geekchage.hibernate;

import javax.persistence.*;
@Entity
@Table(name = "items")
class Item{



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private int price;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }



    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Item() {

    }

    public Item(String title, int price) {
        this.title = title;
        this.price = price;
    }
   @Override
    public String toString(){
        return String.format( "Items [id= %d, title = '%s', price=%d]", id, title, price);
    }
}








