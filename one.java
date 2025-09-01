// 1st assingment

class Cparticipant {
    private static int counter;
    private String regId;
    private String name, branch;
    private long contactNo;

    static{
        counter = 1001;
    }

    public Cparticipant(String name, String branch, long contactNo, String regId){
        this.name = name;
        this.branch = branch;
        this.contactNo = contactNo;
        this.regId = "D"+counter;
        counter++;
    }
    public String getname(){
        return name;
    }
    public String getregId(){
        return regId;
    }
    public String getbranch(){
        return branch;
    }
    public static int getcounter(){
        return counter;
    }
    public static void setCounter(int num){
        counter = num;
    }
    public void setName(String name){
        this.name = name;
    }
}

class one{
    public static void main (String[]args){
        Cparticipant s1 = new Cparticipant("hritik", "AIML", 131242, "qwrtyt");
        Cparticipant s2 = new Cparticipant("rohit", "AIML", 13142, "noob");
    System.out.println("hi"+s1.getname()+" Your registration id is "+s1.getregId());
    System.out.println("hi"+s2.getname()+" Your registration id is "+s2.getregId());
    }
}