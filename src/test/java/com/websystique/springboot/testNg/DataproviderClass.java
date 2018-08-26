package com.websystique.springboot.testNg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.testng.annotations.DataProvider;

public class DataproviderClass {
	
	
	@DataProvider(name="getDataFromDataprovider")
    public static Object[][] getDataFromDataprovider() {
      
		return new Object[][] {
            { "vasudhamattebam@gmail.com", "Whoami@123" }
        };  
	}

	@DataProvider(name="DatabaseProviderList")
    public static Object[][] getDataFromDataproviderList() {
		
		String userName = null;
		String password = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "admin");
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery("select * from test.loginDetails");


			if (result.next()) {
				userName = result.getString("username");
				password = result.getString("password");
			}
			
			System.out.println("username - >"  + userName + ", Password - >" +password);

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
      
		return new Object[][] { {userName, password},
            };
	}
	
	
	
}
