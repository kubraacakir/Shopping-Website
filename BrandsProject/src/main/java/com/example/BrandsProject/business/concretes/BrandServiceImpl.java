package com.example.BrandsProject.business.concretes;

import com.example.BrandsProject.business.abstracts.BrandService;
import com.example.BrandsProject.business.responses.GetAllBrandsResponse;
import com.example.BrandsProject.dataAccess.abstracts.BrandRepository;
import com.example.BrandsProject.entities.concretes.Brand;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BrandServiceImpl implements BrandService {
    private final BrandRepository brandRepository;

    @Override
    public List<GetAllBrandsResponse> getAll() {
        List<Brand> brands = brandRepository.findAll();
        List<GetAllBrandsResponse> brandsResponses = new ArrayList<GetAllBrandsResponse>();
        for (Brand brand : brands){
            GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
            responseItem.setId(brand.getId());
            responseItem.setName(brand.getName());
            responseItem.setPrice(brand.getPrice());
            brandsResponses.add(responseItem);
        }
        return brandsResponses;
    }

    @Override
    public void insert(Brand brand) {
        brandRepository.save(brand);
    }

    @Override
    public void delete(int id) {
        brandRepository.deleteById(id);
    }

    @Override
    public Optional<Brand> getById(Integer id) {
        return brandRepository.findById(id);
    }
}
