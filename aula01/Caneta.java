import java.util.Scanner;

class Caneta {

  String modelo;
  String cor;
  float ponta;
  int carga;
  boolean tampada;

  void status() {

    System.out.println("Uma caneta " + this.cor);
    System.out.println("Esta tampada?: " + this.tampada);
  }

  void rabiscar() {

    if (this.tampada == true) {

      System.out.println("Você pode Rabiscar");

    } else {

      System.out.println("Você não pode Rabiscar");
    }

  }

  void tampar() {

    String array_cor[] = { "Verde", "Preto", "Roxo", "Azul-Claro", "Marrom" };

    System.out.println(this.modelo.length());

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

            System.out.println("likedColor é " + likedColor);

            for (int k = 0; k < array_resposta.length; k++) {

              if(likedColor == array_resposta[k]){

                System.out.println("Entrou no Certo");
              }else if(likedColor.isEmpty()){

                System.out.println("Digite valores validos");
                System.out.println(j); 
              }else{

                System.out.println("SCORORR");
              }
            }

          }
        }

      }
    }
  }
}
