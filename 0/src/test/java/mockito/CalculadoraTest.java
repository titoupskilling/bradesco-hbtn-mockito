package test.java.mockito;

import main.java.mockito.Calculadora;

@RunWith(MockitoJUnitRunner.class)
public class CalculadoraTest {
    @Mock
    private Calculadora calculadora;

    @Test
    public void verificaSeSomaIgualA5() {

        when(calculadora.somar(2, 3)).thenReturn(5);

        int ret = calculadora.somar(2, 3);
        assertEquals(ret, 5);
        verify(calculadora).somar(2, 3);
    }
}
