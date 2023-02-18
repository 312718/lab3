public class Person {
    String name;
    int Tiredness;
    int age;
    int Strong;
    boolean usefull;

    public void think(){
    }

    public String ifUsefull(){
        if(this.usefull==true){
            return "полезный";
        }else{
            return "not usefull";
        }
    }


    public Person(String name){
        this.name = name;
        this.usefull=usefull;
    }

    public void live() {
        System.out.println("Жил-был " + name);
    }

    public void run() {
        System.out.println(name + " расступился");
    }

    public void tell() {
//        System.out.println(name + " рассказывает коротышкам:");
//    }
    }
}
