package Main.java;

import javax.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column (nullable = false)
    private Integer Ex_id;/*id*/
    @Column (nullable = false)
    private String Full_name;/*fio*/
    @Column (nullable = false)
    private Integer phone_number;
    @Column (nullable = false)
    private String Address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getEx_id() {
        return Ex_id;
    }

    public void setEx_id(Integer ex_id) {
        Ex_id = ex_id;
    }

    public String getFull_name() {
        return Full_name;
    }

    public void setFull_name(String full_name) {
        Full_name = full_name;
    }

    public Integer getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(Integer phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
