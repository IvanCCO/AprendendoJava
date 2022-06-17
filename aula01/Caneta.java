  
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

          if(this.tampada == true){

            System.out.println("Você pode Rabiscar");

          }else{

            System.out.println("Você não pode Rabiscar");
          }

          

        }

        void tampar(){

          String array_cor[] =
          {"Verde","Preto","Roxo","Azul-Claro","Marrom"};
        
          System.out.println(this.modelo.length());

            for(int i = 0; i < array_cor.length ; i++){

              this.cor = array_cor[i];

              System.out.println("A caneta está na cor: " + this.cor);

              if(this.cor == "Marrom"){

                System.out.println("Deu certo Uhull!!");
              }
        
          }
        }

        void destampar(){


        }
    }