import java.util.Date;

public enum TypeOfLight {
    Dark("Каталажка");




    TypeOfLight(String name){
        this.name=name;
    }
    public String name;
    public String getName(){
        return name;
    }
}
