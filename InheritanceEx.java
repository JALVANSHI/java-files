// the program using abstract class
abstract class animal{
    abstract void sound();
}
class lion extends animal{
    void sound(){
        System.out.println("the lion is roaring");
    }
}
class dog extends animal{
    void sound(){
        System.out.println("the dog is barking");
    }
}
class InheritanceEx{
    public static void main(String args[]){
        lion obj1=new lion();
        obj1.sound();
        dog obj2=new dog();
        obj2.sound();
    }
}