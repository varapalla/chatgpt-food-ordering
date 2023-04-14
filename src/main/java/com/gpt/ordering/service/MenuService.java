package com.gpt.ordering.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gpt.ordering.model.MenuItem;
import com.gpt.ordering.repository.MenuRepository;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    public List<MenuItem> getAllMenuItems() {
        return menuRepository.findAll();
    }

    public Optional<MenuItem> getMenuItemById(Long id) {
        return menuRepository.findById(id);
    }

    public MenuItem addMenuItem(MenuItem menuItem) {
        return menuRepository.save(menuItem);
    }

    public MenuItem updateMenuItem(MenuItem menuItem) {
        return menuRepository.save(menuItem);
    }

    public void deleteMenuItem(Long id) {
        menuRepository.deleteById(id);
    }

}
