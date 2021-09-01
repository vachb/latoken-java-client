package com.latoken.api.client.v2;

import java.util.HashMap;
import java.util.UUID;

final class Shared {

   // just to have lazyness, in real use you won't create websocket client if you don't need it
   private static final HashMap<String, Object> cache = new HashMap<>();

   static AsyncRestV2Client restV2() {
      return (AsyncRestV2Client) cache.computeIfAbsent("restV2Client", s -> Latoken.asyncClientV2(
         "10f647c5-ccb8-4fbf-9a5f-bf9f78f6e4a2",
         "ODdiZGM5MzktMDdhZS00ZmY5LWE1ZTYtZDE2YzA1YjNhZGE1"
      ));
   }

   static WebsocketV2Client wsV2() {
      return (WebsocketV2Client) cache.computeIfAbsent("wsV2", s -> Latoken.websocketV2Client(
         "10f647c5-ccb8-4fbf-9a5f-bf9f78f6e4a2",
         "ODdiZGM5MzktMDdhZS00ZmY5LWE1ZTYtZDE2YzA1YjNhZGE1"
      ));
   }


   static UUID BTC = UUID.fromString("92151d82-df98-4d88-9a4d-284fa9eca49f");
   static UUID TUSD = UUID.fromString("211cec45-a160-4b69-9a7c-60ebc9d37a48");
   static UUID USDT = UUID.fromString("0c3a106d-bde3-4c13-a26e-3fd2394529e5");

   private Shared() {
   }
}
