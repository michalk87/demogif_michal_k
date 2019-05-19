package com.michal_k.demogif_michal_k.Model.repositiry;

import com.michal_k.demogif_michal_k.Model.Gif;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class GifRepository {

    private static List<Gif> ALL_GIFS = Arrays.asList(

            new Gif("Android-explosion", "mols", true),
            new Gif("ben-and-mike", "mika", false),
            new Gif("book-dominos", "mem", true),
            new Gif("compiler-bot", "bot", false),
            new Gif("cowboy-coder", "code", true),
            new Gif("infinite-andrew", "andrew", false)
    );

    public List<Gif> getGifs() {
        return ALL_GIFS;
    }

    public String getGifNames() {
        String result = "";
        for (Gif allGif : ALL_GIFS) {
            result += allGif.getName();
        }
        return result;
    }

    public List<Gif> getFavoritesGifs() {

        List<Gif> favoriteGifs = new ArrayList<>();
        for (Gif gif : ALL_GIFS) {
            if (gif.getFavorite() == true) {
                favoriteGifs.add(gif);
            }
        }
        return favoriteGifs;
    }
    
}
