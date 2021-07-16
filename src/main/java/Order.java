import javax.persistence.*;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;/*- уникальный идентификатор*/
    @ManyToOne
    private Order id_client;/*- идентификатор клиента*/
    @Column(nullable = false)
    private Integer status; /*- статус заказа*/
    @Column(nullable = false)
    private Double total; /*- сумма по заказу*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order getId_client() {
        return id_client;
    }

    public void setId_client(Order id_client) {
        this.id_client = id_client;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }


}