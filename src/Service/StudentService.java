package Service;

import Dao.StudentDao;
import Domain.Student;

import java.sql.PreparedStatement;
import java.util.List;

public class StudentService  implements StudentDao {
    Connection conn = DbConnection.getConnections();

    @Override
    public void save(Student s) {
        try {
            if (s.getName() != null) {
                PreparedStatement pstm = conn.prepareStatement("insert into student(name) values(?)");
                pstm.setString(1, s.getName());
                int i = pstm.executeUpdate();
                System.out.println(i + " Data Inserted Successfully");
            }
        } catch (Exception e) {
        }
    }

    @Override
    public void update(Student s) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Student getStudent(int id) {
        return null;
    }

    @Override
    public List<Student> getStudents() {
        return null;
    }
}
