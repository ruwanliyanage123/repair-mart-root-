package com.repair.mart.root.dao.api;

import com.repair.mart.root.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAOApi extends JpaRepository<User, Integer> {
}
