package com.michal_k.demogif_michal_k.Model.repositiry;


import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepository {

    private static final List<Category> ALL_Categories = Arrays.asList(

            new Category(0,"Funny"),
            new Category(1, "sport"),
            new Category(2, "it")
    );


    public List<Category> getAllCategories() {
        return ALL_Categories;
    }

    public Category getCategoryById(int id){
        return ALL_Categories.get(id);
    }

}
