package com.michal_k.demogif_michal_k.controller;

import com.michal_k.demogif_michal_k.Model.Gif;
import com.michal_k.demogif_michal_k.Model.repositiry.Category;
import com.michal_k.demogif_michal_k.Model.repositiry.CategoryRepository;
import com.michal_k.demogif_michal_k.Model.repositiry.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {


    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    GifRepository gifRepository;

    @RequestMapping("/categories")
    public String gifCategories(ModelMap modelMap){
        List<Category> categoryList = categoryRepository.getAllCategories();
        // 2. Przekazanie obiektów do widoku
        modelMap.put("categories", categoryList);
        return "categories";

    }

    @RequestMapping("/category/{id}")
    public String gifsCategory(@PathVariable int id, ModelMap modelMap){


        // 1. Pobieranie gifów z id danej kategorii
        List<Gif> gifsByCategory = gifRepository.getGifsByCategoryId(id);

        // 2. Pobieranie kategorii po id

        Category category = categoryRepository.getCategoryById(id);

        modelMap.put("gifs", gifsByCategory);
        modelMap.put("category", category);


        return "category";
    }

}
