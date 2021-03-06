package org.smart4j.chapter3.service;


import org.smart4j.chapter3.helper.DataBaseHelper;
import org.smart4j.chapter3.model.Customer;

import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2016-12-22.
 */
public class CustomerService {

    public List<Customer> getCustomerList (){
            String sql="select * from customer";
            return DataBaseHelper.queryEntityList(Customer.class,sql);

    }

    public  Customer getCustomer(long id){
        String sql="select * from customer where id="+id;
        return DataBaseHelper.queryEntity(Customer.class,sql);
    }

    public boolean createCustomer(Map<String,Object> fieldMap){
        return DataBaseHelper.insertEntity(Customer.class,fieldMap);
    }

    public boolean updateCustomer(long id,Map<String,Object> fieldMap){
        return DataBaseHelper.updateEntity(Customer.class,id,fieldMap);
    }

    public boolean deleteCustomer(long id){
        return DataBaseHelper.deleteEntity(Customer.class,id);
    }
}
