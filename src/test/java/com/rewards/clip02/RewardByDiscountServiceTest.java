package com.rewards.clip02;

import com.rewards.product.Product;
import com.rewards.reward.RewardByDiscountService;
import com.rewards.reward.RewardInformation;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RewardByDiscountServiceTest {
    @Test
    void setNeededPoints() {
        RewardByDiscountService reward = new RewardByDiscountService();
        reward.setNeededPoints(100);

        assertEquals(100, reward.getNeededPoints());

    }

   @Test
    void setPercentageForPoints(){
        RewardByDiscountService reward = new RewardByDiscountService();
        reward.setPercentage(0.1);

        assertEquals(0.1, reward.getPercentage());
   }
}
