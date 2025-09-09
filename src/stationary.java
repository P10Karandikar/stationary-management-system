import java.util.*;

class stationary
{
public static void main (String args[])
{

String name;
int password;
int choice;
long mob;
int total;
String bdate;
int del;
char ch;

System.out.println("***************************************************************");
System.out.println("***************************************************************");
System.out.println("     STATIONARY MANAGEMENT SYSTEM            ");
System.out.println("***************************************************************");
System.out.println("***************************************************************");
do{
System.out.println("WELCOME TO SIT STATIONARY");
System.out.println("choose the following option :");
System.out.println("1.create account");
System.out.println("2.log in");
System.out.println("3.delete account");
System.out.println("4.stationary items");
System.out.println("5.delivery option");
System.out.print("Enter your choice:");
Scanner s=new Scanner(System.in);
choice=s.nextInt();
switch(choice)
{
case 1:
System.out.println("you have choosen 1st option");
System.out.println(" ................................   CREATE ACCOUNT   .................................");
System.out.println(" ");
System.out.println("enter your name");
name=s.next();
System.out.println("enter your mobile number");
mob=s.nextLong();
System.out.println("ACCOUNT CREATED SUCCESSFULLY..!!!!");
break;
case 2:
System.out.println("you have choosen 2nd option");
System.out.println("...............................  LOGIN ........................");
System.out.println(" ");
System.out.println("enter your mobile number");
mob=s.nextLong();
System.out.println("enter password");
password=s.nextInt();
if(2409==password)
{
int stock;
System.out.println("enter your bdate");
bdate=s.next();
System.out.println("ACCOUNT SUCCESSFULLY LOGED..!!");
}
else
{
System.out.println("CANT CREATE ACCOUNT TRY ANOTHER WAY");
}
break;
case 3:
System.out.println("you have choosen 3rd option");
System.out.println(".......................  DELETE ACCOUNT .................");
System.out.println(" ");
System.out.println("enter your name");
name=s.nextLine();
System.out.println("enter mobile number");
mob=s.nextLong();
System.out.println("do you really want to delete you stationary account");
System.out.println(" if yes then click 1");
Scanner b=new Scanner(System.in);
del=b.nextInt();
if(del==1)
{
System.out.println("ACCOUNT DELETED SUCCESSFULLY");
}
else
{
System.out.println("ACCOUNT NOT DELETED TRY ANOTHER WAY....!!!!");
}
break;
case 4:
System.out.println("you have choosen 4th option");
System.out.println(".............................  STATIONARY ITEMS  ..................");
System.out.println(" ");
System.out.println(" select which stationary item you want");
System.out.println("pens");
System.out.println("notebooks");
System.out.println("textbooks");
System.out.println(" exam pads");
System.out.println("pencil");
System.out.println("pouches");
System.out.println("total no of items is ");
break;
case 5:
System.out.println(" 5th option");
System.out.println(".................................. DELIVERY OPTION .............................");
System.out.println(" ");
System.out.println(" CASH ON DELIVERY...!!");
System.out.println("ONLINE PAYMENT....!!!");
System.out.println("NET BANKING.....!!!");
System.out.println("OPTION SELECTED SUCCESSFULLY....WILL DEILEVER TO YOUR ADDRESS");
break;

default:
  System.out.println("Please enter correct choice .....");
}

System.out.println("Continue... then press y/Y");
 ch=s.next().charAt(0);

}while(ch=='y'||ch=='Y');
}
}