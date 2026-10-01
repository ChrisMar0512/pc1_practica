package org.example.pc1_practica.model;
@Entity
@Getter
@Setter
@table(name = "users")
public class User {

    @Id @Generated(strategy = Generationtype. identity)
    private long id;
    @Column(unique=true, nullable=false)
    private String username;
    @Column(unique=true, nullable=false)
    private String email;
    @Min 8 @Column(nullable=false)
    @Column(nullable=false)
    private String password;
    @Column(unique=true, nullable=false)
    private String Role;
}
