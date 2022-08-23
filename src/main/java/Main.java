import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * @author WGomes
 * @since Release 1.0
 * Classe Principal responsável pela inicialização dos demais membros
 */
public class Main {
    public static void main(String args[]) {

        // criar um metodo que receba uma string e ao executar o metodo escreva a frase na tela
        //escreverEmTela("Renan");
//        somar(10, 5);
//        somar(50, 15);
//        somar(32, 18);

        /**
         * Atributo do tipo double com valor Constante
         */


        /**
         * Lista com a invocação de todos os métodos e suas respectivas variáveis entre parênteses
         */
        String soma = somarComRetorno(new BigDecimal(5), new BigDecimal(5));
        System.out.println(soma);

        String mult = multiplicarComRetorno(new BigDecimal(10), new BigDecimal(-10));
        System.out.println(mult);

        String div = dividirComRetorno(new BigDecimal(15), new BigDecimal(5));
        System.out.println(div);

        String sub = subtrairComRetorno(new BigDecimal(100), new BigDecimal(30));
        System.out.println(sub);

        String area = calcularCirculo(new BigDecimal(10), new BigDecimal(Math.PI));
        System.out.println(area);

        String per = calcularPerimetro(new BigDecimal(8), new BigDecimal(Math.PI));
        System.out.println(per);

        String cone = calcularCone( new BigDecimal(3), new BigDecimal(6), new BigDecimal(Math.PI));
        System.out.println(cone);

        String hip2 = pitagoras(new BigDecimal("2"), new BigDecimal("2.3"));
        System.out.println(hip2);

        Boolean par = parOuImpar(11);
        if (par == true) {
            System.out.println("Seu Número é par ");
        }else {
            System.out.println("Seu número é impar");
        }
    }
    /**
     * Método para imprimir a variável "frase" na tela.
     * @param frase
     */
    public static void escreverEmTela(String frase) {
        System.out.println(frase);
        System.out.println();

    }

    /**
     *  Método que calcula a soma das variáveis X e Y
     * @param x
     * @param y
     * @return String - Frase concatenada com o valor da soma
     */
    public static String somarComRetorno(BigDecimal x, BigDecimal y) {
        return "O resultado da soma é " + x.add(y);
    }

    /**
     * Método que calcula a multiplicação das variáveis X e Y
     * @param x
     * @param y
     * @return String - Frase concatenada com o valor da multiplicação
     */
    public static String multiplicarComRetorno(BigDecimal x, BigDecimal y) {
        return "O resultado da multiplicação é  " + x.multiply(y);
    }

    /**
     * Método que calcula a divisão das variáveis X e Y
     * @param x
     * @param y
     * @return String - Frase de alerta caso o valor não seja aceito e Frase concatenada com o valor da divisão
     */
    public static String dividirComRetorno( BigDecimal x, BigDecimal y) {
        if (y.compareTo(BigDecimal.ZERO) <= 0) {
            return "O valor raio não pode ser igual ou menor do que zero";
        }
        return "O resulado da divisão é  " + x.divide(y);
    }

    /**
     * Método que calcula a subtração das variáveis X e Y
     * @param x
     * @param y
     * @return String - Frase concatenada com o valor da subtração
     */
    public static String subtrairComRetorno(BigDecimal x, BigDecimal y) {

        return "O resultado da subtração é  " + x.subtract(y);
    }

    /**
     * Método que calcula a área de um círculo com base no valor de seu Raio contendo um método que retorna o resultado
     * formatado para devolver com duas casas após a vírgula
     * @param raio
     * @param pi
     * @return String - Frase de alerta caso o valor não seja aceito e frase concatenada com o valor do cálculo
     */
    public static String calcularCirculo(BigDecimal raio, BigDecimal pi) {
        NumberFormat format = new DecimalFormat("#0.00");
        if (raio.compareTo(BigDecimal.ZERO) <= 0  ) {
            return "O valor raio não pode ser igual ou menor do que zero";
        }
        return "A área do circulo é " + String.format("%.2f", pi.multiply(raio.multiply(raio)));
    }

    /**
     * Método que calcula o perímetro de um círculo com base no valor de seu Raio contendo um método que retorna o resultado
     * formatado para devolver com duas casas após a vírgula
     * @param raio
     * @param pi
     * @return String - Frase de alerta caso o valor não seja aceito e frase concatenada com o valor do cálculo
     */
    public static String calcularPerimetro(BigDecimal raio, BigDecimal pi) {
        NumberFormat format = new DecimalFormat("#0.00");
        if (raio.compareTo(BigDecimal.ZERO) <= 0  ) {
            return "O valor raio não pode ser igual ou menor do que zero";
        }
        return "O perimetro do círculo é de  " + String.format("%.2f", pi.multiply(raio.multiply(raio)));
    }

    /**
     * Método que calcula a área de um cone com base no valor de seu Raio contendo um método que retorna o resultado
     * formatado para devolver com duas casas após a vírgula
     * @param raio
     * @param altura
     * @param pi
     * @return String - Frase de alerta caso o valor não seja aceito e frase concatenada com o valor do cálculo
     */
    public static String calcularCone(BigDecimal raio, BigDecimal altura, BigDecimal pi) {
        //NumberFormat format = new DecimalFormat("#0.00");
        BigDecimal vezes2 = new BigDecimal(2);
        BigDecimal div3 = new BigDecimal(3);


        if (raio.compareTo(BigDecimal.ZERO) <= 0  ) {
            return "O valor raio não pode ser igual ou menor do que zero";
        }

        var piRaio = pi.multiply(raio);
        var piAlt = pi.multiply(altura);
        var raioXAlt = piRaio.multiply(piAlt);
        var x2 = raioXAlt.multiply(vezes2);
        var result = x2.divide(div3).setScale(2,RoundingMode.UP);
        return "A area do Cone é  " + result;
                //(pi* raio * 2 * pi * altura / 3);
    }

    /**
     * Método que calcula o tamanho da hipotenusa com base no valor de seus catetos, contendo um método que retorna o resultado
     * formatado para devolver com duas casas após a vírgula
     * @param cat1
     * @param cat2
     * @return String - Frase de alerta caso o valor não seja aceito e frase concatenada com o valor do cálculo
     */
    public static String pitagoras(BigDecimal cat1, BigDecimal cat2) {

        if (cat1.compareTo(BigDecimal.ZERO) <= 0 || (cat2.compareTo(BigDecimal.ZERO) <= 0 ))  {
            return "O valor do cateto não pode ser igual ou menor do que zero";

        }
        MathContext mc = new MathContext(10);
        var quadradoCat1 = cat1.pow(2);
        var quadradoCat2 = cat2.pow(2);
        var somaCats = quadradoCat1.add(quadradoCat2);
        var result = somaCats.sqrt(mc);
        return "O valor da hipotenusa é " +  String.format("%.2f", result);

        //Math.sqrt((cat1 * cat1) + (cat2 * cat2)))
    }

    /**
     * Método que retorna se o valor da variável X é par ou ímpar
     * @param x
     * @return String - Frase indicando se o valor é par ou ímpar
     */
    public static Boolean parOuImpar(Integer x) {
        if (x % 2 == 0) {
           return true;
        }
           return false;
    }

}
