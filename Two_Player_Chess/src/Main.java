/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author svg5502
 */
public class Main {
       
    
    public static void main(String[] args) {
        King whiteKing = new King("wKing", "White", 1);
        System.out.println(whiteKing.toString());
        
        Grid board = new Grid();
        board.drawGrid();
  
}
    //Created in iteration 1
}
