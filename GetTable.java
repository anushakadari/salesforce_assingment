import java.sql.*; 
public class GetTable 
{ 
public static void main(String args[]) 
{ 
try 
{ 
Class.forName("com.mysql.jdbc.Driver"); 
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Moviedescription","root",""); 
Statement s=con.createStatement(); 
ResultSet r = s.executeQuery("select * from Movies"); 
System.out.println("The Movie Details are \n"); 
while(r.next()) 
{ 
System.out.println(r.getString(1)+":"+r.getString(2)+":"+ r.getString(3)+":"+r.getString(4) +":" + r.getInt(5)); 
} 
con.close(); 
} 
catch(Exception e) 
{ 
System.out.println(e); 
} 
} 
}