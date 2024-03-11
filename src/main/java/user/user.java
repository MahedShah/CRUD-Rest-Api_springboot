package user;

import jakarta.annotation.Generated;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;
    
    @Column(name = "email")
    private String email;

    //getters and setters

    public long getId() {
        return id;
    }
}
