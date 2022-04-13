public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Mahmut Hoca","2103","Math");
        Teacher t2=new Teacher("Graham Bell","2106","Phys");
        Teacher t3=new Teacher("Bilal Hoca","2105","Chem");

        Course math=new Course("Mathematic","101","Math");
        math.addTeacher(t1);
        Course phys=new Course("Physics","101","Phys");
        phys.addTeacher(t2);
        Course chem=new Course("Chemistry","101","Chem");
        chem.addTeacher(t3);

        Student s1=new Student("Ahmet","123","4",math,phys,chem);
        s1.addBulkExamNote(90,100,80,90,50,70);
        s1.isPass();

        Student s2=new Student("Mehmet","124","3",math,phys,chem);
        s2.addBulkExamNote(55,100,10,50,65,60);
        s2.isPass();

    }
}
