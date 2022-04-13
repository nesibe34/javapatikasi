public class Teacher {
    String name;
    String mpno;
    String branch;
    Teacher(String name,String mpno,String branch){
        this.name=name;
        this.mpno=mpno;
        this.branch=branch;
    }
    void print(){
        System.out.println("Name\t:"+this.name);
        System.out.println("Branch\t:"+this.branch);
        System.out.println("Office Phone\t:"+this.mpno);

    }


}
