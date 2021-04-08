package com.za.springboot.demo.dao;

import com.za.springboot.demo.model.Role;
import com.za.springboot.demo.model.User;

import java.util.List;

public interface UserDao {

    public List<User> getAllUsers();

    public List<Role> getAllRoles();

    public void saveUser(User user);

    public void editUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);

    public User getUserByName(String username);

    Role getRoleByName(String name);
}

