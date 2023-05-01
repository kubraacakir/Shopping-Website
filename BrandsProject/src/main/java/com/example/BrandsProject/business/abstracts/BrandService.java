package com.example.BrandsProject.business.abstracts;

import com.example.BrandsProject.business.responses.GetAllBrandsResponse;
import com.example.BrandsProject.entities.concretes.Brand;

import java.util.List;
import java.util.Optional;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();
    void insert(Brand brand);
    void delete(int id);
    Optional<Brand> getById(Integer id);
}
