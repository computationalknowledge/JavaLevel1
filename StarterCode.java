public class First{

    public static void main(String []args){
        Grapefruit g = new Grapefruit();
        g.setName("Bill");
        g.SayHello();

        Apple a = new Apple();
        a.setName("Mary");
        a.SayHello();

    }
}

class Fruit{
        private String Name;
        public String getName(){
        return Name;
    }
    public void setName(String aName){this.Name = aName;}

    public void SayHello(){
        System.out.println(this.getName());
    }
}

class Grapefruit extends Fruit{

}

class Apple extends Fruit{

}
