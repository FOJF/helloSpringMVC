package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Subject;

@Repository

public class SubjectDao {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public List<Subject> getSubjects() {

		String sqlStatement = "select *from subject";

		return jdbcTemplate.query(sqlStatement, new RowMapper<Subject>() {
			@Override
			public Subject mapRow(ResultSet rs, int rowNum) throws SQLException {

				Subject subject = new Subject();

				subject.setYear(rs.getInt("year"));
				subject.setTerm(rs.getInt("term"));
				subject.setProfessor(rs.getString("professor"));
				subject.setName(rs.getString("name"));
				subject.setClassification(rs.getString("classification"));
				subject.setCredit(rs.getInt("credit"));
				return subject;
			}

		});

	}

	public boolean insert(Subject subject) {
		String name = subject.getName();
		String classification = subject.getClassification();
		String professor = subject.getProfessor();
		int credit = subject.getCredit();
		String sqlStatement = "insert into subject(year, term, name, classification,professor,credit) values(2021,1,?,?,?,?)";

		return (jdbcTemplate.update(sqlStatement, new Object[] { name, classification, professor, credit + "" }) == 1);

	}

}
