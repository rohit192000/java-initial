import java.io.*;
import java.util.*;

class Test{
    public static void main(String[] args){
        Main M = new Main();
        Test t = new Test();
        IIBExample m = new IIBExample();

    }
    Test(){
        System.out.println("main class default contructor");
    }
    {
        System.out.println("main class instance initiallization block called");
    }
}
class IIBExample {
    IIBExample(){
        System.out.println("Parent Class Default Constructor");
    }

    {
        System.out.println("Parent Class Instance Initiallization Block");
    }
}

class Main extends IIBExample{
    Main(){
        System.out.println("Child Class Default Constructor Called");
    }
    {
        System.out.println("Child Class Instance Intiallization Block");
    }
}