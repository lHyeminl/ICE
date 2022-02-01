/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dancye, 2019
 * 
 * 
 * ICE1: Feb 1, 2022
 * Name: Hye Min Jo (Hyemin Jo)
 * ID: 991660035
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
        
        Card game = new Card("Select",10);
        game.setSuit("Hearts");
    }
}
