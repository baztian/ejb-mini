package me.ejb.mini;

import javax.ejb.Stateless;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Stateless
@Path("mytrigger")
public class MyTriggerResource {

  @GET
  public JsonObject doit() throws Exception {
    return Json.createObjectBuilder().add("value", 42).build();
  }

}
