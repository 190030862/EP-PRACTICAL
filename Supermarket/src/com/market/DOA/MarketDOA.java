package com.market.DOA;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.Scanner;
import com.market.Bean.MarketBean;
import com.market.Connections.DBUtil;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

public class MarketDOA {
	static Scanner s=new Scanner(System.in);
	public int MarketInsert(MarketBean market) throws ClassNotFoundException, SQLException{
	Connection con = DBUtil.DBConnection();
 	   PreparedStatement ps = con.prepareStatement("Insert into market value(?,?,?)");
 	   ps.setInt(1, market.getItemid());
	   ps.setString(2, market.getItemname());
	   ps.setInt(3, market.getItemcost());
	   int i=ps.executeUpdate();
	   System.out.println(i+"records inserted");
	   con.close();
	   return i; 
	}
	 public void  MarketDisplay() throws ClassNotFoundException, SQLException 
     {
	   System.out.println("ITEMS LIST");
  	   Connection con = DBUtil.DBConnection();
  	   PreparedStatement ps=con.prepareStatement("Select *  from Market");
  	   ResultSet rs = ps.executeQuery();
  	   System.out.println("itemid\t\titemname\t\titemcost");
  	   while(rs.next())
  	   {
  		   System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getInt(3));
  	   }
  	   con.close();
     }
      public int TotalCost() throws ClassNotFoundException, SQLException
      {
    	  Connection con = DBUtil.DBConnection();
    	  PreparedStatement ps=con.prepareStatement("Select sum(itemcost)from market");
    	  ResultSet rs = ps.executeQuery();
    	  while(rs.next()) {
    		  System.out.println("Total cost of all items:- "+rs.getInt(1)+"Rupees");
    	  }
    	  int i=ps.executeUpdate();
    	  con.close();
    	  return i;
    	 }
      }

