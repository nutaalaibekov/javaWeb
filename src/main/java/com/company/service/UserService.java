package com.company.service;

import com.company.model.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Path("/users")
public class UserService {

    @Path("/{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getUser( @PathParam("id") Integer id) {
        User user1 = new User();
        user1.setId(id);
        user1.setUsername("userName");
        user1.setPassword("password");
        user1.setCreatedDate(new Date());
        return Response.ok().entity(user1).build();
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getUsers() {
        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setId(1);
        user1.setUsername("userName");
        user1.setPassword("password");
        user1.setCreatedDate(new Date());
        users.add(user1);

        User user2 = new User();
        user2.setId(1);
        user2.setUsername("userName");
        user2.setPassword("password");
        user2.setCreatedDate(new Date());
        users.add(user2);

        return Response.ok().entity(users).build();
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response createUser(User user) {

        System.out.println(user);

        return Response.ok().build();
    }
}
