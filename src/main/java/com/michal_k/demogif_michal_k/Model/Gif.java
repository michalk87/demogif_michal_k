package com.michal_k.demogif_michal_k.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor     // z automtu mamy konstruktor
@Getter                 // Z automatu getter
@Setter                 // oraz setter
public class Gif {

    private String name;
    private String username;
    private Boolean favorite;

}
