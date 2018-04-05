package com.company;

        public class Punkt {

           // Deklaracja masy punktu materialnego
            private float masa;

            // Konstruktor domyslny
            public Punkt()
    {
            this.masa=10F;
            }

            //Konstruktor z parametrami
            public Punkt(float masa)
    {
            this.masa=masa;
            }

            //Metoda liczaca glowny moment bezwladnosci
            double GlownyMoment()
    {
                return 0;
            }

            //Metoda liczaca moment bezwladnosci ze Steinera
            double MomentSteiner(float odleglosc)
    {
            return GlownyMoment() + masa*odleglosc*odleglosc;
            }

            //Metoda z opisem
            void Opis()
    {
                System.out.println("Punkt materialny ");
            }

            //Metoda wyswietlania parametrow
            void WyswPara()
    {
                System.out.println("Masa rowna sie: " + masa);
                System.out.println("Moment glowny rowna sie: " + GlownyMoment());
            }

            //Metoda zmiany masy
            void ZmienMase(float nowaMasa)
    {
                this.masa = nowaMasa;

                    }
}