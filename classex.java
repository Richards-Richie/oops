class pen{
    String color="";
    String type="";
    public void write(String a,String b,String c){
        System.out.println("the color of the pen is :"+a+" and type of the pen is :"+b+" and with this u are writing "+c);
    }
}


public class classex{
    public static void main(String[] args){
        pen p1=new pen();
        p1.color="red";
        p1.type="pen";
        p1.write(p1.color,p1.type,"wrting something");
    }
}

