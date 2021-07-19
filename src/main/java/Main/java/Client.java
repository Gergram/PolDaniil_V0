package Main.java;

import javax.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, unique = true)
    private Integer ex_id;/*id*/
    @Column(nullable = false,length = 255)
    private String full_name;/*fio*/
    @Column(nullable = false, unique = true,length = 15)
    private Integer phone_number;
    @Column(nullable = false,length = 400)
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getEx_id() {
        return ex_id;
    }

    public void setEx_id(Integer ex_id) {
        this.ex_id = ex_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public Integer getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(Integer phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}