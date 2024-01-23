package com.kirusanthan.springbootcrudoperation.repository;

import com.kirusanthan.springbootcrudoperation.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends JpaRepository<Books,Integer > {


}
