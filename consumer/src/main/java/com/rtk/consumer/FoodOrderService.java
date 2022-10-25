package com.rtk.consumer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class FoodOrderService {

    private final FoodOrderRepository foodOrderRepository;
    private final ModelMapper modelMapper;
    public void saveFoodOrder(FoodOrderDTO foodOrderDTO) {
        FoodOrderEntity foodOrder = modelMapper.map(foodOrderDTO, FoodOrderEntity.class);
        FoodOrderEntity savedFoodOrder = foodOrderRepository.save(foodOrder);

        log.info("food order saved {}", savedFoodOrder);
    }
}
