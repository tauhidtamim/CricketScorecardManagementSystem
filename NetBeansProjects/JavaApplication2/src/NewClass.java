/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class NewClass {
    public static void main(string arg[])throws exception
    {   class.forname("oracle.jdbc.driver.OracleDriver");
      
       Connection con=Driver manager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle","2338");
       statement st=con.createStatement();
       ResultSet rs=st.execute Query("select*from students");
       while(rs.next())
       {System.out.println(rs.string(1)+""+rs.getstring(2)+""+rs.getString(3));
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
