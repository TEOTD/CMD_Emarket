import java.io.*;
public class Main //class Begining
{int l,m,D,co,cou,coun,count,y,z,nm;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String s,si,t,sid,sidi;
char c,E;static int mk;
Flip obj=new Flip(); 
Login obj1=new Login();
public void main1()throws IOException //method begining
{System.out.print('\u000C');
System.out.println("   ***   ****  *****  *       * * *    ***    *        *  **** ");
System.out.println("   ***   ****  *      *      *       *     *  **  **  **  *    ");
System.out.println("   ***    ***  *****  *     *       *       * ***    ***  ****");
System.out.println("   *** ** ***  *      *      *       *     *  ***    ***  *");
System.out.println("   **      **  *****  ******   * * *   ***    ***    ***  ****");
System.out.println("");
System.out.println("");
System.out.println("                        *******    ***    ");
System.out.println("                           *      *    *");
System.out.println("                           *     *      *");
System.out.println("                           *      *    * ");
System.out.println("                           *        ***");
System.out.println("");
System.out.println("");
System.out.println("    ****** *      ******* ***      ****      *      ****  *******");
System.out.println("    *      *         *    *   *   *         *  *    *   *    * ");
System.out.println("    ****** *         *    * **   *         ******   * **     *");
System.out.println("    *      *         *    *       *       *      *  *  *     *");
System.out.println("    *      ****** ******* *         **** *        * *    *   *");
System.out.println("");
System.out.println("");
System.out.println("enter 1 to continue ");
System.out.println("enter 2 to login and search for your product or any character to exit");
System.out.println("enter your choice ");
c=(char)br.read();
if(c=='1')
obj.flip();
else if(c=='2')
obj1.log();
else
System.exit(0);  
} //Method ending
} //Class ending