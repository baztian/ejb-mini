
package me.ejb.mini;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Stateless
@Path ("mytrigger")
public class MyTriggerResource {

    @Inject
    ScopedBean bean;

    @Inject
    AsyncContextUser async;


    @GET
    public String doit() throws Exception {
        StringBuilder builder = new StringBuilder("Synchronous: ");
        builder.append(bean.getCount());
        builder.append(";");
        builder.append(bean.increment().getCount());
        async.printCount();
        builder.append(";");
        builder.append(bean.increment().getCount());
        return builder.toString();
    }

}
