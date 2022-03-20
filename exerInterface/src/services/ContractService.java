package services;

import entities.Contract;
import entities.Intallment;
import java.util.Calendar;
import java.util.Date;

public class ContractService {

	//declarar o tipo de interface
	private OnlinePaymentService onlinePaymentService;

	//implementa a injecao de dependencia, atraves do contrutor
	public ContractService(OnlinePaymentService onlinePaymentService){
		this.onlinePaymentService = onlinePaymentService;
	}

	//responsavel instanciar dentro do contrato os objetos que sao as parcelas do contrato
	public void processContract(Contract contract, int months){
		double basicQuota = contract.getTotalValue() / months;
		//basicQuota = 200
		for (int i = 1; i <= months; i++) {
			double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
			//updateQuota = 202

			//valor a ser pago na parcela de numero i
			double fullCota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);

			//data de vencimento do contrato
			Date dueDate = addMonths(contract.getDate(), i);
			contract.getIntallments().add(new Intallment(dueDate, fullCota));
		}
	}

	private Date addMonths(Date date, int n){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, n);
		return calendar.getTime();
	}
}
