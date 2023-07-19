package sg.edu.nus.iss.paf_day23workshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.paf_day23workshop.model.Order;
import sg.edu.nus.iss.paf_day23workshop.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepo;


    public List<Order> findAllService (int orderId){
        return orderRepo.findAll(orderId);
    }
}
