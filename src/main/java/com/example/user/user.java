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
    
    public void setId(Long id){
        this.id = id;
    }

    public long getName() {
        return name;
        }
    
    public String setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    } 
    public void setEmail(String email){
     this.email = email;
    }
    }

