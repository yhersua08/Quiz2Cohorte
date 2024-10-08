public class Alturas {
    public static void main(String[] args) {
        float[] alturas = new float[5];
        // Entrada de las alturas
        alturas[0] = 1.75f;
        alturas[1] = 1.60f;
        alturas[2] = 1.82f;
        alturas[3] = 1.90f;
        alturas[4] = 1.65f;
        // proceso para encontrar promedio
        float suma = 0;
        for (int i = 0; i &lt; alturas.length; i++) {
        suma += alturas[i];
        }
        float promedio = suma / alturas.length;
        int masAltas = 0;
        int masBajas = 0;
        // proceso donde se define cuantas personas son mas altas que el promedio
        for (int i = 0; i &lt; alturas.length; i++) {
        if (alturas[i] &gt; promedio) {
        masAltas++;
        } else if (alturas[i] &lt; promedio) {
        masBajas++;
        }
        // Imprimir resultados
        }
        System.out.println(&quot;Promedio de alturas: &quot; + promedio + &quot; metros&quot;);
        }