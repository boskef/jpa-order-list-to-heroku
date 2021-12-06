package com.example.project.model;



import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TT_PRODUCT")
@NamedQueries({
        @NamedQuery(name = "Product.findAllProducts", query = "SELECT p FROM Product p"),
        @NamedQuery(name = "Product.findProductByProductName", query = "SELECT p FROM Product p WHERE p.product_name = :productName"),
        @NamedQuery(name = "Product.findProductByLikeProductName", query = "SELECT p FROM Product p WHERE p.product_name LIKE :productName")
})
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int product_id;

    @Column(name = "product_name")
    private String product_name;

    private String product_price;

    @Temporal(TemporalType.DATE)
    private Date product_created_date;

    public Product(){
    }

    public Product(String product_name, String product_price, Date product_created_date) {
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_created_date = product_created_date;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_price() {
        return product_price;
    }

    public void setProduct_price(String product_price) {
        this.product_price = product_price;
    }

    public Date getProduct_created_date() {
        return product_created_date;
    }

    public void setProduct_created_date(Date product_created_date) {
        this.product_created_date = product_created_date;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", product_price='" + product_price + '\'' +
                ", product_created_date=" + product_created_date +
                '}';
    }
}
