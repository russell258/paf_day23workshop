package sg.edu.nus.iss.paf_day23workshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sg.edu.nus.iss.paf_day23workshop.model.Order;
import sg.edu.nus.iss.paf_day23workshop.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderRestController {
    @Autowired
    OrderService oSvc;

    @GetMapping(path="/list")
    public ResponseEntity<?> fullOrderList(@RequestParam("orderId") int orderId){
        List<Order> fullOrders = oSvc.findAllService(orderId);

        return new ResponseEntity<>(fullOrders, HttpStatus.OK);
    }

}
