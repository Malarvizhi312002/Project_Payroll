package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

@Service
public class EmployService {
	
	@Autowired
	private EmployRepository repo;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int login1(String user, String pwd) {
		String cmd = "select count(*) cnt from Employ Where username = ? AND passwordd = ?";
		List<Object> list = jdbcTemplate.query(cmd, new Object[] {user, pwd},new RowMapper<Object>() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Object ob = rs.getInt("cnt");
				return ob;
			}
		});
		Integer str = (Integer)list.get(0);
		System.out.println("count is " +str);
		return str;
	}
	
	public List<Employ> showAll() {
		return repo.findAll();
	}
	
	public Employ searchEmploy(int empno) {
		return repo.findById(empno).get();
	}
	
	public void addEmploy(Employ employ) {
		repo.save(employ);
	}
	public void deleteEmploy(int id) {
		repo.deleteById(id);
	}
	public void updateEmploy(Employ employ) {
		repo.save(employ);
	}

}
