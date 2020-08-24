import java.io.*;
public class Electronics            //class begining
{static String R;    
public void tv() throws IOException         //method begining
{BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String sid;int z;
System.out.println(" enter 1 for Samsung tv "); 
System.out.println(" enter 2 for Sony tv ");
System.out.println(" enter 3 for Other tvs' ");
System.out.println(" enter 4 for goging to the previous menu ");
System.out.println("Enter your choice");
sid=br.readLine();
z=Integer.parseInt(sid);
switch (z)            //choice to choose between the tv company and tv acessories
{case 1:samtv();break;
case 2:sontv();break;
case 3:othtv();break;
case 4:Flip obj=new Flip();obj.elec();break;
default:System.out.println("Invalid try again");tv();break; 
}}   //Method ending
public void samtv() throws IOException //Method 2 begining
{String sid;int z,co,cou;BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print('\u000C');
System.out.println(" enter 1 for samsung curved full hd tv "); 
System.out.println(" enter 2 for samsung full hd led tv ");
System.out.println(" enter 3 for samsung full hd lcd tv ");
System.out.println(" enter 4 for goging to the previous menu ");
System.out.println("Enter your choice");
sid=br.readLine();z=Integer.parseInt(sid);
switch(z){case 1:System.out.print('\u000C');
System.out.println("samsung CU78HU9000R curved full hd tv \t product costs   Rs.96,000 ");
System.out.println("samsung CU48H6800AR curved full hd tv \t product costs   Rs.1,20,000");
System.out.println("samsung CU55HU7200R curved full hd tv \t product costs   Rs.1,59,650");
System.out.println("samsung CU85HU8500R curved full hd tv \t product costs   Rs.2,29,650");
System.out.println("samsung CU8000 curved full hd tv      \t product costs   Rs.6,29,900");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(br.readLine());
if(co==1){Add obj=new Add();obj.add();if (Add.flag==0)System.out.println("product not avilable");
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(br.readLine());
if(cou==1){Flip obj5=new Flip();obj5.elec();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0);	}else if(co==2)samtv();break;
case 2 :System.out.print('\u000C');
System.out.println("samsung LE40H4250AR full hd led tv \t product costs   Rs.29,000");
System.out.println("samsung LE48H4250AR full hd led tv \t product costs   Rs.32,000");
System.out.println("samsung LE32H5570AU full hd led tv \t product costs   Rs.48,000");
System.out.println("samsung LE48H5570AU full hd led tv \t product costs   Rs.69,000");
System.out.println("samsung LE40H5570AU full hd led tv \t product costs   Rs.72,000");
System.out.println("samsung LE31H5570AU full hd led tv \t product costs   Rs.84,000");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(br.readLine());
if(co==1){Add obj=new Add();obj.add();if (Add.flag==0)System.out.println("product not avilable");
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(br.readLine());
if(cou==1){Flip obj5=new Flip();obj5.elec();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0);	}else if(co==2)samtv();break;
case 3:
System.out.println(" samsung LC1080M300H full hd lcd tv \t product costs   Rs.10,000");
System.out.println(" samsung LC1080M201H full hd lcd tv \t product costs   Rs.12,000");
System.out.println(" samsung LC1080P720H full hd lcd tv \t product costs   Rs.15,000");
System.out.println(" samsung LC1080R458L full hd lcd tv \t product costs   Rs.22,000");
System.out.println(" samsung LC1080A879K full hd lcd tv \t product costs   Rs.30,000");
System.out.println(" samsung LC1080O222Z full hd lcd tv \t product costs   Rs.59,000");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(br.readLine());
if(co==1){Add obj=new Add();obj.add();if (Add.flag==0)System.out.println("product not avilable");
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(br.readLine());
if(cou==1){Flip obj5=new Flip();obj5.elec();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0);	}else if(co==2)samtv();break;
case 4:
tv();
break;
default :
System.out.println("Invalid input try again");
samtv();
break;
}}
public void sontv() throws IOException
{String sid;int z,co,cou;BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println(" enter 1 for sony curved full hd tv "); 
System.out.println(" enter 2 for sony full hd led tv ");
System.out.println(" enter 3 for sony full hd lcd tv ");
System.out.println(" enter 4 for goging to the previous menu ");
System.out.println("Enter your choice");
sid=br.readLine();
z=Integer.parseInt(sid);
switch(z)
{case 1:
System.out.println("sony CUSD4445A curved full hd tv \t product costs   Rs.85,000");
System.out.println("sony CUSD458LK curved full hd tv \t product costs   Rs.1,56,000");
System.out.println("sony CUSD6974M curved full hd tv \t product costs   Rs.2,69,000");
System.out.println("sony CUSD569SE curved full hd tv \t product costs   Rs.4,98,000");
System.out.println("sony CUSD1080P curved full hd tv \t product costs   Rs.5,10,000");
System.out.println("sony CUSD720PI curved full hd tv \t product costs   Rs.6,32,000");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(br.readLine());
if(co==1){Add obj=new Add();obj.add();if (Add.flag==0)System.out.println("product not avilable");
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(br.readLine());
if(cou==1){Flip obj5=new Flip();obj5.elec();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0);	}else if(co==2)sontv();break;
case 2:
System.out.println("sony LES459PDA full hd led tv \t product costs   Rs.23,000");
System.out.println("sony LES5897FD full hd led tv \t product costs   Rs.34,000");
System.out.println("sony LES1080X7 full hd led tv \t product costs   Rs.45,000");
System.out.println("sony LES720Z45 full hd led tv \t product costs   Rs.60,000");
System.out.println("sony LES120Z56 full hd led tv \t product costs   Rs.68,000");
System.out.println("sony LES520Z29 full hd led tv \t product costs   Rs.72,000");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(br.readLine());
if(co==1){Add obj=new Add();obj.add();if (Add.flag==0)System.out.println("product not avilable");
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(br.readLine());
if(cou==1){Flip obj5=new Flip();obj5.elec();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0);	}else if(co==2)sontv();break;
case 3:
System.out.println("sony LCS500N full hd lcd tv \t product costs   Rs.25,000");
System.out.println("sony LCS650N full hd lcd tv \t product costs   Rs.29,000");
System.out.println("sony LCS320N full hd lcd tv \t product costs   Rs.35,000");
System.out.println("sony LCS510N full hd lcd tv \t product costs   Rs.38,000");
System.out.println("sony LCS592N full hd lcd tv \t product costs   Rs.40,000");
System.out.println("sony LCS998N full hd lcd tv \t product costs   Rs.44,000");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(br.readLine());
if(co==1){Add obj=new Add();obj.add();if (Add.flag==0)System.out.println("product not avilable");
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(br.readLine());
if(cou==1){Flip obj5=new Flip();obj5.elec();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0);	}else if(co==2)sontv();break;
case 4:
tv();
break;
default :
System.out.println("Invalid input try again");
sontv();
break;
}}
public void othtv() throws IOException
{BufferedReader br = new BufferedReader(new InputStreamReader(System.in));String sid;int z,co,cou;
System.out.println(" enter 1 for curved full hd tv "); 
System.out.println(" enter 2 for full hd led tv ");
System.out.println(" enter 3 for full hd lcd tv ");
System.out.println(" enter 4 for goging to the previous menu ");
System.out.println("Enter your choice");
sid=br.readLine();
z=Integer.parseInt(sid);
switch(z)
{case 1:
System.out.println(" LG CU850D curved full hd tv       \t product costs   Rs.86,000");
System.out.println(" LG CU250M curved full hd tv       \t product costs   Rs.2,26,980");
System.out.println(" LG CU100C  curved full hd tv      \t product costs   Rs.8,50,000");
System.out.println(" Toshiba TB5888V curved full hd tv \t product costs   Rs.65,000");
System.out.println(" Toshiba TB5666V curved full hd tv \t product costs   Rs.2,30,000");
System.out.println(" Toshiba TB5777V curved full hd tv \t product costs   Rs.6,32,000");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(br.readLine());
if(co==1){Add obj=new Add();obj.add();if (Add.flag==0)System.out.println("product not avilable");
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(br.readLine());
if(cou==1){Flip obj5=new Flip();obj5.elec();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0);	}else if(co==2)othtv();break;
case 2:
System.out.println("LG  LM890 full hd led tv        \t product costs   Rs.23,000");
System.out.println("LG  LM1080 full hd led tv       \t product costs   Rs.32,000");
System.out.println("LG  LM475 full hd led tv        \t product costs   Rs.34,560");
System.out.println("Toshiba  TB1080L full hd led tv \t product costs   Rs.30,299");
System.out.println("Toshiba  TB1080K full hd led tv \t product costs   Rs.50,590");
System.out.println("Toshiba  TB1080P full hd led tv \t product costs   Rs.80,250");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(br.readLine());
if(co==1){Add obj=new Add();obj.add();if (Add.flag==0)System.out.println("product not avilable");
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(br.readLine());
if(cou==1){Flip obj5=new Flip();obj5.elec();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0);	}else if(co==2)sontv();break;
case 3:
System.out.println("LG LCDG40 full hd lcd tv        \t product costs   Rs.13,200");
System.out.println("LG LCDG50 full hd lcd tv        \t product costs   Rs.15,500");
System.out.println("LG LCDG60  full hd lcd tv       \t product costs   Rs.25,900");
System.out.println("Toshiba TBLCD986 full hd lcd tv \t product costs   Rs.15,200");
System.out.println("Toshiba TBLCD756 full hd lcd tv \t product costs   Rs.20,550");
System.out.println("Toshiba TBLCD210 full hd lcd tv \t product costs   Rs.32,900");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(br.readLine());
if(co==1){Add obj=new Add();obj.add();if (Add.flag==0)System.out.println("product not avilable");
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(br.readLine());
if(cou==1){Flip obj5=new Flip();obj5.elec();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0);	}else if(co==2)sontv();break;
case 4:
tv();
break;
default :
System.out.println("Invalid input try again");
samtv();
break;}}
public void mob() throws IOException
{BufferedReader br = new BufferedReader(new InputStreamReader(System.in));String sid;int z,co,cou;
System.out.println(" enter 1 for samsung smartphone "); 
System.out.println(" enter 2 for apple iphone ");
System.out.println(" enter 3 for nokia windows phone ");
System.out.println(" enter 4 for  other mobile phones");
System.out.println(" enter 5 for goging to the previous menu ");
System.out.println("Enter your choice");
sid=br.readLine();
z=Integer.parseInt(sid);
switch(z)
{case 1 :
System.out.println("Samsung galaxy edge E7000        \t product costs   Rs.80,000");
System.out.println("Samsung galaxy note N100         \t product costs   Rs.10,000");
System.out.println("Samsung galaxy note 2 N200       \t product costs   Rs.20,000");
System.out.println("Samsung galaxy note 3 N300       \t product costs   Rs.40,000");
System.out.println("Samsung galaxy note 4 N400       \t product costs   Rs.70,000");
System.out.println("Samsung galaxy s1 GS100          \t product costs   Rs.1,000");
System.out.println("Samsung galaxy s2 GS200          \t product costs   Rs.5,000");
System.out.println("Samsung galaxy s3 GS300          \t product costs   Rs.15,000");
System.out.println("Samsung galaxy s4 GS400          \t product costs   Rs.28,000");
System.out.println("Samsung galaxy s5 GS500          \t product costs   Rs.35,000");
System.out.println("Samsung galaxy grand GG100       \t product costs   Rs.15,000");
System.out.println("Samsung galaxy grand 2 GG200     \t product costs   Rs.20,000");
System.out.println("Samsung galaxy s duos GSD100     \t product costs   Rs.3,000");
System.out.println("Samsung galaxy star GST200       \t product costs   Rs.10,000");
System.out.println("Samsung galaxy star duos GSTD200 \t product costs   Rs.12,000");
System.out.println("Samsung galaxy ace GA100         \t product costs   Rs.5,000");
System.out.println("Samsung galaxy ace duos GAD100   \t product costs   Rs.8,000");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(br.readLine());
if(co==1){Add obj=new Add();obj.add();if (Add.flag==0)System.out.println("product not avilable");
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(br.readLine());
if(cou==1){Flip obj5=new Flip();obj5.elec();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0);	}else if(co==2)mob();break;
case 2:
System.out.println("iphone 4 IP400  \t product costs   Rs.20,000");
System.out.println("iphone 4s IP400S\t product costs   Rs.32,000");
System.out.println("iphone 5 IP500  \t product costs   Rs.35,000");
System.out.println("iphone 5s IP500S\t product costs   Rs.40,000");
System.out.println("iphone 6 IP600  \t product costs   Rs.50,000");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(br.readLine());
if(co==1){Add obj=new Add();obj.add();if (Add.flag==0)System.out.println("product not avilable");
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(br.readLine());
if(cou==1){Flip obj5=new Flip();obj5.elec();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0);	}else if(co==2)mob();break;
case 3:
System.out.println("nokia lumia NL1020\t product costs   Rs.60,000");
System.out.println("nokia lumia NL1520\t product costs   Rs.50,000");
System.out.println("nokia lumia NL1930\t product costs   Rs.70,000");
System.out.println("nokia lumia NL930 \t product costs   Rs.20,000");
System.out.println("nokia lumia NL680 \t product costs   Rs.15,000");
System.out.println("nokia lumia NL450 \t product costs   Rs.12,000");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(br.readLine());
if(co==1){Add obj=new Add();obj.add();if (Add.flag==0)System.out.println("product not avilable");
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(br.readLine());
if(cou==1){Flip obj5=new Flip();obj5.elec();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0);	}else if(co==2)mob();break;
case 4:
System.out.println("nexus 4 D500               \t product costs   Rs.5,000");
System.out.println("nexus 5 F750               \t product costs   Rs.10,000");
System.out.println("nexus 6 P900               \t product costs   Rs.20,000");
System.out.println("sony xperia z2 XP200       \t product costs   Rs.32,000");
System.out.println("sony xperia z2 ultra XP500 \t product costs   Rs.50,000");
System.out.println("sony xperia M XP100        \t product costs   Rs.41,000");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(br.readLine());
if(co==1){Add obj=new Add();obj.add();if (Add.flag==0)System.out.println("product not avilable");
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(br.readLine());
if(cou==1){Flip obj5=new Flip();obj5.elec();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0);	}else if(co==2)mob();break;
case 5:Flip obj=new Flip();
obj.elec();
break;
default:
System.out.println("invalid try again");mob();break;
}}public void oth() throws IOException
{BufferedReader br = new BufferedReader(new InputStreamReader(System.in));int co,cou;
System.out.println("lenovo yoga AD5630        \t product costs   Rs.50,000");
System.out.println("laptop yoga HJ1080        \t product costs   Rs.55,000");
System.out.println("laptop think pad NB550R   \t product costs   Rs.1,20,000");
System.out.println("laptop tink pad M894ZZ    \t product costs   Rs.1,50,000");
System.out.println("logitec Z90 mouse         \t product costs   Rs.4,000");
System.out.println("logitec X500 mouse        \t product costs   Rs.8,000");
System.out.println("logetic MK300 keyboard    \t product costs   Rs.3,000");
System.out.println("logitec MK201 keyboard    \t product costs   Rs.5,000");
System.out.println("logitec S550 Speakers     \t product costs   Rs.2,000");
System.out.println("logitec XMS200 Speakers   \t product costs   Rs.650");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(br.readLine());
if(co==1){Add obj=new Add();obj.add();if (Add.flag==0)System.out.println("product not avilable");
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(br.readLine());
if(cou==1){Flip obj5=new Flip();obj5.elec();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0);	}else if(co==2)oth();}}
