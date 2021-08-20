package com.company.service;

import com.company.model.Order;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.*;

@Path("/report")
public class ReportService {

    @Path("/list")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getOrders(@QueryParam("userId") Integer userId,
                              @QueryParam("categoryId") Integer categoryId,
                              @QueryParam("startDate") String startDate,
                              @QueryParam("endDate") String endDate,
                              @QueryParam("isExpense") Boolean isExpense)  {

        List<Order> orders = new ArrayList<>();
        Order order1 = new Order();
        order1.setId(1);
        order1.setAmount("12.23");
        order1.setDescription("For a taxi");
        order1.setIs_expense(true);
        order1.setCategory_id(1);
        order1.setWallet_id(1);
        order1.setCreated_date(new Date());
        orders.add(order1);

        Order order2 = new Order();
        order2.setId(1);
        order2.setAmount("12.23");
        order2.setDescription("For a taxi");
        order2.setIs_expense(true);
        order2.setCategory_id(1);
        order2.setWallet_id(1);
        order2.setCreated_date(new Date());
        orders.add(order2);

        return Response.ok().entity(orders).build();
    }


    @Path("/groupcat")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getOrdersGrouped(@QueryParam("userId") Integer userId,
                              @QueryParam("categoryId") Integer categoryId,
                              @QueryParam("startDate") String startDate,
                              @QueryParam("endDate") String endDate,
                              @QueryParam("isExpense") Boolean isExpense)  {

        List<Order> orders = new ArrayList<>();
        Order order1 = new Order();
        order1.setId(1);
        order1.setAmount("12.23");
        order1.setDescription("For a taxi");
        order1.setIs_expense(true);
        order1.setCategory_id(1);
        order1.setWallet_id(1);
        order1.setCreated_date(new Date());
        orders.add(order1);

        Order order2 = new Order();
        order2.setId(1);
        order2.setAmount("12.23");
        order2.setDescription("For a taxi");
        order2.setIs_expense(true);
        order2.setCategory_id(1);
        order2.setWallet_id(1);
        order2.setCreated_date(new Date());
        orders.add(order2);

        Map<String, List<Order>> groupedOrders = new HashMap<>();
        groupedOrders.put("EDA", orders);
        groupedOrders.put("BUKMEIKER", orders);
        groupedOrders.put("Doroga", orders);

        return Response.ok().entity(groupedOrders).build();
    }
}
