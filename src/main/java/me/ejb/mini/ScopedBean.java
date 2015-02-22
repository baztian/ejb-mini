
package me.ejb.mini;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class ScopedBean {

    private int count;


    public ScopedBean increment() {
        count++;
        return this;
    }


    public int getCount() {
        return count;
    }
}
