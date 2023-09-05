import java.util.Scanner;

class Faz_L{
	public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

 	float km1,km2,quilometragem,autonomia;
	float consumo,capacidade,litro;
    float viagem_valor,gasolina_valor;

    System.out.println("digite onde o odometro marcou no inicio: ");
    km1 = sc.nextFloat();
    System.out.println("digite onde ele marcou depois desta viagem:");
    km2 = sc.nextFloat();
    System.out.println("digite quantos litros foram gastos:");
    litro = sc.nextFloat();
    System.out.println("digite o valor atual da gasolina:");
    gasolina_valor = sc.nextFloat();
    System.out.println("digite a capacidade do tanque:");
    capacidade = sc.nextFloat();

    quilometragem = km2 - km1;
    consumo = quilometragem/litro;
    viagem_valor = litro * gasolina_valor;
    autonomia = consumo * capacidade;

    System.out.println("quilometragem:"+ quilometragem);
    System.out.println("consumo:" + consumo);
    System.out.println("custo da viagem:" + viagem_valor);
    System.out.println("autonomia do veiculo:" + autonomia );



	}

}