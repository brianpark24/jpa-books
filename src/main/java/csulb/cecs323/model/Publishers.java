package csulb.cecs323.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;

@Entity
@NamedNativeQuery(
        name = "ReturnPublisher",
        query = "SELECT *" +
                "FROM PUBLISHERS" +
                "WHERE name = ?",
        resultClass = Publishers.class
)

@NamedNativeQuery(
        name = "ReturnAllPublishers",
        query = "SELECT *" +
                "FROM PUBLISHERS",
        resultClass = Publishers.class
)

public class Publishers {
    @Id
    @Column(nullable = false, length = 80)
    private String name;

    @Column(nullable = false, length = 80, unique = true)
    private String email;

    @Column(nullable = false, length = 24, unique = true)
    private String phone;

    public Publishers() {}

    public Publishers(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Publisher Name: " + this.getName() + " Email: " + this.getEmail() + " Phone: " + this.getPhone();
    }
}
