package com.company;


        public class Main {

            public static void main(String[] args) {

                        //1
                                Punkt punkt1 = new Punkt();
                //2
                        Punkt punkt2 = new Punkt(5F);
                //3
                        punkt1.WyswPara();
                System.out.println("Steiner dla punktu 1: " + punkt1.MomentSteiner(5f));
                punkt2.WyswPara();
                System.out.println("Steiner dla punktu 2: " + punkt2.MomentSteiner(5f));
                //4
                        punkt1.ZmienMase(10F);
                //5
                        punkt1.WyswPara();
                System.out.println("Steiner dla punktu 1: " + punkt1.MomentSteiner(5f));
                //6
                        Punkt[] punkt = new Punkt[4];
                for (int i=0; i<punkt.length; i++)
                    {
                                punkt[i] = new Punkt(i+1);
                }
                //7
                        //zmienna do iterowania po tablicy
                                int x=0;

                        for (Punkt punkcik:punkt)
                    {
                             punkcik.WyswPara();
                 System.out.println("Steiner dla punktu o numerze: " + x + " rowna sie : " + punkcik.MomentSteiner(5f));
                 x++;
                }
            }
}