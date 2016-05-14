package test;

import base.CommonAPI;
import org.junit.Test;

/**
 * Created by Syeda on 5/14/2016.
 */
public class FBwithFF extends CommonAPI {
    @Test
    public void use_id_attributes () throws InterruptedException{
        typeByID("email","adhora_hossen@yahoo.com");
        typeByID("pass","01912058756");
        System.out.println("Login Successfully");
        clickByCss("#loginbutton");
        Thread.sleep(2000);
        //System.out.println("================================");
        clickByID("userNavigationLabel");
        Thread.sleep(5000);
        clickByID("Log Out");
        Thread.sleep(5000);
        System.out.println("Logged Out Successfully");

    }
}
