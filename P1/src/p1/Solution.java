/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1;

/**
 *
 * @author Vin Sen
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int holder = prices[0], totalProfit = 0;
        
        if(prices.length > 0) {
            
            for (int i = 0; i < prices.length; i++) {
                if (i + 1 < prices.length) {
                    if (holder > prices[i]) {
                        holder = prices[i];
                    } else if (holder < prices[i] && prices[i] > prices[i+1]) {
                        totalProfit += (prices[i] - holder);
                        holder = prices[i+1];
                    }
                }else {
                    if (holder < prices[i]) {
                        totalProfit += (prices[i] - holder);
                    }
                }
            }
        }
        
        return totalProfit;
    }
}
