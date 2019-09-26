/*
Aim: WAP that will be help people who are going on vacation. program should be calculate total required sum of money.
     duration in days
     toatal food cost per a day
     one way flight cost
     cost of one night in a hotel(numer of nights equal duration minus one).
 */

package Goodrestonvacation;
import java.util.Scanner;
import java.lang.Integer;
public class Goodrest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int days = Integer.parseInt(in.next());
        int foodcost = Integer.parseInt(in.next());
        int onewayflightcost = Integer.parseInt(in.next());
        int hotelcost = Integer.parseInt(in.next());
        int sum = days*foodcost + 2*onewayflightcost+6*hotelcost;
        System.out.println("Total money which spend going on vacation :"+sum);

    }

}
