import java.io.*;
public class Acessories
{public void men()throws IOException
{Flip obj5=new Flip();
    BufferedReader dr = new BufferedReader(new InputStreamReader(System.in));
    System.out.print('\u000C');
System.out.println("enter 1. for tops");
System.out.println("enter 2. for bottoms");
System.out.println("enter 3. to go to previous menu");
System.out.println("enter 4. to exit");
System.out.println("enter your choice ");
int input=Integer.parseInt(dr.readLine());switch(input){   
case 1:tops();break;case 2:bottom();break;case 3:obj5.ace();break;
case 4:System.exit(0);break;default :System.out.println("invalid try again");men();break;}
}
public void tops()throws IOException
{Flip obj5=new Flip();
    BufferedReader dr = new BufferedReader(new InputStreamReader(System.in));
System.out.print('\u000C');
System.out.println("enter 1. for hats,glasses,chains etc.");
System.out.println("enter 2. for shirts");
System.out.println("enter 3. to go to previous menu");
System.out.println("enter 4. to exit");
System.out.println("enter your choice ");
int input=Integer.parseInt(dr.readLine());switch(input){
case 1:hats();break;case 2:shirts();break;case 3:men();break;
case 4:System.exit(0);break;default :System.out.println("invalid try again");tops();break;}
}
public void hats()throws IOException
{BufferedReader dr = new BufferedReader(new InputStreamReader(System.in));Flip obj5=new Flip();
 int co,cou;
System.out.print('\u000C');
System.out.println("Arabian (hat 1)                   \t product costs   Rs.20");
System.out.println("American boy (hat 2)              \t product costs   Rs.15");
System.out.println("Michael jackson (hat 3)           \t product costs   Rs.40");
System.out.println("puma puma hand (band 1)           \t product costs   Rs.60");
System.out.println("puma white hand (band 2)          \t product costs   Rs.65");
System.out.println("puma flags hand (band 3)          \t product costs   Rs.70");
System.out.println("Addidas white hand (band 4)       \t product costs   Rs.50");
System.out.println("Addidas sport hand (band 5)       \t product costs   Rs.55");
System.out.println("Addidas lamda hand (band 6)       \t product costs   Rs.85");
System.out.println("Reebok sky cooling (glasses 1)    \t product costs   Rs.100");
System.out.println("Reebok dark cooling (glasses 2)   \t product costs   Rs.125");
System.out.println("Reebok bright cooling (glasses 3) \t product costs   Rs.130");
System.out.println("Addidas K letter (chain 1)        \t product costs   Rs.200");
System.out.println("Addidas cool (chain 2)            \t product costs   Rs.250");
System.out.println("Addidas million dollad replica (chain 3)         \t product costs   Rs.300");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(dr.readLine());
if(co==1){Add obj=new Add();obj.add();
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(dr.readLine());
if(cou==1){obj5.ace();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0);	}else if(co==2)tops();}
public void shirts()throws IOException
{BufferedReader dr = new BufferedReader(new InputStreamReader(System.in));
int co,cou;Flip obj5=new Flip();
System.out.print('\u000C');
System.out.println("Reebok hulk (Shirt 1)                   \t product costs   Rs.1,200");
System.out.println("Reebok tony stark (Shirt 2)             \t product costs   Rs.1,500");
System.out.println("Reebok batman pull over (Shirt 3)       \t product costs   Rs.2,500");
System.out.println("Adiads zombheans pull over (Shirt 4)    \t product costs   Rs.2,000");
System.out.println("Adiads black sewt (Shirt 5)             \t product costs   Rs.3,000");
System.out.println("Adiads Green Lanturn swet (Shirt 6)     \t product costs   Rs.3,500");
System.out.println("nike boom (Shirt 7)                     \t product costs   Rs.1,500");
System.out.println("nike sky high (Shirt 8)                 \t product costs   Rs.2,000");
System.out.println("nike no smooking!!! (Shirt 9)           \t product costs   Rs.600");
System.out.println("wranglur back lit (Shirt 10)            \t product costs   Rs.500");
System.out.println("wranglur frount lit (Shirt 11)          \t product costs   Rs.1,700");
System.out.println("wranglur drone pull over (Shirt 12)     \t product costs   Rs.1,500");
System.out.println("wranglur Sri vani pull over (Shirt 13)  \t product costs   Rs.3,000");
System.out.println("wranglur dance sewt (Shirt 14)          \t product costs   Rs.2,000");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(dr.readLine());
if(co==1){Add obj=new Add();obj.add();
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(dr.readLine());
if(cou==1){obj5.ace();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0);	}else if(co==2)tops();
}public void bottom()throws IOException
{Flip obj5=new Flip();
BufferedReader dr = new BufferedReader(new InputStreamReader(System.in));
System.out.print('\u000C');
System.out.println("enter 1. for shoe,belts etc.");
System.out.println("enter 2. for pants,shorts etc");
System.out.println("enter 3. to go to previous menu");
System.out.println("enter 4. to exit");
System.out.println("enter your choice ");
int input=Integer.parseInt(dr.readLine());switch(input){
case 1:shoe();break;case 2:shorts();break;case 3:obj5.ace();break;
case 4:System.exit(0);break;default :System.out.println("invalid try again");men();break;}
}
public void shoe()throws IOException
{BufferedReader dr = new BufferedReader(new InputStreamReader(System.in));
int co,cou;Flip obj5=new Flip();
System.out.println("Reebok zigzak (Shoe 1)       \t product costs   Rs.2,000");
System.out.println("Reebok bottom jelly (Shoe 2) \t product costs   Rs.1,500");
System.out.println("Reebok dark knight (Shoe 3)  \t product costs   Rs.1,000");
System.out.println("Adiads white knight (Shoe 4) \t product costs   Rs.2,500");
System.out.println("Adiads simple kinght (Shoe 5)\t product costs   Rs.3,000");
System.out.println("Adiads fast renner (Shoe 6)  \t product costs   Rs.500");
System.out.println("nike slow walker (Shoe 7)    \t product costs   Rs.750");
System.out.println("nike medium jogger (Shoe 8)  \t product costs   Rs.800");
System.out.println("nike snake (Shoe 9)          \t product costs   Rs.1,200");
System.out.println("Puma cobra (belt 1)          \t product costs   Rs.150");
System.out.println("Reebok lion (belt 2)         \t product costs   Rs.120");
System.out.println("Adidas pegasus (belt 3)      \t product costs   Rs.300");
System.out.println("");System.out.println("Pr ess 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(dr.readLine());
if(co==1){Add obj=new Add();obj.add();
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(dr.readLine());
if(cou==1){obj5.ace();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0);	}else if(co==2)bottom();
	}
public void shorts()throws IOException
{BufferedReader dr = new BufferedReader(new InputStreamReader(System.in));
int co,cou;Flip obj5=new Flip();
System.out.println("Reebok short (Shorts 1)        \t product costs   Rs.600");
System.out.println("Reebok black (Shorts 2)        \t product costs   Rs.650");
System.out.println("Reebok white (Shorts 3)        \t product costs   Rs.500");
System.out.println("Adiads sport (Shorts 4)        \t product costs   Rs.625");
System.out.println("Adiads man (Shorts 5)          \t product costs   Rs.1,000");
System.out.println("Adiads manned (Shorts 6)       \t product costs   Rs.1,150");
System.out.println("nike figure (Shorts 7)         \t product costs   Rs.1,500");
System.out.println("nike intense battle (Shorts 8) \t product costs   Rs.350");
System.out.println("nike teaser (Shorts 9)         \t product costs   Rs.400");
System.out.println("puma panther (pants 1)         \t product costs   Rs.1,700");
System.out.println("puma strong (pants 2)          \t product costs   Rs.1,650");
System.out.println("puma black (pants 3)           \t product costs   Rs.800");
System.out.println("wrangler modern (pants 4)      \t product costs   Rs.2,000");
System.out.println("wrangler fashion (pants 5)     \t product costs   Rs.2,500");
System.out.println("wrangler extereme (pants 6)    \t product costs   Rs.2,750");
System.out.println("nike slick (pants 7)           \t product costs   Rs.3,000");
System.out.println("nike old (pants 8)             \t product costs   Rs.3,250");
System.out.println("nike  gold (pants 9)           \t product costs   Rs.1,000");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(dr.readLine());
if(co==1){Add obj=new Add();obj.add();
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(dr.readLine());
if(cou==1){obj5.ace();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0);	}else if(co==2)bottom();
}   
public void women()throws IOException
{Flip obj5=new Flip();int co,cou;
BufferedReader dr = new BufferedReader(new InputStreamReader(System.in));
System.out.print('\u000C');
System.out.println("enter 1. for Sarees");
System.out.println("enter 2. for Traditional function ware");
System.out.println("enter 3. for Tops");
System.out.println("enter 4. for bottoms");
System.out.println("enter 5. to go to previous menu");
System.out.println("enter 6. to exit");
System.out.println("enter your choice ");
int input=Integer.parseInt(dr.readLine());switch(input){   
case 1:
System.out.println("ilkal (saree 1)     \t product costs   Rs.1,000");
System.out.println("ilkal (saree 2)     \t product costs   Rs.720");
System.out.println("ilkal (saree 3)     \t product costs   Rs.2,500");
System.out.println("kanjivaram (saree 4)\t product costs   Rs.3,000");
System.out.println("kanjivaram (saree 5)\t product costs   Rs.3,500");
System.out.println("kanjivaram (saree 6)\t product costs   Rs.4,000");
System.out.println("designer (saree 7)  \t product costs   Rs.10,000");
System.out.println("designer (saree 8)  \t product costs   Rs.12,000");
System.out.println("designer (saree 9)  \t product costs   Rs.6,000");
System.out.println("designer (saree 10) \t product costs   Rs.50,000");
System.out.println("cotton (saree 11)   \t product costs   Rs.1,000");
System.out.println("cotton (saree 12)   \t product costs   Rs.,1,000");
System.out.println("Synthetic (saree 13)\t product costs   Rs.300");
System.out.println("Synthetic (saree 14)\t product costs   Rs.750");
System.out.println("Synthetic (saree 15)\t product costs   Rs.500");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(dr.readLine());
if(co==1){Add obj=new Add();obj.add();
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(dr.readLine());
if(cou==1){obj5.ace();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0);	}else if(co==2)women();
break;
case 2:
System.out.println("anarkali (dress 1)      \t product costs   Rs.5,000");
System.out.println("anarkali (dress 2)      \t product costs   Rs.8,000");
System.out.println("anarkali (dress 3)      \t product costs   Rs.9,000");
System.out.println("anarkali (dress 4)      \t product costs   Rs.10,000");
System.out.println("kurthi (dress 5)        \t product costs   Rs.2,000");
System.out.println("kurthi (dress 6)        \t product costs   Rs.5,000");
System.out.println("kurthi (dress 7)        \t product costs   Rs.1,500");
System.out.println("kurthi (dress 8)        \t product costs   Rs.8,000");
System.out.println("salwar kameez (dress 9) \t product costs   Rs.850");
System.out.println("salwar kameez (dress 10)\t product costs   Rs.650");
System.out.println("salwar kameez (dress 11)\t product costs   Rs.200");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(dr.readLine());
if(co==1){Add obj=new Add();obj.add();
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(dr.readLine());
if(cou==1){obj5.ace();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0);	}else if(co==2)women();
break;
case 3:wtop();break;case 4:wbottom();break;case 5:obj5.ace();break;
case 6:System.exit(0);break;default :System.out.println("invalid try again");women();break;}
}
public void wtop()throws IOException
{Flip obj5=new Flip();int co,cou;
BufferedReader dr = new BufferedReader(new InputStreamReader(System.in));
System.out.print('\u000C');
System.out.println("enter 1. for tops ");
System.out.println("enter 2. for modern dress");
System.out.println("enter 3. to go to previous menu");
System.out.println("enter 4. to exit");
System.out.println("enter your choice ");
int input=Integer.parseInt(dr.readLine());switch(input){   
case 1:
System.out.println("tank (top 1)                 \t product costs   Rs.60 ");
System.out.println("sleevless  (top 2)           \t product costs   Rs.100");
System.out.println("harp (top 3)                 \t product costs   Rs.250");
System.out.println("colour flower (top 4)        \t product costs   Rs.140");
System.out.println("colour cocktail (top 5)      \t product costs   Rs.300");
System.out.println("peterpan collar (top 6)      \t product costs   Rs.900");
System.out.println("poly georgette (top 7)       \t product costs   Rs.50");
System.out.println("Asymmetrical Tye Dye  (top 8)\t product costs   Rs.75");
System.out.println("Mandarin Collar (top 9)      \t product costs   Rs.125");
System.out.println("Addidas girls (top 10)       \t product costs   Rs.175");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(dr.readLine());
if(co==1){Add obj=new Add();obj.add();
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(dr.readLine());
if(cou==1){obj5.ace();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0);	}else if(co==2)bottom();
break;
case 2:
System.out.println("Pleat Sleeves Leopard Skater (modern 1)              \t product costs   Rs.2,000");
System.out.println("Red Maxi Dress With Twist Detail (modern 2)          \t product costs   Rs.5,000");
System.out.println("Sequin Trim Detail Peplum Dress (modern 3)           \t product costs   Rs.7,000");
System.out.println("Color Cocktail Navy & Lt.Grey Dress (modern 4)       \t product costs   Rs.1,500");
System.out.println("H Straps Conjoined Floral Jumpsuit (modern 5)        \t product costs   Rs.3,000");
System.out.println("Sequined High Low Prom Dress (modern 6)              \t product costs   Rs.4,000");
System.out.println("Charlie Cut-Out Back Detail Midi Dress Red (modern 7)\t product costs   Rs.2,500");
System.out.println("One-Shoulder Tiger Print Mini Dress In Red (modern 8)\t product costs   Rs.1000");
System.out.println("Open Back Lace Dress (modern 9)                      \t product costs   Rs.3,500");
System.out.println("Mishka Yellow Dress (modern 10)                      \t product costs   Rs.2,500");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(dr.readLine());
if(co==1){Add obj=new Add();obj.add();
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(dr.readLine());
if(cou==1){obj5.ace();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0);	}else if(co==2)bottom();
break;case 3:women();break;case 4:System.exit(0);break;default :System.out.println("invalid try again");wtop();break;}
}
public void wbottom()throws IOException
{Flip obj5=new Flip();int co,cou;
BufferedReader dr = new BufferedReader(new InputStreamReader(System.in));
System.out.print('\u000C');
System.out.println("enter 1. for trousers ");
System.out.println("enter 2. for leggings");
System.out.println("enter 3. for Skirts");
System.out.println("enter 4. to go to previous menu");
System.out.println("enter 5. to exit");
System.out.println("enter your choice ");
int input=Integer.parseInt(dr.readLine());switch(input){   
case 1:
System.out.println("harpa bottom (trousers 1)          \t product costs   Rs.500");
System.out.println("harpa flowers (trousers 2)         \t product costs   Rs.600");
System.out.println("puma dark grey (trousers 3)        \t product costs   Rs.1,750");
System.out.println("dream berry (trousers 4)           \t product costs   Rs.425");
System.out.println("Addidas cotton blue (trousers 5)   \t product costs   Rs.900");
System.out.println("addidas jet black (trousers 6)     \t product costs   Rs.650");
System.out.println("Reebok flowers (trousers 7)        \t product costs   Rs.780");
System.out.println("puma red (trousers 8)              \t product costs   Rs.920");
System.out.println("Reebok yellow (trousers 9)         \t product costs   Rs.630");
System.out.println("nike sky blue (trousers 10)        \t product costs   Rs.450");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(dr.readLine());
if(co==1){Add obj=new Add();obj.add();
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(dr.readLine());
if(cou==1){obj5.ace();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0);	}else if(co==2)bottom();
break;
case 2:
System.out.println("eye candy (leggings 1)           \t product costs   Rs.50");
System.out.println("red candy (leggings 2)           \t product costs   Rs.80");
System.out.println("black jet tight (leggings 3)     \t product costs   Rs.150");
System.out.println("women hood (leggings 4)          \t product costs   Rs.200");
System.out.println("man bender skin (leggings 5)     \t product costs   Rs.250");
System.out.println("worrior women golden (leggings 6)\t product costs   Rs.300");
System.out.println("low risk (leggings 7)            \t product costs   Rs.100");
System.out.println("white ground pony (leggings 8)   \t product costs   Rs.600");
System.out.println("blue fashion thicken (leggings 9)\t product costs   Rs.420");
System.out.println("Metallic scale vein (leggings 10)\t product costs   Rs.230");
  System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(dr.readLine());
if(co==1){Add obj=new Add();obj.add();
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(dr.readLine());
if(cou==1){obj5.ace();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0);	}else if(co==2)bottom();
break;
case 3:
System.out.println("happy hour (skirt 1)                \t product costs   Rs.80");
System.out.println("lime green floral (skirt 2)         \t product costs   Rs.90");
System.out.println("coral borwn floral (skirt 3)        \t product costs   Rs.50");
System.out.println("squad grid knitted (skirt 4)        \t product costs   Rs.150");
System.out.println("new fashion thick fold (skirt 5)    \t product costs   Rs.200");
System.out.println("white black stripped black (skirt 6)\t product costs   Rs.250");
System.out.println("Elasticity golden ranger (skirt 7)  \t product costs   Rs.220");
System.out.println("Luke black (skirt 8)                \t product costs   Rs.300");
System.out.println("pink godess (skirt 9)               \t product costs   Rs.150");
System.out.println("wonder women (skirt 10)             \t product costs   Rs.800");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(dr.readLine());
if(co==1){Add obj=new Add();obj.add();
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(dr.readLine());
if(cou==1){obj5.ace();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0);	}else if(co==2)bottom();
break;
case 4:women();break;case 5:System.exit(0);break;default :System.out.println("invalid try again");wtop();break;}}
}