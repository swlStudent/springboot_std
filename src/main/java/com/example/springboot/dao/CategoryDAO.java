package com.example.springboot.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springboot.pojo.Category;

public interface CategoryDAO extends JpaRepository<Category,Integer>{
}
