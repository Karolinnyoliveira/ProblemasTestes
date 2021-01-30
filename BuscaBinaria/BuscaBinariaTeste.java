import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BuscaBinariaTeste {
  
  @Test
  public void primeiraPosicao() {
    BuscaBinaria buscaBinaria = new BuscaBinaria();

    int[] array = {4,9,36,85,96};
    int chave = 4;

    assertEquals(0, buscaBinaria.busca(array, chave), 0.001);
  } 

  @Test
  public void posicaodoMeio() {
    BuscaBinaria buscaBinaria = new BuscaBinaria();

    int[] array = {4,9,36,85,96};
    int chave = 36;

    assertEquals(2, buscaBinaria.busca(array, chave), 0.001);
  } 

  @Test
  public void ultimaPosicao() {
    BuscaBinaria buscaBinaria = new BuscaBinaria();

    int[] array = {4,9,36,85,96};
    int chave = 96;

    assertEquals(4, buscaBinaria.busca(array, chave), 0.001);
  } 


  @Test
  public void numeromenorqueaprimeiraposicaoArray() {
    BuscaBinaria buscaBinaria = new BuscaBinaria();

    int[] array = {4,9,36,85,96};
    int chave = 2;

    assertEquals(-1, buscaBinaria.busca(array, chave), 0.001);
  } 

  @Test
  public void numforadoArray() {
    BuscaBinaria buscaBinaria = new BuscaBinaria();

    int[] array = {4,9,36,85,96};
    int chave = 8;

    assertEquals(-1, buscaBinaria.busca(array, chave), 0.001);
  } 

}

