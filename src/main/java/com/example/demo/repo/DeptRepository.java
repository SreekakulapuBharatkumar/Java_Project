package com.example.demo.repo;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Dto.Department;

@Repository
public interface DeptRepository extends JpaRepository<Department, Integer>{

	public Department findBydeptno(int id);

	
}
