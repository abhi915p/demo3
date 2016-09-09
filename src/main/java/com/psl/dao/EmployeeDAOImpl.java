package com.psl.dao;

import java.util.List;



import javax.swing.tree.RowMapper;

import org.springframework.jdbc.core.JdbcTemplate;

import com.psl.entity.Employee;

public class EmployeeDAOImpl implements IEmployeeDAO {
	
 private JdbcTemplate template;
 
	public JdbcTemplate getTemplate() {
	return template;
}

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

	public List<Employee> getAllEmployees()
	 {
return template.query("select * from employee1", new RowMapper<Employee>(){

public Employee mapRow(ResultSet rs, int arg1)
throws SQLException {
Employee e= new Employee();
e.setId(rs.getInt("id"));
e.setName(rs.getString("name"));
 
return e;
} 
});
}
	
	public void addEmployee(Employee e){
		
		System.out.println("In dao AddEmployee");
		String sql = "insert into employee (id,name) values "+e.getId()+"," +e.getName() ;
		
		template.update(sql);
	}
	

}
