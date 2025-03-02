public class Operadores {

  public static void main(String[] args) {
    
    //String nomeCompleto = "LINGUAGEM" + "JAVA";

    /*String concatenacao = "?";

    concatenacao = 1+1+1+"1";
    System.out.println(concatenacao);

    concatenacao = 1+"1"+1+1;
    System.out.println(concatenacao);

    concatenacao = 1+"1"+1+"1";
    System.out.println(concatenacao);

    concatenacao = "1"+1+1+1;
    System.out.println(concatenacao);

    concatenacao = "1"+(1+1+1);
    System.out.println(concatenacao);

    int numero = 5;
    System.out.println(- numero);

    System.out.println(numero);

    numero = - numero;
    System.out.println(numero);

    numero = + numero;
    System.out.println(numero);

    numero = numero * -1;
    System.out.println(numero);

    int numero = 5;    
    System.out.println(++numero);
    System.out.println(numero);
    int num = ++numero;
    System.out.println(num++);
    System.out.println(num);

    int a, b;
    a = 5;
    b = 7;

    String resultado = a==b ? "Verdadeiro" : "Falso";

    System.out.println(resultado);

    int resultadoNovo = a==b ? 1 : 0;

    System.out.println(resultadoNovo);

    int numero1 = 1;
    int numero2 = 2;
    Boolean simNao = numero1 == numero2;

    System.out.println(simNao);

    if(numero1 == numero2){
      System.out.println("a nossa condição é verdadeira");
    }

    System.out.println("numero1 é diferente de numero2? " + (numero1 != numero2));
    System.out.println("numero1 é menor que numero2? " + (numero1 < numero2));

    String nomeUm = "LUIZ";
    String nomeDois = new String("LUIZ");
    System.out.println("NomeUm é igual a nomeDois? " + (nomeUm.equals(nomeDois)));*/

    boolean condicaoUm = true;
    boolean condicaoDois = false;

    if(condicaoUm && (7 > 4)){
      System.out.println("as duas condições são verdadeiras");
    }
    else if(condicaoUm || condicaoDois){
      System.out.println("uma das condições é verdadeira");
    }else{
      System.out.println("as duas condições são falsas");
    }

  }
  
}
