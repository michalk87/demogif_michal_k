package com.michal_k.demogif_michal_k.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//@AllArgsConstructor     // z automtu mamy konstruktor / potem go usuenliśmy
@Getter                 // Z automatu getter
@Setter                 // oraz setter
public class Gif {

    private String name;
    private String username;
    private Boolean favorite;
    private int categoryId;

    public Gif(String name, String username, Boolean favorite, int categoryId) {
        this.name = name;
        this.username = username;
        this.favorite = favorite;
        this.categoryId = categoryId;
    }
}

