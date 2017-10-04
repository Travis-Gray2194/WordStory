//Mad //input boxes and story
import java.util.Scanner;
public class WordStory { //begin class
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        //Strings for user to input
        String name, res,movie,music,nfl,comedian,car,crush,candy;
        int networth;
        System.out.println("Please type your name? ");
        name = keyboard.nextLine();

        System.out.println("Enter your favorite resturaunt name? ");
        res = keyboard.nextLine();

        System.out.println("Type in your favorite Movie? ");
        movie = keyboard.nextLine();

        System.out.println("Type in  your favorite Musicial Artist ");
        music = keyboard.nextLine();

        System.out.println("Type in favorite NFL Player? ");
        nfl = keyboard.nextLine();

        System.out.println("Type in your favorite comedian? ");
        comedian = keyboard.nextLine();

        System.out.println("Type in your dream car? ");
        car = keyboard.nextLine();

        System.out.println("Type in your celeberity crush? ");
        crush = keyboard.nextLine();

        System.out.println("Type in your favorite candy");
        candy = keyboard.nextLine();

        System.out.println("Type in your favorite celebrity net worth(number)");
        networth = keyboard.nextInt();


        System.out.println(name + " loves to eat steak " +" at "+res +"."+" After eating you walk around eventually finding a free movie ticket on the ground to "+movie+" " +
                " After watching the masterpiece film named "+movie+" You hear your phone ring it's an old friend from college who say's he has VIP tickets to a "+music+" concert!! ");
        System.out.println(" during the concert you  go back stage and you meet your favorite nfl player "+nfl+" and comedian "+comedian+" After the concert you become share deep stories and become close friends one of them ends up giving you the keys to a "+car+" .With you new found fame and status you run into! "+crush+" who ends up getting in the passenger seat!");
        System.out.println(" The chicken you ate earlier is making you want something sweet so you ask "+crush+"Lets go get"+candy+" You end up checking your phone again and see a message asking for you to ask you to make a charity donation"+"You ask your"+crush+"to donate to a charity with you care about how much do you both donate"+networth);

    }//end main

}//end class