package Ass13aug;

/*4. Create Class Laptop which has variables noOfUSBPort, processorSpeed of
type int. Create getter, setter methods for the variables. In main method,1>create Laptop object 
2> set values of variables noOfUSBPort,processorSpeed using setter methods. 
3> print variables noOfUSBPort,processorSpeed using getter methods.*/

import java.util.Scanner;

public class Laptop 
{
   private int noOfUSBPort;
   private int processorSpeed;
   public int getNoOfUSBPort()
   {
       return noOfUSBPort;
   }
   public void setNoOfUSBPort(int noOfUSBPort) 
   {
       this.noOfUSBPort = noOfUSBPort;
   }
   public int getProcessorSpeed() 
   {
       return processorSpeed;
   }
   public void setProcessorSpeed(int processorSpeed) 
   {
       this.processorSpeed = processorSpeed;
   }
   public static void main(String[] args) 
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter no of USB port: ");
       int noOfUSBPort=sc.nextInt();
       System.out.println("Enter processorSpeed: ");
       int processorSpeed=sc.nextInt();

       Laptop l=new Laptop();
       l.setNoOfUSBPort(noOfUSBPort);
       l.setProcessorSpeed(processorSpeed);
        System.out.println("USB port: "+noOfUSBPort);
        System.out.println("Processor Speed: "+processorSpeed);
   }
}
