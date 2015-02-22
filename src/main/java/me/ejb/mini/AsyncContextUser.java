
package me.ejb.mini;

import javax.ejb.Asynchronous;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class AsyncContextUser {

    @Inject
    private ScopedBean bean;


    @Asynchronous
    public void printCount() {
        try {
            Thread.sleep(4000);                 // 1000 milliseconds is one second.
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Async: " + bean.getCount());
    }
}
