package bussy;
import java.util.Scanner;
public class Bussy {

    public static void main(String[] args) {
        Scanner sex=new Scanner(System.in);
        
        //en algoritm för att få in personuppgifterna i en array så att det kan injekteras i plats stället
        //den kommer skrivas över för att icke betalande kunder behöver inte sparas
        String kön;
        System.out.println("personuppgift:");
        for(int i=0; i<4; i++)
        {
            if(i==0){System.out.println("personnummer (yyyymmdd-xxxx)");
            }
            else if(i==1){System.out.println("FÖRNAMN:");}
            else if(i==2){System.out.println("EFTERNAMN:");}
            else if(i==3){System.out.println("KÖN:\nMAN KVINNA  ANNAT");
             
                String anal=sex.next();
                switch(anal)
                {
                    case "man" -> kön=anal;
                    case "kvinna" -> kön=anal;
                    case "annat" -> kön=anal;
                    default -> {System.out.println("skriv in ett giltigt val"); i=3;}
                }
            }
            String[]hamburger = new String[5];
            if(i!=3){
            hamburger[i] = sex.next();
            }else if(1==3){hamburger[3]=kön;}
            if(i==0){
            String txt=hamburger[0];
            
            if(txt.length()!=12){
            i=-1;//den här if satsen gör bara så att om personnumret inte är 8 charactärer långt så måste man skriva om det
                System.out.println("skriv om personnumret tack");
            }}
        }

                //skapar en vadå typ multipel array i 2d då int lon och lat är array rows och coloumns respektive
        int lon=4;//det blir 5 coloumner
        int lat=20;
        //själva array coloumns
        String[][] bein = new String[lon][];
        //och array rows
        for(int i=0;i<lon;i++)
        {
            bein[i] = new String[lat];
        }
        
        
        System.out.println(bein[0][0]);
        
    }
     
}