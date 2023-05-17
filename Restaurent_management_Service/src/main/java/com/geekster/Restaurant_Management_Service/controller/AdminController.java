package com.geekster.Restaurant_Management_Service.controller;

import com.geekster.Restaurant_Management_Service.model.Admin;
import com.geekster.Restaurant_Management_Service.model.OrderFood;
import com.geekster.Restaurant_Management_Service.model.OrderStatus;
import com.geekster.Restaurant_Management_Service.repository.IOrderRepository;
import com.geekster.Restaurant_Management_Service.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    @Autowired
    OrderController orderController;

    @Autowired
    IOrderRepository iOrderRepository;

    @PostMapping
    public void addAdmin(@RequestBody Admin admin){
        adminService.addAdmin(admin);
    }

    @PutMapping("/orderID/{id}/status/{orderstatus}")
    public String changeOrderStatus(@PathVariable Integer id,@PathVariable OrderStatus orderstatus)
    {
        OrderFood order=orderController.getOrderDetails(id).get();

        if(order!=null)
        {
            order.setStatus(orderstatus);
            iOrderRepository.save(order);
            return "status changed succesfully";
        }

        return "something is wrong try again";

    }
}
