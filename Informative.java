import java.io.*;
public class Informative
{public void Books() throws IOException//method 1 begining
{int co,cou;
Flip obj5=new Flip();
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print('\u000C');
System.out.println("enter 1. for comedy Books");
System.out.println("enter 2. for action novels");
System.out.println("enter 3. for horror novels");
System.out.println("enter 4. for fantasy novels");
System.out.println("enter 5. for Romantic novels");
System.out.println("enter 6. for Biography and Autobiography");
System.out.println("enter 7. to go to previous menu");
System.out.println("enter 8. to exit");
int input=Integer.parseInt(br.readLine());switch(input)
{case 1:
System.out.println("Good omens (book 1)                         \t product costs   Rs.1,000");
System.out.println("The Hippopotomas (book 2)                   \t product costs   Rs.1,000");
System.out.println("scoop (book 3)                              \t product costs   Rs.1,000");
System.out.println("The dictator (book 4)                       \t product costs   Rs.1,000");
System.out.println("Akbar and Birbal series (book 5)            \t product costs   Rs.1,500");
System.out.println("black mischief series (book 6)              \t product costs   Rs.1,300");
System.out.println("101 pranks series (book 7)                  \t product costs   Rs.1,700");
System.out.println("500 jokes series (book 8)                   \t product costs   Rs.2,000");
System.out.println("supandhi (book 9)                           \t product costs   Rs.2,500");
System.out.println("Adventures of Tenali Raman series (book 10) \t product costs   Rs.3,000");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(br.readLine());
if(co==1){Add obj=new Add();obj.add();if (Add.flag==0)System.out.println("product not avilable");
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(br.readLine());
if(cou==1){obj5.info();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0); }else if(co==2)obj5.info();break;
case 2:
System.out.println("Eragon (book 11)                                  \t product costs   Rs.650");
System.out.println("Eldest (book 12)                                  \t product costs   Rs.750");
System.out.println("Brazinger (book 13)                               \t product costs   Rs.850");
System.out.println("Inheritance (book 14)                             \t product costs   Rs.1,000");
System.out.println("Hardy boys The Whale Tatoo (book 15)              \t product costs   Rs.450");
System.out.println("Hardy boys The Secreate of the caves (book 16)    \t product costs   Rs.450");
System.out.println("Hardy boys The clock tower treasures (book 17)    \t product costs   Rs.450");
System.out.println("Hardy boys The Secreate of the old mail (book 18) \t product costs   Rs.450");
System.out.println("Hardy boys Mystery of the samurai sword (book 19) \t product costs   Rs.450");
System.out.println("Sherlock homes adventures (book 20)               \t product costs   Rs.3,000");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(br.readLine());
if(co==1){Add obj=new Add();obj.add();if (Add.flag==0)System.out.println("product not avilable");
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(br.readLine());
if(cou==1){obj5.info();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0); }else if(co==2)obj5.info();break;
case 3:
System.out.println("Dracula (book 21)       \t product costs   Rs.600");
System.out.println("Pet semitary (book 22)  \t product costs   Rs.890");
System.out.println("I am Legend (book 23)   \t product costs   Rs.200");
System.out.println("The stand (book 24)     \t product costs   Rs.150");
System.out.println("Thinner (book 25)       \t product costs   Rs.620");
System.out.println("Hell House (book 26)    \t product costs   Rs.1,000");
System.out.println("The talismen (book 27)  \t product costs   Rs.900");
System.out.println("The terror (book 28)    \t product costs   Rs.400");
System.out.println("Haunted (book 29)       \t product costs   Rs.525");
System.out.println("The rising (book 30)    \t product costs   Rs.255");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(br.readLine());
if(co==1){Add obj=new Add();obj.add();if (Add.flag==0)System.out.println("product not avilable");
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(br.readLine());
if(cou==1){obj5.info();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0); }else if(co==2)obj5.info();break;
case 4:
System.out.println("A game of thrones (book 31)     \t product costs   Rs.900");
System.out.println("The name of the wind (book 32)  \t product costs   Rs.465");
System.out.println("the encyclopedia (book 33)      \t product costs   Rs.456");
System.out.println("American gods (book 34)         \t product costs   Rs.230");
System.out.println("alice in wonderland (book 35)   \t product costs   Rs.125");
System.out.println("a wizard of earthsea (book 36)  \t product costs   Rs.487");
System.out.println("the dark is rising (book 37)    \t product costs   Rs.900");
System.out.println("the worm ouroboros (book 38)    \t product costs   Rs.200");
System.out.println("vampire academy books (book 39) \t product costs   Rs.1,500");
System.out.println("the magicians (book 40)         \t product costs   Rs.200");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(br.readLine());
if(co==1){Add obj=new Add();obj.add();if (Add.flag==0)System.out.println("product not avilable");
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(br.readLine());
if(cou==1){obj5.info();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0); }else if(co==2)obj5.info();break;
case 5:
System.out.println("The Truth About Forever (book 41)   \t product costs   Rs.900");
System.out.println("The Hunger Games (book 42)          \t product costs   Rs.456");
System.out.println("Perfect Chemistry (book 43)         \t product costs   Rs.745");
System.out.println("City of Glass (book 44)             \t product costs   Rs.825");
System.out.println("The Host (book 45)                  \t product costs   Rs.321");
System.out.println("A Walk to Remember (book 46)        \t product costs   Rs.654");
System.out.println("Fallen (book 47)                    \t product costs   Rs.987");
System.out.println("Beautiful Creatures (book 48)       \t product costs   Rs.789");
System.out.println("Marked (book 49)                    \t product costs   Rs.456");
System.out.println("Flipped (book 50)                   \t product costs   Rs.123");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(br.readLine());
if(co==1){Add obj=new Add();obj.add();if (Add.flag==0)System.out.println("product not avilable");
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(br.readLine());
if(cou==1){obj5.info();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0); }else if(co==2)obj5.info();break;
case 6:
System.out.println("The Glass Castle (book 51)                    \t product costs   Rs.147");
System.out.println("The Night Trilogy (book 52)                   \t product costs   Rs.258");
System.out.println("Angela's Ashes (book 53)                      \t product costs   Rs.369");
System.out.println("Into Thin Air (book 54)                       \t product costs   Rs.741");
System.out.println("The gandhi (book 55)                          \t product costs   Rs.852");
System.out.println("Swami vivekananda (book 56)                   \t product costs   Rs.963");
System.out.println("The buddha (book 57)                          \t product costs   Rs.159");
System.out.println("The tird road (book 58)                       \t product costs   Rs.753");
System.out.println("King of POP michael jackson (book 59)         \t product costs   Rs.951");
System.out.println("Worrior of civil war abraham lincoln (book 60)\t product costs   Rs.357");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(br.readLine());
if(co==1){Add obj=new Add();obj.add();if (Add.flag==0)System.out.println("product not avilable");
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(br.readLine());
if(cou==1){obj5.info();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0); }else if(co==2)obj5.info();break;
case 7:obj5.info();break;case 8:System.exit(0);break;default:System.out.println("invalid try again");Books();break;}}
public void Cd() throws IOException//method 1 begining
{int co,cou;
Flip obj5=new Flip();
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print('\u000C');
System.out.println("enter 1. for comedy movies");
System.out.println("enter 2. for action movies");
System.out.println("enter 3. for horror movies");
System.out.println("enter 4. for fantasy movies");
System.out.println("enter 5. for Romantic movies");
System.out.println("enter 6. to go to previous menu");
System.out.println("enter 7. to exit");
int input=Integer.parseInt(br.readLine());switch(input)
{case 1:
System.out.println("Scooby doo series (CD 1)                \t product costs   Rs.90");
System.out.println("Haunted 2 (CD 2)                        \t product costs   Rs.75");
System.out.println("american pie series (CD 3)              \t product costs   Rs.63");
System.out.println("The girl next door (CD 4)               \t product costs   Rs.54");
System.out.println("dodgeball a true underdog story (CD 5)  \t product costs   Rs.58");
System.out.println("the big lebowski (CD 6)                 \t product costs   Rs.89");
System.out.println("the hangover series (CD 7)              \t product costs   Rs.63");
System.out.println("scary movie series (CD 8)               \t product costs   Rs.51");
System.out.println("Up (CD 9)                               \t product costs   Rs.50");
System.out.println("The Ice age series (CD 10)              \t product costs   Rs.34");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(br.readLine());
if(co==1){Add obj=new Add();obj.add();if (Add.flag==0)System.out.println("product not avilable");
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(br.readLine());
if(cou==1){obj5.info();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0); }else if(co==2)obj5.info();break;
case 2:
System.out.println("Batman series (CD 11)               \t product costs   Rs.41");
System.out.println("captain america series (CD 12)      \t product costs   Rs.47");
System.out.println("die hard series (CD 13)             \t product costs   Rs.71");
System.out.println("x men series (CD 14)                \t product costs   Rs.87");
System.out.println("terminator series(CD 15)            \t product costs   Rs.74");
System.out.println("the expendables series(CD 16)       \t product costs   Rs.57");
System.out.println("Now you see me (CD 17)              \t product costs   Rs.65");
System.out.println("mission impossible series(CD 18)    \t product costs   Rs.75");
System.out.println("the matrix series(CD 19)            \t product costs   Rs.65");
System.out.println("Spider man series(CD 20)            \t product costs   Rs.35");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(br.readLine());
if(co==1){Add obj=new Add();obj.add();if (Add.flag==0)System.out.println("product not avilable");
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(br.readLine());
if(cou==1){obj5.info();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0); }else if(co==2)obj5.info();break;
case 3:
System.out.println("the exorcist (CD 21)                    \t product costs   Rs.100");
System.out.println("halloween 1978 (CD 22)                  \t product costs   Rs.56");
System.out.println("texas chainsaw massacre (CD 23)         \t product costs   Rs.87");
System.out.println("a nightmare on elm street (1984) (CD 24)\t product costs   Rs.59");
System.out.println("let the right one in (CD 25)            \t product costs   Rs.96");
System.out.println("the shining (1980) (CD 26)              \t product costs   Rs.35");
System.out.println("alien 1979 (CD 27)                      \t product costs   Rs.64");
System.out.println("paranormal activity (CD 28)             \t product costs   Rs.52");
System.out.println("the evil dead 1981 (CD 29)              \t product costs   Rs.21");
System.out.println("insidious (CD 30)                       \t product costs   Rs.31");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(br.readLine());
if(co==1){Add obj=new Add();obj.add();if (Add.flag==0)System.out.println("product not avilable");
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(br.readLine());
if(cou==1){obj5.info();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0); }else if(co==2)obj5.info();break;
case 4:
System.out.println("Harry Potter series (CD 31)                 \t product costs   Rs.45");
System.out.println("Shoulin socker (CD 32)                      \t product costs   Rs.69");
System.out.println("The lord of rings series(CD 33)             \t product costs   Rs.78");
System.out.println("Mallefecent (CD 34)                         \t product costs   Rs.63");
System.out.println("Oz the great and powerful(CD 35)            \t product costs   Rs.51");
System.out.println("pirates of the caribbean (CD 36)            \t product costs   Rs.21");
System.out.println("the chronicles of narnia series(CD 37)      \t product costs   Rs.46");
System.out.println("the hobbit series(CD 38)                    \t product costs   Rs.77");
System.out.println("Star wars series(CD 39)                     \t product costs   Rs.22");
System.out.println("teenage mutant ninja turtles series(CD 40)  \t product costs   Rs.63");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(br.readLine());
if(co==1){Add obj=new Add();obj.add();if (Add.flag==0)System.out.println("product not avilable");
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(br.readLine());
if(cou==1){obj5.info();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0); }else if(co==2)obj5.info();break;
case 5:
System.out.println("the notebook (CD 41)         \t product costs   Rs.78");
System.out.println("Titanic (CD 42)              \t product costs   Rs.98");
System.out.println("my best friend's girl (CD 43)\t product costs   Rs.65");
System.out.println("fateh (CD 44)                \t product costs   Rs.36");
System.out.println("dear john (CD 45)            \t product costs   Rs.45");
System.out.println("Ashique 2(CD 46)             \t product costs   Rs.63");
System.out.println("the last song (CD 47)        \t product costs   Rs.75");
System.out.println("101 Dolmations (CD 48)       \t product costs   Rs.53");
System.out.println("as good as it gets (CD 49)   \t product costs   Rs.45");
System.out.println("the painted veil (CD 50)     \t product costs   Rs.64");
System.out.println("");System.out.println("Press 1 to add to cart or 2 to go back to the previous menu");
co=Integer.parseInt(br.readLine());
if(co==1){Add obj=new Add();obj.add();if (Add.flag==0)System.out.println("product not avilable");
System.out.println("Press 1 to add more or 2 to bill and exit or 3  to cancel bill and exit ");
cou=Integer.parseInt(br.readLine());
if(cou==1){obj5.info();}else if(cou==2)obj.bill();
else if (cou==3)System.exit(0); }else if(co==2)obj5.info();break;
case 8:obj5.info();break;case 9:System.exit(0);break;default:System.out.println("invalid try again");Cd();break;}}}