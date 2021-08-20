package com.company.service;

import com.company.model.Category;
import com.company.model.Order;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Date;

@Path("/orders")
public class OrderService {

    @Path("/{orderId}")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public Response getOrders(@PathParam("orderId") Integer orderId)  {
        Order category1 = new Order();
        category1.setId(1);
        category1.setAmount("12.23");
        category1.setDescription("For a taxi");
        category1.setIs_expense(true);
        category1.setCategory_id(1);
        category1.setWallet_id(1);
        category1.setCreated_date(new Date());

        return Response.ok(category1.getId()).build();
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response createOrder(Order order) {

        System.out.println(order);

        return Response.ok().build();
    }
}
