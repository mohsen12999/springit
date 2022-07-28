package com.mohsen.springit.repository;

import com.mohsen.springit.model.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link,Long> {

    Link findByTitle(String title);

}
