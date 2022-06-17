  
  package aula01;
  
  class Caneta{

        String modelo;
        String cor;
        float ponta;
        int carga;
        boolean tampada;
        void status(){

          System.out.println("Uma caneta " + this.cor);
          System.out.println("Esta tampada?: " + this.tampada);
        }
        void rabiscar(){

          tampada = false;

          

        }

        void tampar(){



        }

        void destampar(){


        }
    }