public class OOPS{
        public static void main(String[] args) {
                // horse h=new horse();
                // h.eat();
                // h.walk();
                // // System.out.println(h.color);
                // h.changecolor();
                // Checken c=new Checken();
                // c.eat();
                // c.walk();
                /////////////////////
                // Queen q=new Queen();
                // q.move();
                ////////////////////
                horse h=new horse();
                System.out.println(h.color);
        }
}
// interface chessPlayer{
//         void move();
// }
// class Queen implements chessPlayer{
//         public void move(){
//                 System.out.println("up,down,left,right,diagonal,(all 4 side move)");
//         }
// }
// class Rook implements chessPlayer{
//         public void move(){
//                 System.out.println("up,down,left,right");
//         }
// }
// class King implements chessPlayer{
//         public void move(){
//                 System.out.println("up,down,left,right,diagonal,(all 1 side move");
//         }
// }
//////////////////////
class Animal{
        String color;
        Animal(){
                System.out.println("anials constructor called..");
        }
}
class horse extends Animal{
      horse(){
        super.color="brown";
                System.out.println("HORSE CONSRTURCTO CALLED");
      }
}












//  abstract class Animal {
//         String color;
//         Animal(){
//           color="Brown";
//         }
//         void eat(){
//                 System.out.println("aniaaml eat");
//         }
//         abstract void walk();
//  }
//  class horse extends Animal{
//         void changecolor(){
//                 color="dark brown";
//                 System.out.println(color);
//         }
//         void walk(){
//                 System.out.println("walks on 4 legs");
//         }
//  }
//  class Checken extends Animal{
//         void changecolor(){
//                 color="yellow";
//         }
//         void walk(){
//                 System.out.println("walks on 2 legs");
//         }
//  }
























// public class OOPS{
//         public static void main(String[] args) {
//         //         Pen obj=new Pen();
//         //         obj.setColor("blue");
//         //         System.out.println(obj.getcolor());
//         //         obj.settip(5);
//         //         System.out.println(obj.gettip());

//                 // BankAcount myacc=new BankAcount();
//                 // myacc.usename="vinay kumar";
//                 // myacc.setPassword("abcdefg");
//                 //  student s1=new student();
//                 //  s1.name="vinay";
//                 //  s1.roll=98;

                
//                 // s1.marks[0]=100;
//                 // s1.marks[1]=90;
//                 // s1.marks[2]=19;
                
//                 // student s2=new student(s1);
//                 // s1.marks[2]=100;
//                 // for(int i=0;i<3;i++){
//                 //         System.out.println(s2.marks[i]);
//                 // }
                  
//                 // student s1=new student();
//                 // student s2=new student("vinay");
//                 // student s3=new student(654);
//                 // System.out.println(s1.name);
//                 /////////////////////single inheritance
//                 // fish f=new fish();
//                 // f.color="vinay";
//                 // f.eat();
//                 // f.breath();
//                 // f.fins=9;
//                 // f.swim();
//                 // System.out.println(f.fins);

//                 ////////////multinple inhertinaxe
//                 // dog dommy=new dog();
//                 // dommy.bread=2;
//                 // dommy.legs=4;
//                 // dommy.eat();
//                 // dommy.breath();

//                 // System.out.println(dommy.bread);
//                 // System.out.println(dommy.legs);
//                 ////////////////////////
//                 // Bird b=new Bird();
//                 // b.eat();
//                 ////////////////////
//                 Dear d=new Dear();
//                 d.eat();


//         }

// }
// /////////////////////method overiding
// class Animal{
//         void eat(){
//                 System.out.println("eats anything");
//         }
// }
// class Dear extends Animal{
//         void eat(){
//                 System.out.println("eats grass");
//         }
// }
// // class BankAcount{
// //         public String usename;
// //         private String password;
// //         public void setPassword(String password) {
// //             this.password = password;
// //         }
// // }

// /////
// /// 
// //   class student{
// //         String name;
// //         int roll;
// //          int marks[];

// //          //shalllow copy
// //         // student(student s1){
// //         //         marks=new int[];
// //         //         this.name=s1.name;
// //         //         this.roll=s1.roll;
// //         //         this.marks=s1.marks;
// //         // }
// //          //deep copy
// //         student(student s1){
// //                 marks=new int[3];
// //                 this.name=s1.name;
// //                 this.roll=s1.roll;
// //                 for(int i=0;i<marks.length;i++){
// //                         this.marks[i]=s1.marks[i];
// //                 }
// //         }


// //         student(){   //non parametrized constructor
// //                 System.out.println("NON parametrized constructor..");
// //         }

// //         // student(String name){   //constructor  parametrized constructor
// //         //         this.name=name;
// //         // }

// //         // student(int roll){
// //         //         this.roll=roll;
// //         // }
// //   }




// // class Pen{
       
// //        private String color;
// //         private int tip;
// //         void setColor(String newcolor){
// //                 color=newcolor;
// //         }
// //         void settip(int newtip){
// //                 tip=newtip;
// //         }

// //         String getcolor(){
// //                 return this.color;
// //         }
// //         int gettip(){
// //                 return this.tip;
// //         }
// // };

// // class Animal{
// //         String color;
// //         void eat(){
// //                 System.out.println("eats");
// //         }
// //         void breath(){
// //                 System.out.println("breaths");
// //         }
// // }
// // class fish extends Animal{
// //        int fins;
// //        void swim(){
// //         System.out.println("Swims in water");
// //        }
// // }
// // class Mammals extends Animal{
// //     int legs;
// // }

// // class dog extends Mammals{
// //         int bread;
// // }
// ///////////////////////
// class Mammals extends Animal{
//         void walk(){
//                 System.out.println("Walks");
//         }
// }
// class fish extends Animal{
//         void swim(){
//                 System.out.println("Walks");
//         }
// }
// class Bird extends Animal{
//         void fly(){
//                 System.out.println("Walks");
//         }
// }