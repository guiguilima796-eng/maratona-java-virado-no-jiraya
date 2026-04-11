public class EstruturaDeReepetico {
    //dado um valor de um carro descubra em quantas vezes ele pode ser parcelado
    //condição:parcela >=1000
    public static void main(String[] args) {
        double valorCarro=50000;
        for(int parcela = 1;parcela <=valorCarro;parcela++){
            double valorparcela = valorCarro/ parcela;
            if (valorparcela < 1000) {
                break;
            }
            System.out.println("Parcela "+parcela+"x valor ="+valorparcela);
            
        }
    }
}
