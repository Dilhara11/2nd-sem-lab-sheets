public class Departments {
    public void display(){
        System.out.println("There are three Departments.");
    }
}

class ComputerScience extends Departments{
    @Override
    public void display(){
        System.out.println("Teaching Computer Science.");
    }
}

class ComputerEngineering extends Departments{
    @Override
    public void display(){
        System.out.println("Teaching Computer Engineering");
    }
}

class TeachingModules{
    public static void main(String[] args){
        Departments department1, department2;
        department1 = new ComputerScience();
        department2 = new ComputerEngineering();

        department1.display();
        department2.display();

        
    }
}
