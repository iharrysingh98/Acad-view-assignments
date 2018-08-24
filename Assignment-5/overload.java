class Overload 
{

    static void print(){
    System.out.println("!! Hello Java !!");
    }



    static void print(int a){
    System.out.println("!! Hello Java !!"+a);
    }


    static void print(float a){
     System.out.println("!! Hello Java !!"+a);
    }

    public static void main(String args[]){

        int a=1;
        float b=1;

           Overload.print();
          Overload.print(b);
        Overload.print(a);



    }



}