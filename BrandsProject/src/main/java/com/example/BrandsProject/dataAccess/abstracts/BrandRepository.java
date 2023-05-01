package com.example.BrandsProject.dataAccess.abstracts;

import com.example.BrandsProject.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
}
