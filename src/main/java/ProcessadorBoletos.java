import entity.Boleto;
import entity.Fatura;
import entity.Pagamento;

import java.util.ArrayList;
import java.util.List;

public class ProcessadorBoletos {

    private List<Pagamento> processa(List<Boleto> boletos){
        List<Pagamento> pagamentos = new ArrayList<>();
        boletos.forEach( b ->{
            Pagamento pagamento = new Pagamento( b.getValorPago(), b.getData(), "BOLETO");
            pagamentos.add(pagamento);
        });
        return pagamentos;
    }

    private void valida(Fatura fatura, List<Pagamento> pagamentos) {
        double valorTotalPago = pagamentos.stream().map(Pagamento::getValorPago).reduce(0.0, Double::sum);
        fatura.setPaga(valorTotalPago >= fatura.getValorTotal());
    }

    public List<Pagamento> pagarFatura(Fatura fatura, List<Boleto> boletos){
        List<Pagamento> pagamentos = processa(boletos);
        valida(fatura, pagamentos);
        return pagamentos;
    }
}
