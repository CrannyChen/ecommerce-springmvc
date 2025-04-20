package com.eeit1475th.eshop.cart.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderUpdateDTO {
	
    private String shippingStatus;
    
    private List<OrderItemUpdateDTO> items;

}
