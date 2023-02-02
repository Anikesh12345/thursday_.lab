

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/data_fetching")
public class data_fetching extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public data_fetching() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			String qur = "select * from data where user_id=? and user_pass=?";
			String user_id ,usr_pass;
			user_id =request.getParameter("u_name");
			usr_pass =request.getParameter("u_Pass");

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Register","root","root" );
			PreparedStatement st=con.prepareStatement(qur);
			st.setString(1, user_id);
			st.setString(2, user_pass);
			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				response.sendRedirect("Register");			
			}
			else {
				response.sendRedirect("error.jsp");
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}

}
