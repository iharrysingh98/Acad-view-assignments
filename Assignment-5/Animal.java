  class Animal 
  
  {
   String breed;
   String color;


   void Speak()
   {
       System.out.println("Dogs and Cats !!");
   }


   public static void main(String args[])
   {

   Animal obj1=new Animal();
     Dog obj2=new Dog();
    Cat obj3=new Cat();


     obj1.Speak();
     obj2.Speak();
   obj3.Speak();
   }

}
 

     class Dog extends Animal
     {
         String breed;
       String color;

                 void Speak()
                 {
               
                   System.out.println("Barkk ");
                 }
              }

  class Cat extends Animal
  {
        String breed;
     String color;

   void Speak(){
                    
     System.out.println("Meooow");
  }
    }
