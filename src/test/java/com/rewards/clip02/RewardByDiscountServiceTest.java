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
    RewardByDiscountService reward = new RewardByDiscountService();

    @Test
    void setNeededPoints() {

        reward.setNeededPoints(100);

        assertEquals(100, reward.getNeededPoints());

    }

   @Test
    void setPercentageForPoints(){
        reward.setPercentage(0.1);

        assertEquals(0.1, reward.getPercentage());
   }

   @Test
    void zeroCustomerPoints() {
        reward.setPercentage(0.1);
        reward.setNeededPoints(100);

        Product smallDecaf = new Product(1, "small decaf", 1.99);
        List<Product> order = Collections.singletonList(smallDecaf);

        RewardInformation info = reward.applyReward(order, 0);
   }
}
