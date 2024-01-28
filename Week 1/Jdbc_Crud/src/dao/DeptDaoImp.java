package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Dept;

public class DeptDaoImp implements IDeptDao {
	
	Connection conn = null;
	
	public DeptDaoImp() {
		conn = DBUtil.getDBConnection();
	}

	@Override
	public int insert(Dept dept) {
		// INSERT
				String insert = "insert into dept values(?,?,?)"; // ? positional parameters

					int count = 0;
				
				try {
					PreparedStatement pstmt = conn.prepareStatement(insert);

					pstmt.setInt(1, dept.getDno());
					pstmt.setString(2, dept.getDname());
					pstmt.setString(3, dept.getLocation());

				 count = pstmt.executeUpdate();

				} catch (SQLException e) { 
					e.printStackTrace();
				}

				return count;
	}

	@Override
	public int update(Dept dept) {
		String update = "update dept set dname = ?, location = ? where dno = ?";
		int count = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(update);
			pstmt.setString(1, dept.getDname());
			pstmt.setString(2, dept.getLocation());
			pstmt.setInt(3, dept.getDno());
			
			count = pstmt.executeUpdate();
			
			System.out.println("record update is "+count);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public int deleteOne(int dno) {
		
		    String deleteQuery = "DELETE FROM dept WHERE dno = ?";
		    
		    try (PreparedStatement pstmt = conn.prepareStatement(deleteQuery)) {
		        pstmt.setInt(1, dno); 
		        
		        int rowsDeleted = pstmt.executeUpdate();
		        
		        if (rowsDeleted > 0) {
		            System.out.println("Department with dno " + dno + " deleted successfully.");
		        } else {
		            System.out.println("No department found with dno " + dno + ". Nothing deleted.");
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();  
		    }
		

		return 0;
	}

	@Override
	public int selectOne(int dno) {
		String selectById = "select dno,dname,location from dept where dno = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(selectById);
			
			pstmt.setInt(1, dno);  
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt("dno")+" "+rs.getString("dname")+" "+rs.getString("location"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
		
	}

	@Override
	public List<Dept> selectAll() {
		String selectAll = "select dno,dname,location from dept";
		List<Dept> list = new ArrayList<Dept>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(selectAll);
	
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
			
				
				Dept dept = new Dept(rs.getInt("dno"),rs.getString("dname"),rs.getString("location"));
				list.add(dept);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		
		
		}
		return list;
	}
}
