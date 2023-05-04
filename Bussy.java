package bussy;
import java.util.Scanner;
public class Bussy {

    public static void main(String[] args) {
        Scanner sex=new Scanner(System.in);
        //du vet vad variablar är mannen
        
        final int datår = 2023;
        final int datmån = 04;
        final int datdag = 01;
        String kön;
        boolean ny=true;
        boolean betal=false;
        boolean plats=false;
        int konstig=0;
        String[] hamburger = new String[5];
        /*//test
        String test = "123abc";
        
        System.out.println(test.matches("\\d+"));
        //test*/
        for(int a=1;a<36; a++){
        //allt under är att välja grejor ba
        boolean valet=true;
        while(valet){
        System.out.println("1. registrera\n2. sök\n3.");
        String rumpa=sex.nextLine();
        switch(rumpa)
        {
            case "registrera" -> {ny=true; valet=false;}
            case "1" -> {ny=true; valet=false;}
            default -> System.out.println("välj något annat tack");
            
        }}
        
        //allt över är att välja grejor ba
        //allt under typ är för person reg

        while(ny){
        //en algoritm för att få in personuppgifterna i en array så att det kan injekteras i plats stället
        //den kommer skrivas över för att icke betalande kunder behöver inte sparas
        //så johan om du inte än fattat så över skrids bara hamburger variabeln för varje person som skriver
        String anal ="sex";
        
        System.out.println("personuppgift:");
        for(int i=0; i<4; i++)
        {
            switch (i) {
                case 0 -> System.out.println("personnummer (yyyymmddxxxx)");
                case 1 -> System.out.println("FÖRNAMN:");
                case 2 -> System.out.println("EFTERNAMN:");
                case 3 -> {
                    System.out.println("KÖN:\nMAN KVINNA  ANNAT");
                    anal=sex.next();
                    
                    switch(anal.toLowerCase())                    {
                        case "man" -> kön=anal;
                        case "kvinna" -> kön=anal;
                        case "annat" -> kön=anal;
                        default -> {System.out.println("skriv in ett giltigt val"); i=2;}
                    }
                }
                //default -> {i=0;}
                
            }
            
            if(i!=3){
            hamburger[i] = sex.nextLine();
            }
            else if(i==3){hamburger[3]=anal;}
            if(i==0){
            String txt=hamburger[0];
            
            if(txt.length()!=12||!txt.matches("\\d+")){
            i=-1;//den här if satsen gör bara så att om personnumret inte är 8 charactärer långt så måste man skriva om det
                System.out.println("skriv om personnumret tack");
            }}
        }
        //deklarerar åldern på person nummer hamburger
        //här med hjälp av året endast
        String assy=hamburger[0].substring(0,8);
        String ass=assy.substring(0,4);
        int aldr= datår-Integer.parseInt(ass);
        //sedan jämförs månaderna och om man är äldre än månaden så är allt lunch(lugnt) och åldern stannar annars så sjunker den med 1
        if(datmån<Integer.parseInt(assy.substring(4,6)))
        {
            aldr-=1;
        }else if(datdag<Integer.parseInt(assy.substring(6,8)))
        {
            aldr-=1;
        }
        hamburger[4]=Integer.toString(aldr); 
            System.out.println(assy.substring(0,4)+" "+assy.substring(4,6)+" "+assy.substring(6,8));
        for(int i=0; i<5; i++)
        {
            System.out.println(hamburger[i]);
        }
        ny=false;
        }//allt över är för person reg
                //skapar en vadå typ multipel array i 2d då int lon och lat är array rows och coloumns respektive
                
                // från roe, detta suger snälla sluta allokera minne som inte behöver användas pls jag får anti-stånd
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

          
          
          //allt under är för placeringar och betalning
          
          
          if(Integer.parseInt(hamburger[4])<18||Integer.parseInt(hamburger[4])>69){
              konstig=1;
              System.out.println("du är tyvärr inte i åldern att välja plats själv\nskulle du vilja fortsätta till betalningen?\n\nja/nej");
              String fötter=sex.next();
              boolean q=true;
              while(q){
               switch(fötter.toLowerCase())
               {
                   case "ja" , "j" -> {q=false; betal=true;}
                //    case "j" -> {q=false; betal=true;}
                   case "nej" , "n" ->{q=false; System.out.println("du blir nu skickad till startmenyn");}
                //    case "n"->{q=false; System.out.println("du blir nu skickad till startmenyn");}
                   default -> System.out.println("snälla skriv in \"ja\"/\"nej\"");
               }
          }sex.nextLine();
          } while(betal){
              if(konstig==1){
                  System.out.println("är du redo att betala 299,90:- ? \n ja/nej");
              }
              String lår=sex.next();
              switch(lår.toLowerCase())
              {
                case "ja" , "j" ->{plats=true; System.out.println("tack så mycket för ert betalande");}
                case "nej" , "n" -> {betal=false; System.out.println("du blir nu skickad till startmenyn");}
              }
              String tår=sex.next();
              System.out.println
              ("""
                      
              
                      """);
              
              


            //   switch(tår)
            //   {
            //     case 
            //   }
          }
          
        }
    }
}