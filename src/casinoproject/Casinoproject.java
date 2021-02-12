
package casinoproject;
import java.util.Scanner; 
import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
public class Casinoproject {

    public static Scanner input = new Scanner(System.in);
    public static Random rand = new Random();
    public static int TotalMoney = 100;
    
    public static void main(String[] args) {
       while (true){
           System.out.println("There are three different casino games to choose from Horse Racing(1), Roulette(2), Higher or Lower(3), To exit click(0) ");
           System.out.println("Please note playing Roulette has incrediblely low winning rates  ");
           int Chosen = input.nextInt();
           switch (Chosen) {
                   case 1:
                    HorseRacing();
                    break;
                   case 2:
                       Roulette();
                       break;
                   case 3:
                       HigherOrLower();
                       break;
                   case 0:
                  Exit();
                  break;
                       
       }
       }
       
                  
           
    
   
       
    }
     public static void HorseRacing(){
         if (TotalMoney == 0){
             TotalMoney = TotalMoney + 10;
         }
     String[] Horses = {"Horse (1) +100% if they win the race","Horse (2) +50% if they win the race","Horse (3) +25% if they win the race","Horse (4) + 10% if they win the race"};
     double H1speed = rand.nextInt(10);
     double H2speed = rand.nextInt(20);
     double H3speed = rand.nextInt(30);
     double H4speed = rand.nextInt(40);
     double distance = 1.6;
     double H1Time = H1speed * distance;
     double H2Time = H2speed * distance;
     double H3Time = H3speed * distance;
     double H4Time = H4speed * distance;
         System.out.println("Would you like to bet on a horse?");
         String YorN = input.next();
         if (YorN.equals("Yes")){
             System.out.println("Which Horse would you like to bet on Please note Higher profit horses have lower chances of winning" + Arrays.toString(Horses));
             int HorseToBet = input.nextInt();
             System.out.println("How much money would you like to bet? You have: " + TotalMoney);
             int MoneyToBet = input.nextInt();
             while(MoneyToBet>TotalMoney || MoneyToBet<0){
                 System.out.println("Incorrect bet");
                 System.out.println("How much money would you like to bet? You have: " + TotalMoney);
                 MoneyToBet = input.nextInt();
             }
              switch(HorseToBet){
                 case 1:
                     System.out.println("You have chosen Horse 1 and have placed " + MoneyToBet + " on this Horse");
                   if (H1Time < H2Time && H1Time < H3Time && H1Time < H4Time){
                       int DoubleMoney = MoneyToBet * 2;
                        TotalMoney = TotalMoney + DoubleMoney;
                       System.out.println("Horse 1 has won the race"
                               + " you've now got:" + TotalMoney );
                   }
                   else{
                       System.out.println("You've lost"
                               +"Horse 1 time was: " + H1Time +
                               "Horse 2 time was: "+ H2Time +
                               "Horse 3 time was: " + H3Time +
                               "Horse 4 time was: " + H4Time );
                       TotalMoney = TotalMoney - MoneyToBet;
                       System.out.println("You still have:" + TotalMoney);
                   }
                     break;
                 case 2:
                     System.out.println("You have chosen Horse 2 and have placed " + MoneyToBet + " on this Horse");
                   if (H2Time < H1Time && H2Time < H3Time && H2Time < H4Time){
                        int HalfMoney = MoneyToBet + (MoneyToBet/2);
                        TotalMoney = TotalMoney+HalfMoney;
                       System.out.println("Horse 2 has won the race"
                               + " you've now got:" + TotalMoney );
                       
                   }
                   else{
                       System.out.println("You've lost"
                               +"Horse 1 time was: " + H1Time +
                               "Horse 2 time was: "+ H2Time +
                               "Horse 3 time was: " + H3Time +
                               "Horse 4 time was: " + H4Time );
                       TotalMoney = TotalMoney - MoneyToBet;
                       System.out.println("You still have:" + TotalMoney);
                     
                     break;
                     
                     
                 
             }
                   case 3:
                       System.out.println("You have chosen Horse 3 and have placed " + MoneyToBet + " on this Horse");
                   if (H3Time < H1Time && H3Time < H2Time && H3Time < H4Time){
                       int QuarterMoney = MoneyToBet+ (MoneyToBet/4);
                        TotalMoney = TotalMoney + QuarterMoney;
                       System.out.println("Horse 3 has won the race"
                               + "You've now got:" + TotalMoney );
                   }
                   else{
                       System.out.println("You've lost"
                               +"Horse 1 time was: " + H1Time +
                               "Horse 2 time was: "+ H2Time +
                               "Horse 3 time was: " + H3Time +
                               "Horse 4 time was: " + H4Time );
                       TotalMoney = TotalMoney - MoneyToBet;
                       System.out.println("You still have:" + TotalMoney);
                 
                  
                  
                     break;
                     
                     
           
         }
                   case 4:
                     System.out.println("You have chosen Horse 4 and have placed " + MoneyToBet + " on this Horse");
                   if (H4Time < H1Time && H4Time < H2Time && H4Time < H3Time){
                       int QuarterMoney = MoneyToBet+ (MoneyToBet/10);
                        TotalMoney = TotalMoney + QuarterMoney;
                       System.out.println("Horse 4 has won the race"
                               + "You've now got:" + TotalMoney );
                   }
                   else{
                       System.out.println("You've lost"
                               +"Horse 1 time was: " + H1Time +
                               "Horse 2 time was: "+ H2Time +
                               "Horse 3 time was: " + H3Time +
                               "Horse 4 time was: " + H4Time );
                       TotalMoney = TotalMoney - MoneyToBet;
                       System.out.println("You still have:" + TotalMoney);
                     
                     break;
         
         }
         
     }
     
}
         else{
             System.out.println("Bye");
             System.exit(0);
}
}
     
     public static void Exit(){
         System.out.println("You have chosen to exit");
         System.exit(0);
     }
     
     public static void Roulette(){
         if (TotalMoney == 0){
             System.out.println("I'm feeling generous today have +10 money");
             TotalMoney = TotalMoney + 10;
         }
         int wheelnumW = rand.nextInt(18);
         int wheelnumR = rand.nextInt(18);
         System.out.println("The maximum number for both red and white numbers is 18 you can choose to bet on both colours or choose one");
         System.out.println("How much would you like to bet? you have: " + TotalMoney);
         int AmountToBet = input.nextInt();
         while(AmountToBet > TotalMoney || AmountToBet == 0){
             System.out.println("Please try again the bet placed was either too high or too low");
         }
         
             System.out.println("Would you like to place a bet on a white number (W) or (R) please note to play this game you must choose either red or white ");
             String QWhitenum = input.next();
             if (QWhitenum.equals("W")){
                 System.out.println("You can choose a number up to 18");
                 int choosewhite = input.nextInt();
                 while(choosewhite > 18 || choosewhite <=0){
                     System.out.println("Please try again the number inputted was either too high or too low");
                     choosewhite = input.nextInt();
                     if(choosewhite == wheelnumW){
                     TotalMoney = AmountToBet + (AmountToBet/2);
                     System.out.println("You have won the wheel you now have:" + TotalMoney);
                     System.out.println("If you wish to play this game again you must choose to do so on the main menu, this has been done to protect your Money");
                     
                 }
                 else{
                     System.out.println("You lost against the wheel you know have: " + TotalMoney);
                     System.out.println("If you wish to play this game again you must choose to do so on the main menu, this has been done to protect your Money");
                 }
                 }
                 
             }
             if(QWhitenum.equals("R")){
                 System.out.println("What would you like to place on a red number, up to 18");
                 int chooseRed = input.nextInt();
                 while(chooseRed > 18 || chooseRed <=0){
                     System.out.println("Please try again the number inputted was either too high or too low");
                     chooseRed = input.nextInt();
                 }
                 if(chooseRed == wheelnumR){
                     TotalMoney = AmountToBet + (AmountToBet/2);
                     System.out.println("You have won the wheel you now have:" + TotalMoney);
                 }
                 else{
                     System.out.println("You lost against the wheel you know have: " + TotalMoney);
                     System.out.println("If you wish to play this game again you must choose to do so on the main menu, this has been done to protect your Money");
                 }
             }
             
         }
     
     
     public static void HigherOrLower(){
         if (TotalMoney == 0){
             TotalMoney = TotalMoney + 10;
         }
         System.out.println("There are nine numbers you must choose if the next number is higher or lower /n +50% to your bet if you win");
         System.out.println("Would you like to play this game Y or N");
         String YorN = input.next();
         if (YorN.equals("Y")){
             System.out.println("How many goes would you like on this game");
             int goes = input.nextInt();
             try{
                 int x = 0;
             while(x<goes){
                 x=x+1;
                 int randnum = rand.nextInt(10);
                 int randnum2 = rand.nextInt(10);
             System.out.println("How much would you like to bet you have: " + TotalMoney);
             int MoneyToBet = input.nextInt();
             while(MoneyToBet>TotalMoney || MoneyToBet == 0 ){
                 System.out.println("The bet you placed is invalid try again you have: " +TotalMoney);
                 MoneyToBet = input.nextInt();
             }
             System.out.println("the first number is: " + randnum);
             System.out.println("Would you like to choose a number higher(H) or lower(L) to stop press S");
             String HorL = input.next();
             if (HorL.equals("H")){
                 if(randnum > randnum2){
                 System.out.println("You have chosen to guess for a higher number");
                     System.out.println("You were correct");
                     MoneyToBet = MoneyToBet/2;
                     TotalMoney = MoneyToBet + TotalMoney;
                }
                 else{
                     System.out.println("You have chosen to guess for a higher number");
                     System.out.println("You chose incorrectly the number was: " + randnum2);
                     TotalMoney = TotalMoney - MoneyToBet;
                 }
             }
             if(HorL.equals("L")){
                 if(randnum < randnum2){
                     TotalMoney = TotalMoney + MoneyToBet;
                 System.out.println("You have chosen to guess for a lower number");
                     System.out.println("You have won the round, you now have: " + TotalMoney + " money");
                 }
                 else{
                     System.out.println("You have chosen to guess for a lower number");
                     System.out.println("You chose incorrectly the number was:" + randnum2);
                     TotalMoney = TotalMoney - MoneyToBet;
                 }
             }
             if(HorL.equals("S")){
                 System.exit(0);
             }
             
             }
             
             }
             catch(Exception e){
                     System.out.println("Something went wrong here to continue playing please restart the game");
                     System.exit(0);
                     }
     


                  
         
            
}
          else{
             System.out.println("You have chosen to exit the game");
             System.exit(0);
         }
}
}