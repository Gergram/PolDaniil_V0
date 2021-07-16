package Main.java;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;/*- уникальный идентификатор*/
    @ManyToOne
    private Category id_category;/*- идентификатор категории*/
    @Column(nullable = false,unique = true,length = 50)
    private String name ;/*- название*/
    @Column(nullable = false,length = 400)
    private String description; /*- описание*/
    @Column(nullable = false,length = 15)
    private Double price;  /*- стоимость*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Category getId_category() {
        return id_category;
    }

    public void setId_category(Category id_category) {
        this.id_category = id_category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
