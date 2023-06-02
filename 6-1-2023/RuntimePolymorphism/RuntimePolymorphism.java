public class RuntimePolymorphism {

    public int getDistance(){
        System.out.println("This is from main class");
         return 19;
    }
    public static void main(String[] args) {
           RuntimePolymorphism runtimePolymorphism=new RuntimePolymorphism();
           RuntimePolymorphism runtimePolymorphism1=new ChildClass();
           runtimePolymorphism.getDistance();
           runtimePolymorphism1.getDistance();
    }
}

