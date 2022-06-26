import java.sql.*; 
public class CreateTable 
{ 
public static void main(String args[]) 
{ 
p;
try 
{ 
//com.mysql.cj.jdbc.Driver 
Class.forName("com.mysql.jdbc.Driver"); 
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Moviedescription","root",""); 
Statement s=con.createStatement(); 
s.executeUpdate("create table Movies ( Name varchar(35), Actor varchar(30), Actress varchar(35), Director varchar(20), Year int(20))"); 
System.out.println("Table Created"); 
con.close(); 
} 
catch(Exception e) 
{ 
System.out.println(e); 
} 
} 
}