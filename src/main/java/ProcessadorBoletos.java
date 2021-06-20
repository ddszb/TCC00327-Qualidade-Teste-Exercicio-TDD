import entity.Boleto;
import entity.Pagamento;

import java.util.ArrayList;
import java.util.List;

public class ProcessadorBoletos {

    public List<Pagamento> processa(List<Boleto> boletos){
        List<Pagamento> pagamentos = new ArrayList<>();
        boletos.forEach( b ->{
            Pagamento pagamento = new Pagamento( b.getValorPago(), b.getData(), "BOLETO");
            pagamentos.add(pagamento);
        });
        return pagamentos;
    }
}
