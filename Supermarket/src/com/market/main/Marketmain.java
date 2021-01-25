package com.market.main;
import java.util.Scanner;
import java.sql.SQLException;
import com.market.DOA.MarketDOA;
import com.market.Bean.MarketBean;

public class Marketmain {

	public static void main(String[] args)  throws ClassNotFoundException, SQLException  {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        MarketBean mb=new MarketBean();
        MarketDOA mid=new MarketDOA();
        while(true) {
        	System.out.println("1.INSERTION");
        	System.out.println("2.DISPLAY");
        	System.out.println("3.TOTAL COST");
        	System.out.println("4. EXIT");
        	System.out.println("Enter choice:");
        	int choice=s.nextInt();
        	switch(choice) {
        	case 1:
        		System.out.println("Enter item details as itemid, itemname, cost");
        		int num=s.nextInt();
        		String name=s.next();
        		int cost=s.nextInt();
        		mb.setItemid(num);
        		mb.setItemname(name);
        		mb.setItemcost(cost);
        		int result_insertion=mid.MarketInsert(mb);
        		if(result_insertion>0)
        		{
        			System.out.println("insertion successful");
        		}
        		else
        		{
        			System.out.println("insertion failed");
        		}
        		break;
        	case 2:
        		mid.MarketDisplay();
        		break;
        	case 3:
        		int total=mid.TotalCost();
        		if(total>0)
        		{
        			System.out.println("Total cost is displayed");
        		}
        		else
        		{
        			System.out.println("totalcost isnot displayed");
        		}
        		break;
        	case 4:
        		System.out.println("visit again");
            default:
            	System.out.println("please enter a valid choice");
        	}
        	
        }

}
}
