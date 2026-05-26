//interface cannot have implementation
interface interfaceex{
    String name = "";
    int value = 0;

    void setName();
}

//abstractclass can have implementation
abstract class interface_ex{
    String name = "";

    void setName(String name){
        this.name = name;
    }
}