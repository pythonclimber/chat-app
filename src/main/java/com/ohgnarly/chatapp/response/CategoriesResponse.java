package com.ohgnarly.chatapp.response;

import com.ohgnarly.chatapp.model.Category;

import java.util.List;

public class CategoriesResponse {
    private List<Category> categories;

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
