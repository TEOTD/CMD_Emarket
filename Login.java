import java.io.*;
import java.util.*;
public class Login
{String Asad[]=new String[90000];
static String asada;
 public void log()throws IOException, FileNotFoundException
{BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print('\u000C');
System.out.println("Please enable unlimited buffering in the console window before loging in and using list view\n\n");
System.out.println("enter 1. to login to your account");
System.out.println("enter 2. to create an account ");
System.out.println("enter 3. to go to previous menu ");
System.out.println("enter 4. to exit");
int input=Integer.parseInt(br.readLine());switch(input)
{case 1:login();break;case 2:createlog();case 3:Main obj1=new Main();obj1.main1();break;
case 4:System.exit(0);break;default:System.out.println("Invalid try again");log();break;
}}
public void createlog()throws IOException
{BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
FileWriter fw=new FileWriter("username.txt",true);
PrintWriter pw=new PrintWriter(fw);
FileWriter fp=new FileWriter("password.txt",true);
PrintWriter pp=new PrintWriter(fp);
FileWriter fpd=new FileWriter("uaddress.txt",true);
PrintWriter ads=new PrintWriter(fpd);
String name="",username,password,phone="",mail="",address="";
System.out.println("enter your name");
name=br.readLine();
System.out.println("enter your desired username");
username=br.readLine();
pw.println(username);
System.out.println("enter your desired password");
password=br.readLine();
pp.println(password);
System.out.println("enter your email address");
mail=br.readLine();
System.out.println("enter your phone number");
phone=br.readLine();
System.out.println("enter your address");
address=br.readLine();
ads.print(address);
pw.close();pp.close();ads.close();
try { System.out.print("\t\t\t\t\t\t\t creating account please wait ............");
Thread.sleep(4000); } 
catch(InterruptedException ex) {Thread.currentThread().interrupt();}
System.out.print('\u000C');
try { System.out.print("Account created");
Thread.sleep(1000); } 
catch(InterruptedException ex) {Thread.currentThread().interrupt();}log();
}
public void login()throws IOException,FileNotFoundException
{BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int i=0,j=0,lk=0;String N[]=new String[90000];String z[]=new String[90000];String M,L,Adda;
FileReader fstream=new FileReader("username.txt");
BufferedReader mr = new BufferedReader(fstream);
FileReader ft=new FileReader("password.txt");
BufferedReader dr = new BufferedReader(ft);int flag=0;
FileReader fast=new FileReader("uaddress.txt");
BufferedReader ar = new BufferedReader(fast);
while((M=dr.readLine())!= null)
{N[j]=M;
j++;
}
while((L=mr.readLine())!= null)	
{z[i]=L;
i++;
}
while((Adda=ar.readLine())!= null)	
{Asad[lk]=Adda;
lk++;
}     
mr.close();
dr.close();ar.close();
int l=N.length;
System.out.println("Enter your user name");
String U=br.readLine();
System.out.println("Enter your Password");
String P=br.readLine();
for(int a=0;a<(l-1);a++)
{if((P.equals(N[a]))&&(U.equals(z[a])))
{flag++;
if (flag==1)
{asada=Asad[a];System.out.print('\u000C');
try { System.out.print("\t\t\t\t\t\t\t Loging in ............");
Thread.sleep(2000); } 
catch(InterruptedException ex) {Thread.currentThread().interrupt();}
System.out.print('\u000C');
System.out.println("Welcome "+z[a]);
System.out.println("");
mod();
}else 
flag=0;}}
if (flag==0)
{System.out.println("Wrong username and password if you wnat to  try again press 1 to go back to previous menu pres 2");
int oip=Integer.parseInt(br.readLine());
if(oip==1)
login();
else
log();}
}
public void mod()throws IOException,FileNotFoundException{int co,cou,j=0;String J="ABC";
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));String z[]=new String[432];String M,L;
System.out.println("enter 1. continue in catigory view ");
System.out.println("enter 2. for List view");
System.out.println("enter 3. to go to previous menu");
System.out.println("enter 4. to exit");
System.out.println("enter your choice ");
int input=Integer.parseInt(br.readLine());switch(input)
{case 1:Flip obj8=new Flip();obj8.flip();break;
case 2:
FileReader fstream=new FileReader("mod.txt");
BufferedReader cr = new BufferedReader(fstream);Add obj=new Add();
while((L=cr.readLine())!=null)	
{z[j]=L;
j++;
}cr.close();for(int i=0;i<(z.length-1);i++)
{System.out.println(z[i]);
}
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(br.readLine());
if(co==1){obj.add();if (Add.flag==0)System.out.println("product not avilable");
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(br.readLine());
if(cou==1){mod();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0);	}else if (co==2) {Main obj1=new Main();obj1.main1();}
else System.out.println("invalid try again");mod();break;
case 3:log();break;case 4:System.exit(0);break;}
}}