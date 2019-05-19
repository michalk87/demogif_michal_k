package com.michal_k.demogif_michal_k.controller;

import com.michal_k.demogif_michal_k.Model.Gif;
import com.michal_k.demogif_michal_k.Model.repositiry.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class GifController {

    @Autowired
    GifRepository gifRepository;

    @RequestMapping("/showgifsInBrowser")

    public String showgifsInBrowser() {

        return gifRepository.getGifNames();
    }

    @RequestMapping("/")

    public String listGifs(ModelMap modelMap) {
        // 1. Wyciąganie gifów
        List<Gif> gifList = gifRepository.getGifs();

        // 2. Przekazanie gifa do view
        modelMap.put("gifs", gifList);

        // 3. Zwracanie widoku

        return "home";    //  Spring wymyślił że jego widok będziemy
        //   zwracali po prostu po jego nazwie czyli home.
    }

    @RequestMapping("/favorites")
    public String gitFavorites(ModelMap modelMap) {

        // Analogiczni: wg schematu:
        // 1. Pobieramy listę gifów (tylko ulubionych)
        List<Gif> favoriteGifs = gifRepository.getFavoritesGifs();

        // 2. Przekazanie gifów do widoku

        modelMap.put("gifs", favoriteGifs);

        // Informacja: widok nazywa się favorites.html

        return "favorites";
    }
}
