package com.geekster.Library.controller;

import com.geekster.Library.model.LibraryModel;
import com.geekster.Library.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library-model")
public class LibraryController {
    @Autowired
    private LibraryService libraryService;

@PostMapping("/add-library")
    public void addLibrary(@RequestBody LibraryModel libraryModel){
    libraryService.addLibrary(libraryModel);
    }

    @GetMapping("/show-all/libraries")
    public List<LibraryModel> showAll(){
    return libraryService.showAll();
    }

    @GetMapping("/show-library/by/name/{name}")
    public LibraryModel showLibraryByName(@PathVariable String name){
        return libraryService.showLibraryByName(name);
    }

    @PutMapping("/update-library/by/name/{name}")
    public void updateLibrary(@PathVariable String name, @RequestBody LibraryModel libraryModel){
    libraryService.updateLibrary(name, libraryModel);
    }

    @DeleteMapping("/delete-library.by/name/{name}")
    public void deleteLibrary(@PathVariable String name, @RequestBody LibraryModel libraryModel){
    libraryService.deleteLibrary(name, libraryModel);
    }
}
