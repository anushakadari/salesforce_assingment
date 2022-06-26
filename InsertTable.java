import java.sql.*; 
import java.util.*; 
public class InsertTable 
{ 
public static void main(String args[]) { 
try { 
Class.forName("com.mysql.jdbc.Driver"); 
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Moviedescription","root",""); 
Statement s=con.createStatement(); 
Scanner sc = new Scanner(System.in); 
System.out.println("Enter the Movie details"); 
int name = sc.next(); 
String actor= sc.next(); 
String actress= sc.next(); 
String director = sc.next(); 
int year = sc.nextInt(); 
String qry = "INSERT INTO Movies(Name,Actor,Actress,Director,Year) VALUES ("+name+",'"+actor+"','"+actress+"','"+director+"',"+year+")"; 
s.executeUpdate(qry); 
con.close(); 
} 
catch(Exception e) 
{ 
System.out.println(e); 
} 
System.out.println("Row Inserted"); 
} 
}