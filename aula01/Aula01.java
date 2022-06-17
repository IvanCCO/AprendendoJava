

public class Aula01 {
    
    public static void main(String [] args) {
        
        Caneta c1 = new Caneta();

        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.modelo = "Bic 2080";
        c1.tampada = true;
        c1.status();
        c1.tampar();
    }
}
