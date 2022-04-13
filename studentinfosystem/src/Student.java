public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String number;
    String classes;
    double average;
    double gradec1;
    double gradec2;
    double gradec3;
    Boolean isPass;
    Student(String name,String number,String classes,Course c1,Course c2,Course c3){
        this.name=name;
        this.number=number;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.average=0.0;
        this.isPass=false;
    }
    void addBulkExamNote(int note1,int quiz1,int note2,int quiz2,int note3,int quiz3){
        if(note1>=0 && note1<=100){
        this.c1.note=note1;
        }
        if(quiz1>=0 && quiz1<=100){
            this.c1.quiz=quiz1;
        }
        if(note2>=0 && note2<=100){
        this.c2.note=note2;
        }
        if(quiz2>=0 && quiz2<=100){
            this.c2.quiz=quiz2;
        }
        if(note3>=0 && note3<=100){
        this.c3.note=note3;
        }
        if(quiz3>=0 && quiz3<=100){
            this.c3.quiz=quiz3;
        }
    }
    void printNote(){
        System.out.println(this.c1.name+":\t exam :"+this.c1.note+"\t quiz :"+c1.quiz+"\t grade"+this.gradec1);
        System.out.println(this.c2.name+":\t exam :"+this.c2.note+"\t quiz :"+c2.quiz+"\t grade"+this.gradec2);
        System.out.println(this.c3.name+":\t exam :"+this.c3.note+"\t quiz :"+c3.quiz+"\t grade"+this.gradec3);
        System.out.println("Your average :"+this.average);

    }
    void isPass(){
        System.out.println("=============");
        this.gradec1=this.c1.note*0.8+this.c1.quiz*0.2;
        this.gradec2=this.c2.note*0.8+this.c2.quiz*0.2;
        this.gradec3=this.c3.note*0.8+this.c3.quiz*0.2;
        this.average=(this.gradec1+this.gradec2+this.gradec3)/3.0;
        if (this.average>55){
            System.out.println("You are passed.");
        }
        else{
            System.out.println("You are failed.");
        }
        printNote();
    }
}
