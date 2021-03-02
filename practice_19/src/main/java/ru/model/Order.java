package ru.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "orders1", schema = "public")
public class Order {
    @Id
    @Column(name = "order_date")
    private String orderDate;
    @Column(name = "item_name")
    private String itemName;

    @ManyToOne
    @JoinColumn(name="item_name", insertable = false, updatable = false)
    @JsonIgnore
    public Item item;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }



    public Order() {}

    public Order(String orderDate, String itemName) {
        this.orderDate = orderDate;
        this.itemName = itemName;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderDate='" + orderDate + '\'' +
                ", itemName='" + itemName + '\'' +
                '}';
    }
}
