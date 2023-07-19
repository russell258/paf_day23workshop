package sg.edu.nus.iss.paf_day23workshop.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.paf_day23workshop.model.Order;

@Repository
public class OrderRepository {
    
    @Autowired
    JdbcTemplate jdbc;

    private final String querySQL = "select orders.id, orders.order_date, orders.customer_id, (order_details.quantity*order_details.unit_price*(1-order_details.discount)) as total_price, (order_details.quantity*products.standard_cost) as cost_price from orders inner join order_details on orders.id = order_details.order_id inner join products on order_details.product_id = products.id where orders.id = ?";

    public List<Order> findAll(int orderId){
       return jdbc.query(querySQL,BeanPropertyRowMapper.newInstance(Order.class),orderId); 
    }


}
