package com.example.project.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "TT_ORDER")
@NamedQueries({
        @NamedQuery(name = "Order.findAllOrders", query = "SELECT o FROM Order o"),
        @NamedQuery(name = "Order.findOrdersBetweenDate", query = "SELECT o FROM Order o WHERE o.order_created_date BETWEEN :startDate AND :endDate")
})
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_id;

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinTable(name = "TT_ORDER_PRODUCT_RELATED", joinColumns = @JoinColumn(name = "order_id"),
    inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<Product> productList = new ArrayList<>();
    /*
    * If there is  1-n and 1-n relation, this is ntoN relation. it means manyToMany.
    * If there is 1-1 and 1-n relation between 2 tables, this is 1toN relation. it means onetoMany.
    * If there is 1-1 and 1-1 relation between 2 tables, this is 1to1 relation. it means onetoONE.
    *
     */
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Temporal(TemporalType.DATE)
    private Date order_created_date;

    public Order(){}

    public Order(List<Product> productList, User user, Date order_created_date) {
        this.productList = productList;
        this.user = user;
        this.order_created_date = order_created_date;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getOrder_created_date() {
        return order_created_date;
    }

    public void setOrder_created_date(Date order_created_date) {
        this.order_created_date = order_created_date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
                ", productList=" + productList +
                ", user=" + user +
                ", order_created_date=" + order_created_date +
                '}';
    }
}
