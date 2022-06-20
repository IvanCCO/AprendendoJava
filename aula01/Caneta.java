import java.text.Format;
import java.util.Scanner;

//https://azure-samples.github.io/raspberry-pi-web-simulator/#getstarted

class Caneta {

  String modelo;
  String cor;
  float ponta;
  int carga;
  boolean tampada;

  void status() {

  }

  void rabiscar() {

   

  }

  void tampar() {

    String array_cor[] = { "Verde", "Preto", "Roxo", "Azul-Claro", "Marrom" };

    for (int i = 0; i < array_cor.length; i++) {

      this.cor = array_cor[i];

      if (this.cor == "Preto") {

        try (Scanner ColorObj = new Scanner(System.in)) {
          int volta = 1;

          String array_resposta[] = {
              "y", "Y", "n", "N"
          };

          for (int j = 0; j < volta; j++) {

            System.out.println("Você gosta da cor Preto? \n Digite Y ou N");

            String likedColor = ColorObj.nextLine();


            //System.out.println(likedColor == array_resposta[j]);

            //System.out.println("likedColor é " + likedColor + " E o tipo é: " + likedColor.getClass());
            
  

            for (int k = 0; k < array_resposta.length; k++) {

             // System.out.println(array_resposta[k].getClass());

              if (likedColor == array_resposta[k]) {

                System.out.println("Entrou no Certo");
              } else if (likedColor.isEmpty()) {
                volta++;
              } else {

                volta++;

              }
            }

          }
        }

      }
    }
  }
}
