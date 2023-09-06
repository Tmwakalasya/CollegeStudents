public class CollegeStudents {
    //Instance variables:
    private String name;
    private int age;

    private String major;

    private boolean hasHold;
    //Constructor:
    public CollegeStudents(String name,int age,String major,boolean hasHold){
        this.name = name;
        this.age = age;
        this.major = major;
        this.hasHold = false;

    }
    public String getName(){
        return this.name;
    }
    public void setName(){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(){
        this.age = age;
    }
    public String getMajor(){
        return this.major;
    }
    public void setMajor(){
        this.major = major;
    }

    public boolean isHasHold() {
        return hasHold;
    }
}
