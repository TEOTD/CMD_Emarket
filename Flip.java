import java.io.*;
public class Flip //class begining
{
    Electronics obj=new Electronics();
    Acessories obj2=new Acessories();
    Kitchenware obj3=new Kitchenware();
    Informative obj4=new Informative();
    public void flip()throws IOException
    {BufferedReader mr = new BufferedReader(new InputStreamReader(System.in));
        System.out.print('\u000C');
        System.out.println("enter 1. for Electronics");
        System.out.println("enter 2. for Acessories ");
        System.out.println("enter 3. for kitchen ware ");
        System.out.println("enter 4. for Informative books and movie cd");
        System.out.println("enter 5. to exit");
        System.out.println("enter your choice ");
        int input=Integer.parseInt(mr.readLine());switch(input)
        {case 1:elec();break;case 2:ace();break;case 3:kit();break;case 4:info();break;
            case 5:System.exit(0);break;default:System.out.println("Invalid try again");flip();break;
        }}

    public void elec() throws IOException{BufferedReader mr = new BufferedReader(new InputStreamReader(System.in));   // Method 2 Begining
        System.out.print('\u000C');
        System.out.println("enter 1. for Tv");
        System.out.println("enter 2. for mobile phones");
        System.out.println("enter 3. for other electronics");
        System.out.println("enter 4. to go to previous menu");
        System.out.println("enter 5. to exit");
        System.out.println("enter your choice ");
        int input=Integer.parseInt(mr.readLine());switch(input)
        {case 1:obj.tv();break;case 2:obj.mob();break;case 3:obj.oth();break;
            case 4:flip();break;case 5:System.exit(0);break;default:System.out.println("Invalid try again");elec();
        }}

    public void ace() throws IOException//Method 3 begining
    {BufferedReader mr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter 1. for  men");
        System.out.println("enter 2. for  women");
        System.out.println("enter 3. to go to previous menu");
        System.out.println("enter 4. to exit");
        System.out.println("enter your choice ");
        int input=Integer.parseInt(mr.readLine());switch(input)
        {case 1:obj2.men();break;case 2:obj2.women();break;
            case 3:flip();break;case 4:System.exit(0);break;default:System.out.println("Invalid try again");ace();
        }}

    public void kit() throws IOException//method 4 begining
    {BufferedReader mr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter 1. for kitchen Electronics");
        System.out.println("enter 2. for kitchen utensils");
        System.out.println("enter 3. to go to previous menu");
        System.out.println("enter 5. to exit");
        System.out.println("enter your choice ");
        int input=Integer.parseInt(mr.readLine());switch(input)
        {case 1:obj3.kitelec();break;case 2:obj3.kitutil();break;
            case 3:flip();break;case 4:System.exit(0);break;default:System.out.println("Invalid try again");kit();
        }}

    public void info() throws IOException//method 5 begining
    {BufferedReader mr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter 1. for Books");
        System.out.println("enter 2. for CD and DvD");
        System.out.println("enter 3. to go to previous menu");
        System.out.println("enter 4. to exit");
        System.out.println("enter your choice ");
        int input=Integer.parseInt(mr.readLine());switch(input)
        {case 1:obj4.Books();break;case 2:obj4.Cd();break;
            case 3:flip();break;case 4:System.exit(0);break;default:System.out.println("Invalid try again");info();
        }}
}