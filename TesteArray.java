package entidades;

public class TesteArray {
    public static void main(String[] args) {
        int[] v = {12, 56, 45, 78, 57, 89};
        
        // acessando uma posicao
        System.out.println(v[0]);
        //System.out.println(v[5]);
        System.out.println("tam array: "+v.length);
        
        // somar tds os valores
        int soma = 0;
        for (int i = 0; i < v.length; i++) {
            System.out.println("soma: "+soma+", i: "+i+", v[i]: "+v[i]);
            soma = soma + v[i];
        }
        System.out.println("soma final: "+soma); 
        
        // calcular a media
        System.out.println("media: "+ soma/v.length);
        
        int soma2 = 0;
        for (int aux : v) {
            System.out.println("soma2: "+soma2+", aux: "+aux);
            soma2 += aux;
        }
        System.out.println("media2: "+ soma2/v.length);
        
        // retornar o MAIOR
        
        // retornar o MENOR
    }
}
