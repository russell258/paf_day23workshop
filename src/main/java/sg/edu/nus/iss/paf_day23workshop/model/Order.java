package sg.edu.nus.iss.paf_day23workshop.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private int id;
    private Date orderDate;
    private int customerId;
    private Double totalPrice;
    private Double costPrice;
    
}
