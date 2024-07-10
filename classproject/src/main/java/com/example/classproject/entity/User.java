package com.example.classproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="tbl_user")
public class User {
    @Id
    @SequenceGenerator(name = "users_seq_gen", sequenceName = "users_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "users_seq_gen", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "name")
    private String Name;

    @Column(name="email")
    private String email;

    @Column(name = "contact No")
    private String contactno;

}
