package management.system.contact.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "details")
public class Details {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "countryCode")
    private Integer countryCode;

    @Column(name = "phoneNumber", unique = true)
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    public Details(String name, String address, int countryCode, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.countryCode = countryCode;
        this.phoneNumber = phoneNumber;
        this.email = email;

    }

}
