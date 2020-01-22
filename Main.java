package onetoOne;

import org.hibernate.*;  

import org.hibernate.boot.Metadata;  

import org.hibernate.boot.MetadataSources;  

import org.hibernate.boot.registry.StandardServiceRegistry;  

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  



public class Main {

 public static void main(String[] args) {

  StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  

     Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  

       

     SessionFactory factory=meta.getSessionFactoryBuilder().build();  

     Session session=factory.openSession();  

       

     Transaction t=session.beginTransaction();   

       

     Employ e1=new Employ(); 

     

     

     

         

     Address address1 = new Address("Satyanarayanapuram", "AndhraPradesh", "AP", "520011");

  Address address2 = new Address("SNPuram", "AndhraPradesh", "AnP", "520005");

  Employ emp1 = new Employ("HariPriya", address1);

  Employ emp2 = new Employ("Kishore", address2);

  session.save(emp1);

  session.save(emp2);

  t.commit();

     session.close();    

     System.out.println("success");    

 }

}