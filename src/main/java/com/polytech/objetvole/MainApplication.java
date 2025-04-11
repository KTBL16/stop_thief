package com.polytech.objetvole;

import com.polytech.objetvole.service.OrdinateurService;
import com.polytech.objetvole.service.PortableService;

import java.util.Scanner;

public class MainApplication
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        OrdinateurService ordinateur = new OrdinateurService();
        PortableService portable = new PortableService();

        System.out.println("que voulez vous enregistrer :\n 1-portable\n2-ordinateur");
        int choice = input.nextInt();
        if(choice == 1)
        {
            portable.declarerObjetVole();
        }else
        {
            ordinateur.declarerObjetVole();
        }


    }
}
