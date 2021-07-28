package modulo_data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

	
	public static void main(String[] args) throws ParseException {
		/*Calendar calendar = Calendar.getInstance();
		Date date = new Date();
		
		System.out.println("Dia da semana: " +date.getDay());
		System.out.println("Calendar Dia da semana: " +(calendar.get(Calendar.DAY_OF_WEEK)-1));
		System.out.println("Dia do mês: " +date.getDate());
		System.out.println("Calendar Dia do mês: " +calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("Mês do ano: " +date.getMonth());
		System.out.println("Calendar Mês do ano: " +calendar.get(Calendar.MONTH));
		System.out.println("Hora do dia: " +date.getHours());
		System.out.println("Calendar Hora do dia: " +calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minuto da hora: " +date.getMinutes());
		System.out.println("Calendar Minuto da hora: " +calendar.get(Calendar.MINUTE));
		System.out.println("Segundo do minuto: " +date.getSeconds());
		System.out.println("Calendar Segundo do minuto: " +calendar.get(Calendar.SECOND));
		System.out.println("Ano: " +(date.getYear() + 1900));
		System.out.println("Calendar Ano: " +calendar.get(Calendar.YEAR));
		
		System.out.println("---------------------");
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Data formatada "+dataFormatada.format(date));
		System.out.println("Calendar Data formatada "+dataFormatada.format(calendar.getTime()));
		dataFormatada = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println("Data formatada para banco de dados "+dataFormatada.format(date));
		
		--------------------------------- aula de comparacao ------------------
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = dataFormatada.parse("15/07/2021");
		
		Date dataHoje = dataFormatada.parse("15/07/2021");
		
		if(dataVencimentoBoleto.after(dataHoje)) {// se data vencimnto é maior que hoje
			System.out.println("Boleto não Vencido");
		} else {
			System.out.println("Boleto Vencido");
		}
		 ------------------- Aula calculo de dias -----------------------------
		Calendar calendar = Calendar.getInstance();
		
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("15-07-2021"));
		
		calendar.add(Calendar.DAY_OF_MONTH, 3); // adicionando valor no dia do mês
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		
		calendar.add(Calendar.MONTH, 2); // adicionando valor no mês do ano
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		//Date dataPassada = new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2021");
		long diasEntre = ChronoUnit.YEARS.between(LocalDate.parse("2021-02-01"), LocalDate.now());
		
		System.out.println("Dias : " + diasEntre);*/
		
		Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("15/07/2021");
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInicial);
		
		for(int parcela = 1; parcela <=12; parcela++) {
			calendar.add(Calendar.MONTH, 1);
			System.out.println("A " + parcela +"º tem vencimento em " + new SimpleDateFormat("dd/MM/yyy").format(calendar.getTime()));
		}
	}
}
