package bussy;
import java.util.Scanner;
public class Bussy {

    public static void main(String[] args) {
        Scanner sex=new Scanner(System.in);
        String anal ="sex";
        final int datår = 2023;
        final int datmån = 04;
        final int datdag = 01;
        String kön;
        boolean ny=true;
        while(ny){
        //en algoritm för att få in personuppgifterna i en array så att det kan injekteras i plats stället
        //den kommer skrivas över för att icke betalande kunder behöver inte sparas
        String[]hamburger = new String[5];
        System.out.println("personuppgift:");
        for(int i=0; i<4; i++)
        {
            switch (i) {
                case 0:
                    System.out.println("personnummer (yyyymmdd-xxxx)");
                    break;
                case 1:
                    System.out.println("FÖRNAMN:");
                    break;
                case 2:
                    System.out.println("EFTERNAMN:");
                    break;
                case 3:
                    System.out.println("KÖN:\nMAN KVINNA  ANNAT");
                    anal=sex.next();
                    switch(anal)
                    {
                        case "man" -> kön=anal;
                        case "kvinna" -> kön=anal;
                        case "annat" -> kön=anal;
                        default -> {System.out.println("skriv in ett giltigt val"); i=3;}
                    }   break;
                default:
                    break;
            }
            
            if(i!=3){
            hamburger[i] = sex.next();
            }
            else if(i==3){hamburger[3]=anal;}
            if(i==0){
            String txt=hamburger[0];
            
            if(txt.length()!=12){
            i=-1;//den här if satsen gör bara så att om personnumret inte är 8 charactärer långt så måste man skriva om det
                System.out.println("skriv om personnumret tack");
            }}
        }
        
        for(int i=0; i<4; i++){
            System.out.println(hamburger[i]);
        }
        ny=false;
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
        
        
        //System.out.println(bein[0][0]);
        
    }
     
}