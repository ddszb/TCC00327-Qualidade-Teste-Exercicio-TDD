import entity.Boleto;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ProcessadorBoletosTest {

    @Test
    public void test(){
        ProcessadorBoletos pb = new ProcessadorBoletos();
        List<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto());
        Assert.assertNotNull( pb.processa(boletos));

    }
}
