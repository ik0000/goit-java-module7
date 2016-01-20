package com.goit.Module7;

import java.util.HashMap;
import java.util.Scanner;

public class CalcRunner {
    public static void main(String[] args) {
        System.out.println("Welcome to Calc!");
        System.out.println("You can choose General or Scientific view");
        System.out.println("Enter 'switch' to switch between views ");
        System.out.println("You are in General view");
        System.out.println("Enter desired equation, 'switch' or 'q' to exit");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        switch (st) {
            case "q":
                System.out.println("Thank you for NOT using calc");
                 break;
            case "switch":
                System.out.println("You are in Engineering mode now:");
                System.out.println("Enter the equation:");
                st = sc.nextLine();
                break;
            default:

                break;
        }
        String[] formulas  = new String[] {st};

        MatchParser p = new MatchParser();
        p.setVariable("X", 3.0 );
        for( int i = 0; i < formulas.length; i++){
            try{
                System.out.println( formulas[i] + "=" + p.Parse( formulas[i] ) );
            }catch(Exception e){
                System.err.println( "Error while parsing '"+formulas[i]+"' with message: " + e.getMessage() );
            }
        }
    }
    }

