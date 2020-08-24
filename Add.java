import java.util.*;
import java.io.*;
public class Add {
    String Ner[]=new String[900];
    int Mer[]=new int[900];
    int i=0,j=0;static int flag=0;static int Totalcost=0;
    static int z[]=new int[404];int v,amo; 
    String N[]=new String[404];
    static String S[]=new String[404];
    static int K[]=new int[404];
    String L,M;static String T;
    BufferedReader mr = new BufferedReader(new InputStreamReader(System.in));
    public void add() throws IOException, FileNotFoundException{
        System.out.println("Type the model number (for ony electronic items (for example this is a model number CU85HU8500R,CU8000)) ");
        System.out.println("for other products type its name or the product with given number");
        System.out.println("eg. if yoy want to buy glass you shall type (glass 1) (i.e. glass followed by its given number) ");
        T=mr.readLine();
        FileReader fstream=new FileReader("cost.txt");
        BufferedReader br = new BufferedReader(fstream);
        FileReader ft=new FileReader("Name.txt");
        BufferedReader dr = new BufferedReader(ft);
        while((M=dr.readLine())!= null)	
        {N[j]=M;
            j++;
        }
        while((L=br.readLine())!= null)	
        {z[i]=Integer.parseInt(L);
            i++;
        }   
        br.close();
        dr.close();
        int l=N.length;
        for(int a=0;a<(l-1);a++)
        {if(T.equals(N[a]))
            {flag=0;S[a]=N[a];K[a]=z[a];
                flag++;
                if(amo>=1)
                z[a]=amo*z[a];
                if (flag==1)
                {Totalcost+=z[a];
                    System.out.println("Product avilable");
                    System.out.println("Model of yor product "+N[a]);
                    System.out.println("cost of your product "+z[a]);
                System.out.println("enter the amount of this product you want to buy");
            amo=Integer.parseInt(mr.readLine());
               }
                else
                {flag=0;
                    continue;}}}}

    public void bill()throws IOException{int c,qw;
        Date d = new Date();BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("press 1. to pay by credit card or 2. for cash on delivary");
        int input=Integer.parseInt(br.readLine());
        if (input==1)
        {System.out.println("Enter your card number");
            String number="";
            number=br.readLine();
            System.out.println("Enter your card password");
            String panumber="";
            panumber=br.readLine();
            if(Login.asada!=null)
                System.out.println("your product will be delivered to "+Login.asada);
            else
            {System.out.println("Enter your Address");
                String Addr="";
                Addr=br.readLine();
                System.out.println("your product will be delivered to "+Addr);
            }}else if(input==2)
        {if(Login.asada!=null)
                System.out.println("your product will be delivered to "+Login.asada);
            else{
                System.out.println("Enter your Address");
                String Addr="";
                Addr=br.readLine();
                System.out.println("your product will be delivered to "+Addr);
            }}System.out.println("Thank you for shopping");
        System.out.println("Your bill will be displayed in few seconds.......");
        try { Thread.sleep(4000); } 
        catch(InterruptedException ex) {Thread.currentThread().interrupt();}
        System.out.print('\u000C');    
        System.out.println("===========================================Keep shopping===========================================");
        System.out.println("");
        System.out.println("");
        System.out.print("items bought");
        System.out.println("\t\t");
        for(c=0;c<(S.length);c++)
        {if(S[c]==null)
            {continue;}
            else if (amo<=0)
            System.out.println(S[c]);
        else if (amo>=1)
   System.out.println(S[c]+"x"+amo);}
        System.out.print("\ncost of products bought");
        System.out.println("\t\t");
         for(c=0;c<(S.length);c++)
        {if(K[c]==0)
            {continue;}
            else if (amo<=0)
            System.out.println(K[c]);
        else if (amo>=1)
   System.out.println(K[c]+"x"+amo);}
        System.out.println("");
        System.out.print("Total cost of the products \t");
        System.out.println(Totalcost);
        System.out.println("Date of buying "+d);
        System.out.println("                                                                                                 :     :");
        System.out.println("   ....    ::                                                                           ::       ::   ::");
        System.out.println(" ,;' .;:   ::           ,,...,,   :;;;;       ..:,:;.,:;.                               ::      ,,.....,,");
        System.out.println(" ::.       :::,:,.,   ,,       ,, ::   ''      ::  ::  ::    ,,...,,   :    ' ::...,    ::     ,,        ,,");
        System.out.println("   '''::,  ::    ::  ,,         ,,::    ''     ::  ::  ::   ,,     ,,  ::  '  :    :    ::    ,,  ;    ;  ,,");
        System.out.println("    ,  ::; ::    ::  ,,         ,,:: ..''      ::  ::  ::  ,,       ,, ::''   :,,;'           ,,    :     ,,");
        System.out.println("  ::   ::; ::    ::   ,,       ,, ::           ::  ::  ::   ,,     ,,  ::     :        ,...,   , ';:::;' ,,");
        System.out.println(" ' ,,,'   ::    ::     ,,...,,   :           ,;; ,;;, ;;,   ,,...,,   ::     ::::....  ';;'    ,,.....,,");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Thank you for using the project");
        System.out.println("");
        System.out.println("");
        System.out.println("If you want to continue press 1 or any character to exit");
        char chs=(char)br.read();
        if (chs=='1'){Main obj100=new Main();obj100.main1();}else System.exit(0);
    }}
