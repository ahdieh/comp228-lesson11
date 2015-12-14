package com.companyname.jdbc;

import java.security.PrivilegedExceptionAction;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;

import com.companyname.jdbc.beans.Movie;

public class Program {
	private static String QueryString = "Select * from movie_list limit 5,5"; 

	public static void main(String[] args){
		
		
		try(
				Connection connection = DBConfig.getConnection();
				//Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				PreparedStatement statement = connection.prepareStatement(QueryString);
				ResultSet resultSet = statement.executeQuery();
				)
		{

			System.out.println("Database is connected....");
			
			while(resultSet.next()){
				System.out.print("The movie: " + resultSet.getInt("id") + "  ");	
				System.out.print(resultSet.getString("name") + "  ");	
				System.out.println(resultSet.getString("genre"));	
			}
			
			resultSet.last();
			System.out.println("The number of rows is: " + resultSet.getRow());
			
			
		} catch (SQLException exception) {
			DBConfig.displayException(exception);
		}
		

		
		
	} 

}











