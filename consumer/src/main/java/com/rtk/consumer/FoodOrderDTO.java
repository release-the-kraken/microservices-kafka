package com.rtk.consumer;

import lombok.Data;
import lombok.Value;

@Data
@Value
public class FoodOrderDTO {
    String item;
    Double amount;
}
