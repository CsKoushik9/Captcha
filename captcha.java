/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.captcha;

import java.util.Random;

/**
 *
 * @author Cs Koushik
 */
public class captcha 
{
    public String cap()
    {
        int i='Z';
        int l=1;
        int k=1;
        String s="";
        Random r=new Random();
        while(l<=3 || k<3)
        {
            int c=r.nextInt(i);
            if(c>'A'&& c<='Z')
            {
                s+=(char)c;
                l++;
            }
            else if(k<3)
            {
                s+=String.valueOf(r.nextInt(9));
                k++;
            }
        }
        return s;
    }
    
}
