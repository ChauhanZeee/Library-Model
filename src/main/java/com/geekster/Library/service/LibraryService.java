package com.geekster.Library.service;

import com.geekster.Library.model.LibraryModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {
    private static List<LibraryModel> models = new ArrayList<>();

    static {
        models.add(new LibraryModel("shubham", "dehradun", "1234543", "a.c", 300));
        models.add(new LibraryModel("rohit", "selaqui", "65434576", "cooler", 200));
        models.add(new LibraryModel("kishor", "haridwar", "654345673", "cool", 656));
        models.add(new LibraryModel("poonam", "roorkee", "8998765", "extra quite",233));
        models.add(new LibraryModel("tanishka", "roorkee", "9876567565", "geaser", 656));
    }
    public void addLibrary(LibraryModel libraryModel){
        models.add(libraryModel);
    }
    public List<LibraryModel> showAll(){
        return models;
    }

    public LibraryModel  showLibraryByName(String name){
        for(int i=0; i<models.size(); i++){
            if(models.get(i).getName().equals(name)){
                return models.get(i);
            }
        }
        return null;
    }
    public void updateLibrary(String name, LibraryModel newLibraryModel){
        LibraryModel model = showLibraryByName(name);

        model.setName(newLibraryModel.getName());
        model.setAddress(newLibraryModel.getAddress());
        model.setNumber(newLibraryModel.getNumber());
        model.setFacilities(newLibraryModel.getFacilities());
        model.setMaxStrength(newLibraryModel.getMaxStrength());
    }
    public void deleteLibrary(String name, LibraryModel newLibraryModel){
        //LibraryModel model = showLibraryByName(name);

        for(int i=0; i<models.size(); i++){
            if(models.get(i).getName().equals(name)){
                models.remove(i);
            }
        }
    }
}
