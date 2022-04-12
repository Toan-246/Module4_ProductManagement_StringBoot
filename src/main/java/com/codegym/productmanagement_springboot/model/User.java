package com.codegym.productmanagement_springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    @ManyToMany (fetch = FetchType.EAGER)//Để load a các role để cho JWT check role, nếu để LAZY sẽ không có role để check
    @JoinTable(name = "user_role")
    private List<Role> roles;

}
