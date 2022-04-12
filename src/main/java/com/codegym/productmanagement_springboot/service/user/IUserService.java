package com.codegym.productmanagement_springboot.service.user;

import com.codegym.productmanagement_springboot.model.User;
import com.codegym.productmanagement_springboot.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService extends IGeneralService<User>, UserDetailsService {
    User findByUsername(String username);
}
