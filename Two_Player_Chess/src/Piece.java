/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guo
 */
public class Piece {
    private String id;
    private String color;
    //private int movement;

    public Piece(String id, String color, int movement) {
        this.id = id;
        this.color = color;
        //this.movement = movement;
    }

    public Piece() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //Created in iteration 1
 
}
