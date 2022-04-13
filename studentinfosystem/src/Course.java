public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int quiz;
    Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        note=0;
        quiz=0;
    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;

        }else{
            System.out.println("Teacher and branch are different.");
        }

    }
    void printTeacherInfo(){

        this.teacher.print();
    }
}
