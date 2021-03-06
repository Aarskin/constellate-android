package com.example.matthew.constellate;

import com.badlogic.gdx.math.Vector3;

/**
 * Created by Matthew on 5/7/2015.
 */
public class StarPair
{
    public int star1, star2;
    public Vector3 v1, v2;

    public StarPair(){
        star1 = -1;
        star2 = -1;
        v1 = new Vector3();
        v2 = new Vector3();
    }

    public StarPair(int s1, int s2)
    {
        star1 = s1;
        star2 = s2;
    }

    public StarPair(int s1, int s2, Vector3 va, Vector3 vb)
    {
        star1 = s1;
        star2 = s2;
        v1 = va;
        v2 = vb;
    }

    @Override
    public String toString()
    {
        return "ID!: " + star1 +" | ID@: " + star2
                + "\nV!: " + v1
                + "\nV@: " + v2;
    }
}
