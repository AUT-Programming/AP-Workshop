import java.io.*;

public class Deserialize {
    public static void main(String[] args) {





        try{
            FileInputStream fis = new FileInputStream("student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s = (Student) ois.readObject();
            ois.close();
            fis.close();

            System.out.println(s.name);
            System.out.println(s.age);

        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
