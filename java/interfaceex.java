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

class Animal{
    public static void main(String[] args) {
        interface_ex obj = new interface_ex() {};
        obj.setName("Dog");
        System.out.println(obj.name);
    }
}
