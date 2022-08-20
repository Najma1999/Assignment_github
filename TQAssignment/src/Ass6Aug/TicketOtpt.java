package Ass6Aug;

import java.util.Scanner;

public class TicketOtpt {
	
	public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Ticket t=new Ticket();
        System.out.println("Enter no of bookings:");
        int book=sc.nextInt();
        System.out.println("Enter the available tickets:");
        int available=sc.nextInt();
        t.setAvailableTickets(available);
        System.out.println("Enter the ticketid:");
        int id=sc.nextInt();
        t.setTicketid(id);
        System.out.println("Enter ticket price:");
        int price=sc.nextInt();
        t.setPrice(price);
        System.out.println("Enter the no of tickets:");
        int tickets=sc.nextInt();
        if(tickets<=available)
        System.out.println("Available tickets: "+t.getAvailableTickets());
        int amount=t.calculateTicketCost(tickets);
        if(amount==-1)
        System.out.println("Tickets not sufficient / available");
        else
        {
            System.out.println("Total amount:"+amount);
            System.out.println("Available ticket after booking:"+t.getAvailableTickets());
	    }

	}}
