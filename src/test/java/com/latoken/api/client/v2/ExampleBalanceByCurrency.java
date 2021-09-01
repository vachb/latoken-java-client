package com.latoken.api.client.v2;

import com.latoken.api.client.v2.response.Balance;

import java.util.UUID;

public class ExampleBalanceByCurrency {
   public static void main(String[] args) throws Exception {

      UUID uuid = UUID.fromString("92151d82-df98-4d88-9a4d-284fa9eca49f");

      Balance balance = Shared.restV2()
         .getBalances(uuid, Balance.Type.ACCOUNT_TYPE_SPOT)
         .get();

      System.out.println(balance);
   }
}
