import entity.Boleto;
import entity.Fatura;
import entity.Pagamento;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ProcessadorBoletosTest {

    @Test
    public void testeCriarPagamentosDeBoletos(){
        ProcessadorBoletos pb = new ProcessadorBoletos();
        List<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto(1, Calendar.getInstance(), 130.0));
        Assert.assertNotNull( pb.pagarFatura(new Fatura(), boletos));

    }

    @Test
    public void testeValidaFaturaPaga(){
        ProcessadorBoletos pb = new ProcessadorBoletos();
        Fatura fatura = new Fatura(Calendar.getInstance(), "José", 130, false);
        List<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto(1, Calendar.getInstance(), 130.0));

        List<Pagamento> pagamentos = pb.pagarFatura(fatura, boletos);

        Assert.assertTrue(fatura.isPaga());
        Assert.assertEquals(1, pagamentos.size());
    }

    @Test
    public void testeValidaFaturaNaoPaga(){
        ProcessadorBoletos pb = new ProcessadorBoletos();
        Fatura fatura = new Fatura(Calendar.getInstance(), "José", 1130, false);
        List<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto(1, Calendar.getInstance(), 130.0));
        boletos.add(new Boleto(2, Calendar.getInstance(), 430.0));

        List<Pagamento> pagamentos = pb.pagarFatura(fatura, boletos);

        Assert.assertFalse(fatura.isPaga());
        Assert.assertEquals(2, pagamentos.size());
    }
}
