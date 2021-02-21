package com.src;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.context.annotation.Bean;



public class ApplicationConfig {
	
@Bean(name="cset")
	public Customer getCustomer()
{
	Customer c=new Customer();
	c.setCid("234");
	c.setCname("anuhya");
	c.setCmob(96598762);
	return c;
	}
@Bean(name="csetobj")
public Customer getCustomer1()
{
	Customer c=new Customer();
	c.setCid("235");
	c.setCname("priya");
	c.setCmob(94987322);
	Address ad=new Address(0, null);
	ad.setHno(1);
	ad.setCity("ATP");
	c.setAdd(ad);
	return c;
	}
@Bean(name="setlist")
public Customer getCustomer2()
{
	Customer c=new Customer();
	c.setCid("236");
	c.setCname("meghana");
	c.setCmob(987654322);
	List<Item> i1=new LinkedList();
	Item a1=new Item();
	a1.setItemId(1);
	a1.setItemName("oven");
	a1.setItemPrice(200);
	i1.add(a1);
	
	Item a2=new Item();
	a2.setItemId(1);
	a2.setItemName("oven");
	a2.setItemPrice(200);
	i1.add(a2);
	c.setItem(i1);
	return c;



}
@Bean(name="conslist")
public Customer getCustomer5()
{
	Customer c=new Customer();
	c.setCid("237");
	c.setCname("dharshini");
	c.setCmob(788765432);
	List<Item> a=new LinkedList();
	a.add(new Item(1,"mixy",50000));
	a.add(new Item(2,"Grinder",20000));
	c.setItem(a);
	return c;
	
}
@Bean(name="cons")
public Customer getCustomer3()
{
	return new Customer("238","dharshini",98765);	
}
@Bean(name="consobj")
public Customer getCustomer4()
{
	return new Customer("239","shivam",8765,new Address(193,"Atp"));	
}




}

