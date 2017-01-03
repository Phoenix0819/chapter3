package org.smart4j.chapter3.controller;

import org.smart4j.chapter3.helper.DataBaseHelper;
import org.smart4j.chapter3.service.CustomerService;
import org.smart4j.framework.annotation.Inject;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

/**
 * Created by lenovo on 2017-01-03.
 */
public class test {
/*    @Inject
    private static CustomerService customerService;*/

    public static void main(String args[]) {
        System.out.println("Hello World!");
        Connection connection= DataBaseHelper.getConnection();
        System.out.println(connection.toString());

    }

}
