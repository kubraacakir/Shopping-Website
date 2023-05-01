package com.example.BrandsProject.webApi.controller;

import com.example.BrandsProject.business.abstracts.BrandService;
import com.example.BrandsProject.business.responses.GetAllBrandsResponse;
import com.example.BrandsProject.entities.concretes.Brand;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/brands")
@CrossOrigin
@RequiredArgsConstructor

public class BrandsController {
    private final BrandService brandService;

    @GetMapping("/getall")
    public List<GetAllBrandsResponse> getAll(){
        return brandService.getAll();
    }

    @PostMapping("/insert")
    public void insert(@RequestBody Brand brand){
        this.brandService.insert(brand);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam int id){
        this.brandService.delete(id);
    }

    @GetMapping("/getbyid/")
    public Optional<Brand> getById(@RequestParam Integer id){
        return brandService.getById(id);
    }
}
