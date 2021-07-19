package Main.java;

import javax.persistence.*;

@Entity
public class OrderProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; /*- уникальный идентификатор*/
    @ManyToOne
    private Order id_order;/*- идентификатор заказа*/
    @ManyToOne
    private Product id_product;/*- идентификатор товара*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order getId_order() {
        return id_order;
    }

    public void setId_order(Order id_order) {
        this.id_order = id_order;
    }

    public Product getId_product() {
        return id_product;
    }

    public void setId_product(Product id_product) {
        this.id_product = id_product;
    }

    public Integer getCountProduct() {
        return countProduct;
    }

    public void setCountProduct(Integer countProduct) {
        this.countProduct = countProduct;
    }

    @Column (nullable = false)
    private Integer countProduct; /*- кол-во товара в заказе*/

}
