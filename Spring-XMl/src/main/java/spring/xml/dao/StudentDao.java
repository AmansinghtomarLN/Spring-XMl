package spring.xml.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import spring.xml.dto.SignupDto;

public class StudentDao {

	
	public static JdbcTemplate jdbcTemplate = new JdbcTemplate(getConnection());
	
	public static  DataSource getConnection() {
		String url = "jdbc:mysql://localhost:3306/springxml";
		String user = "root";
		String pass = "root";
		DataSource ds  = new DriverManagerDataSource(url, user, pass);
	return ds;
	}
		public static void insert(SignupDto user) {
		System.out.println(user.getName());
		String sql = "insert into user values (?,?,?,?)";
		Object[] args = {user.getName(), user.getEmail(), user.getMobile(), user.getPassword()};
		
		jdbcTemplate.update(sql, args);
	}
	
	public static void main(String[] args) {
		System.out.println("insert method started");
		SignupDto dto = new SignupDto();
		dto.setName("Aman");
		dto.setEmail("amansinghtomar2209@gmail.com");
		dto.setMobile("7694000010");
		dto.setPassword("Password");
		
		insert(dto);
		System.out.println("insert is done");
	}
}
