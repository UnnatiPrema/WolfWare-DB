import java.sql.*;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class enterStaffInfo {


// Update your user info alone here
private static final String jdbcURL = "jdbc:mariadb://classdb2.csc.ncsu.edu:3306/bagrawa"; // Using SERVICE_NAME

// Update your user and password info here!

private static final String user = "bagrawa";
private static final String password = "200347899";

public static void main(String[] args) {
try {
// Loading the driver. This creates an instance of the driver
// and calls the registerDriver method to make MySql(MariaDB) Thin available to clients.


Class.forName("org.mariadb.jdbc.Driver");

            Connection connection = null;
            Statement statement = null;
			
			String staffID = null;
            String sqlSelect = null;
			      Scanner sc= new Scanner(System.in);
            try {
            // Get a connection instance from the first driver in the
            // DriverManager list that recognizes the URL jdbcURL
            connection = DriverManager.getConnection(jdbcURL, user, password);
            statement = connection.createStatement();
            // Create a statement instance that will be sending
            // your SQL statements to the DBMS
            
      			try{
<<<<<<< HEAD
				System.out.print("Enter staff ID (Please enter ID in quotes): "); 
      			staffID = sc.nextLine();
				
				System.out.print("Enter store ID (Please enter ID in quotes): "); 
      			String storeID = sc.nextLine();
      			
				System.out.print("Enter name in quotes): "); 
=======
				System.out.print("Enter staff ID: "); 
      			staffID = sc.nextLine();
				
				System.out.print("Enter store ID: "); 
      			String storeID = sc.nextLine();
      			
				System.out.print("Enter name: "); 
>>>>>>> f4f81e8508d9b2aeb0c39a2dff83977ef60dc6e8
      			String name = sc.nextLine();
				
				System.out.print("Enter age"); 
      			Integer age = sc.nextInt();
				
<<<<<<< HEAD
				System.out.print("Enter home address in quotes");
				String homeAddr= sc.nextLine();
				
				System.out.print("Enter job title in quotes");
				String jobT= sc.nextLine();
				
				System.out.print("Enter phone number in quotes");
				String phoneNumber= sc.nextLine();
				
				System.out.print("Enter email address in quotes");
				String email= sc.nextLine();
				
				System.out.print("Enter timestamp in YYYY-MM-DD HH:MM:SS format in quotes");
				String timestamp= sc.nextLine();
				
      			String sql= "INSERT INTO STAFF VALUES (%s,%s,%s,%d,%s,%s,%s,%s,%s)";
				sqlSelect = String.format(sql, staffID, storeID, name, age, homeAddr, jobT, phoneNumber, email, timestamp);
=======
				System.out.print("Enter home address");
				String homeAddr= sc.nextLine();
				
				System.out.print("Enter job title");
				String jobT= sc.nextLine();
				
				System.out.print("Enter phone number");
				String phoneNumber= sc.nextLine();
				
				System.out.print("Enter email address");
				String email= sc.nextLine();
				
				System.out.print("Enter timestamp in YYYY-MM-DD format");
				String timestamp= sc.nextLine();
				
      			String sql= "INSERT INTO STAFF VALUES (%s,%s,%s,%d,%s,%s,%s,%s,%s)";
				sqlSelect = String.format(sql,"'"+staffID+"'","'"+storeID+"'","'"+name+"'","'"+age+"'","'"+homeAddr+"'","'"+jobT+"'","'"+phoneNumber+"'","'"+email+"'","'"+timestamp+"'");
>>>>>>> f4f81e8508d9b2aeb0c39a2dff83977ef60dc6e8
			
			
            }
            catch(Throwable oops) {
              System.out.print("Incorrect format for inputs");
            }
			
			try{
			connection.setAutoCommit(false);
  			statement.executeQuery(sqlSelect);
			connection.commit();
			System.out.println("Statement Executed");
          }
<<<<<<< HEAD
          System.out.println("*************************************************");
        }
=======
          
>>>>>>> f4f81e8508d9b2aeb0c39a2dff83977ef60dc6e8
        catch (Exception e){
		connection.rollback();
        System.out.println("Statement not executed");
        
        }
			
			} finally {
<<<<<<< HEAD
                close(result);                  
=======
                                
>>>>>>> f4f81e8508d9b2aeb0c39a2dff83977ef60dc6e8
                close(statement);
                close(connection);
                
            }
} catch(Throwable oops) {
            oops.printStackTrace();
        }
}
static void close(Connection connection) {
        if(connection != null) {
            try {
            connection.close();
            } catch(Throwable whatever) {}
        }
    }
    
static void close(Statement statement) {
        if(statement != null) {
            try {
            statement.close();
            } catch(Throwable whatever) {}
        }
    }
    
<<<<<<< HEAD
 static void close(ResultSet result) {
        if(result != null) {
            try {
            result.close();
            } catch(Throwable whatever) {}
        }
    }
    
    
=======
 
>>>>>>> f4f81e8508d9b2aeb0c39a2dff83977ef60dc6e8
}