package com.company.service;

import com.company.model.Category;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Path("/categories")
public class CategoryService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCategories(Integer userId) {
        List<Category> categories = new ArrayList<>();
        Category category1 = new Category();
        category1.setId(1);
        category1.setActive(true);
        category1.setName("EDA");
        category1.setUserId(1);
        category1.setParentId(1);
        category1.setCreatedDate(new Date());
        categories.add(category1);

        Category category2 = new Category();
        category2.setId(1);
        category2.setActive(true);
        category2.setName("EDA");
        category2.setUserId(1);
        category2.setParentId(1);
        category2.setCreatedDate(new Date());
        categories.add(category2);

        return Response.ok().entity(categories).build();
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response createCategory(Category category) {
        System.out.println(category);
        return Response.ok().build();
    }

}
