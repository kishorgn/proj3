<%@ page import="java.sql.*"%>  
  
<%  
String str=request.getParameter("val");  
if(str==null || str.trim().equals("")){  
	out.print("Please enter id");  
}
else
{  
	int id=Integer.parseInt(str);  
	out.print(id);  
	/*
	try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");  
		PreparedStatement pstmt=con.prepareStatement("select * from emp where id=?");  
		pstmt.setInt(1,id);  
		ResultSet rs=pstmt.executeQuery();  
		while(rs.next()){  
			out.print(rs.getInt(1)+" "+rs.getString(2));  
		}  
		con.close();  
	}
	catch(Exception e){
		e.printStackTrace();
	} */
	 
}  
%>  